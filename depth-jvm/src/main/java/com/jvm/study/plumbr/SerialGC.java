package com.jvm.study.plumbr;

/**
 * https://github.com/cncounter/gc-handbook/blob/master/04_GC_Algorithms_Implementations.md
 * <p>
 * 可以从上面的日志片段了解到, 在GC事件中,JVM 的内存使用情况发生了怎样的变化。
 * 此次垃圾收集之前, 堆内存总的使用量为 1,619,346K。其中,年轻代使用了 629,119K。可以算出,老年代使用量为 990,227K。
 * <p>
 * 更重要的信息蕴含在下一批数字中, 垃圾收集之后, 年轻代的使用量减少了 559,231K,
 * 但堆内存的总体使用量只下降了 346,099K。 从中可以算出,有 213,132K 的对象从年轻代提升到了老年代。
 * <p>
 * 最好的学习方式。结合代码学习。培养对代码感觉
 * 学习优秀代码。学习官方代码。
 * <p>
 * 同时对年轻代和老年代生效
 * <p>
 * -XX:+UseSerialGC -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps
 */
public class SerialGC {
    public static void main(String[] args) {
        System.out.println();
    }
}
