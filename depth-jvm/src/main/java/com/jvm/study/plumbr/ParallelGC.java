package com.jvm.study.plumbr;

/**
 * 并行垃圾收集器这一类组合,
 * 在年轻代使用 标记-复制(mark-copy)算法,
 * 在老年代使用 标记-清除-整理(mark-sweep-compact)算法。
 * 年轻代和老年代的垃圾回收都会触发STW事件,
 * 暂停所有的应用线程来执行垃圾收集。两者在执行 标记和 复制/整理阶段时都使用多个线程, 因此得名“(Parallel)”。
 * 通过并行执行, 使得GC时间大幅减少。
 */
public class ParallelGC {
}
