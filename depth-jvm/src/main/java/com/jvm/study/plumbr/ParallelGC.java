package com.jvm.study.plumbr;

/**
 * 并行GC
 * <p>
 * 并行垃圾收集器这一类组合,
 * 在年轻代使用 标记-复制(mark-copy)算法,
 * 在老年代使用 标记-清除-整理(mark-sweep-compact)算法。
 * 年轻代和老年代的垃圾回收都会触发STW事件,
 * 暂停所有的应用线程来执行垃圾收集。两者在执行 标记和 复制/整理阶段时都使用多个线程, 因此得名“(Parallel)”。
 * 通过并行执行, 使得GC时间大幅减少。
 * <p>
 * stw-----需要暂停运用线程。但是垃圾收集线程使用多线程。
 * <p>
 * 并行垃圾收集器适用于多核服务器,主要目标是增加吞吐量。因为对系统资源的有效使用,能达到更高的吞吐量:
 * <p>
 * 运用线程stw，与gc线程分开运行。gc结束后，运用线程开始运行。gc线程没有占有运用线程，没有占有cpu资源。
 * 运用线程的数量没有减少，吞吐量没有下降。
 * <p>
 * 能使用的运用线程越多，吞吐量越大。吞吐量和用户线程成正比。
 * <p>
 * Full GC表明本次清理的是年轻代和老年代
 * <p>
 * 在GC事件中 Metaspace 里面没有回收任何对象。
 * <p>
 * 同样,Full GC和 Minor GC 的区别是很明显的 —— 在此次GC事件中, 除了年轻代, 还清理了老年代和 Metaspace
 * Full GC清理整个堆
 * <p>
 * -XX:ParallelGCThreads=NNN -XX:+UseParallelGC -XX:+UseParallelOldGC
 */
public class ParallelGC {
    public static void main(String[] args) {
        System.out.println();
    }
}
