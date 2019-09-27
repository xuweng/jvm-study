package com.jvm.study.three.two;

/**
 * -XX:+PrintGC 输出简要GC日志
 * -XX:+PrintGCDetails 输出详细GC日志
 * -Xloggc:gc.log  输出GC日志到文件
 * -XX:+PrintGCTimeStamps 输出GC的时间戳（以JVM启动到当期的总时长的时间戳形式）
 * -XX:+PrintGCDateStamps 输出GC的时间戳（以日期的形式，如 2013-05-04T21:53:59.234+0800）
 * -XX:+PrintHeapAtGC 在进行GC的前后打印出堆的信息
 * -verbose:gc
 * -XX:+PrintReferenceGC 打印年轻代各个引用的数量以及时长
 * <p>
 * testGC()方法执行后，objA和objB会不会被GC呢？
 * <p>
 * VM Args：-XX:+PrintGCDetails -Xloggc:gc.log -XX:+PrintGCTimeStamps -XX:+PrintReferenceGC
 *
 * @author zzm
 */
public class ReferenceCountingGC {

    public Object instance = null;

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        testGC();
    }

    /**
     * 这个成员属性的唯一意义就是占点内存，以便在能在GC日志中看清楚是否有回收过
     */
    private byte[] bigSize = new byte[2 * _1MB];

    public static void testGC() {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        // 假设在这行发生GC，objA和objB是否能被回收？
        System.gc();
    }
}


