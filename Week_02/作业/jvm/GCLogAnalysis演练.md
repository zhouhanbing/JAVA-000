512M

串行GC

java -XX:+UseSerialGC -Xms512m -Xmx512m -Xloggc:gc.demo.log1 -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis

![image-20201028231526991](/Users/zhouhanbing/Library/Application Support/typora-user-images/image-20201028231526991.png)

并行GC

java -XX:+UseParallelGC -Xms512m -Xmx512m -Xloggc:gc.demo.log2 -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis

![image-20201028231804768](/Users/zhouhanbing/Library/Application Support/typora-user-images/image-20201028231804768.png)

GMS GC

java -XX:+UseConcMarkSweepGC -Xms512m -Xmx512m -Xloggc:gc.demo.log3 -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis

![image-20201028231842262](/Users/zhouhanbing/Library/Application Support/typora-user-images/image-20201028231842262.png)

G1 GC

java -XX:+UseG1GC -Xms512m -Xmx512m -Xloggc:gc.demo.log4 -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis

![image-20201028232639204](/Users/zhouhanbing/Library/Application Support/typora-user-images/image-20201028232639204.png)



替换堆大小 4G 4096M

java -XX:+UseSerialGC -Xms4096m -Xmx4096m -Xloggc:gc.demo.log5 -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis

![image-20201028233352612](/Users/zhouhanbing/Library/Application Support/typora-user-images/image-20201028233352612.png)

并行GC

java -XX:+UseParallelGC -Xms4096m -Xmx4096m -Xloggc:gc.demo.log6 -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis

![image-20201028233422379](/Users/zhouhanbing/Library/Application Support/typora-user-images/image-20201028233422379.png)

GMS GC

java -XX:+UseConcMarkSweepGC -Xms4096m -Xmx4096m -Xloggc:gc.demo.log7 -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis

![image-20201028233451926](/Users/zhouhanbing/Library/Application Support/typora-user-images/image-20201028233451926.png)

G1 GC

java -XX:+UseG1GC -Xms4096m -Xmx4096m -Xloggc:gc.demo.log8 -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis

![image-20201028233530440](/Users/zhouhanbing/Library/Application Support/typora-user-images/image-20201028233530440.png)

