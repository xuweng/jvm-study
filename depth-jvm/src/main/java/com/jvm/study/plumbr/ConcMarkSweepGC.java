package com.jvm.study.plumbr;

/**
 * https://github.com/cncounter/gc-handbook/blob/master/04_GC_Algorithms_Implementations.md
 * 持续学习。刻意练习。
 * <p>
 * 并发标记-清除
 * <p>
 * CMS的官方名称为 “Mostly Concurrent Mark and Sweep Garbage Collector”(主要并发-标记-清除-垃圾收集器).
 * 其对年轻代采用并行 STW方式的 mark-copy (标记-复制)算法, 对老年代主要使用并发 mark-sweep (标记-清除)算法。
 * <p>
 * CMS的设计目标是避免在老年代垃圾收集时出现长时间的卡顿。主要通过两种手段来达成此目标。
 * 第一, 不对老年代进行整理, 而是使用空闲列表(free-lists)来管理内存空间的回收。
 * 第二, 在 mark-and-sweep (标记-清除) 阶段的大部分工作和应用线程一起并发执行。
 * 也就是说, 在这些阶段并没有明显的应用线程暂停。但值得注意的是, 它仍然和应用线程争抢CPU时间。
 * 默认情况下, CMS 使用的并发线程数等于CPU内核数的 1/4。
 * <p>
 * 如果服务器是多核CPU，并且主要调优目标是降低延迟, 那么使用CMS是个很明智的选择.
 * 减少每一次GC停顿的时间,会直接影响到终端用户对系统的体验, 用户会认为系统非常灵敏。
 * 因为多数时候都有部分CPU资源被GC消耗, 所以在CPU资源受限的情况下,CMS会比并行GC的吞吐量差一些。
 * <p>
 * 运用线程与gc线程一起运行。gc线程占有cpu资源。运用线程的数量减少，吞吐量下降。
 * 能使用的运用线程越少，吞吐量越小。吞吐量和用户线程成正比。
 * <p>
 * gc日志。可以算出有 540,141K 的对象从年轻代提升到老年代。
 * <p>
 * gc日志。计算年轻代使用量，老年代使用量，堆总共使用量。
 * 学习看gc日志。学习看gc日志。学习看gc日志。学习看gc日志。学习看gc日志。学习看gc日志。学习看gc日志。
 */
public class ConcMarkSweepGC {
}
