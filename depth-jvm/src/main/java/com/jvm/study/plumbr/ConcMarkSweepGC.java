package com.jvm.study.plumbr;

/**
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
 */
public class ConcMarkSweepGC {
}