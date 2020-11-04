package io.github.kimmking.gateway.filter;

import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.*;

import static io.netty.handler.codec.http.HttpResponseStatus.NO_CONTENT;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;
import static io.netty.handler.codec.http.HttpResponseStatus.METHOD_NOT_ALLOWED;

/**
 * @author zhouhanbing
 * @description: Http请求过滤器
 * @date 2020/11/4 8:14
 */
public class HttpMethodRequestFilter implements HttpRequestFilter {

    /**
     * 过滤post请求
     * @param fullRequest
     * @param ctx
     */
    @Override
    public void filter(FullHttpRequest fullRequest, ChannelHandlerContext ctx) {
        HttpMethod method = fullRequest.method();

        if (method.equals(HttpMethod.GET)) {
            FullHttpResponse response = null;
            try {
                response = new DefaultFullHttpResponse(HTTP_1_1, METHOD_NOT_ALLOWED);
            } catch (Exception e) {
                e.printStackTrace();
                response = new DefaultFullHttpResponse(HTTP_1_1, NO_CONTENT);
            } finally {
                if (!HttpUtil.isKeepAlive(fullRequest)) {
                    ctx.write(response).addListener(ChannelFutureListener.CLOSE);
                } else {
                    ctx.write(response);
                }
                ctx.flush();
                ctx.close();
            }
        }
    }
}
