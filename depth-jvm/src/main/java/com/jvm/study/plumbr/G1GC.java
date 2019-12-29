package com.jvm.study.plumbr;

/**
 * G1 – Garbage First(垃圾优先算法)
 * <p>
 * G1最主要的设计目标是: 将STW停顿的时间和分布变成可预期以及可配置的。
 * 事实上, G1是一款软实时垃圾收集器, 也就是说可以为其设置某项特定的性能指标.
 * 可以指定: 在任意 xx 毫秒的时间范围内, STW停顿不得超过 x 毫秒。
 * 如: 任意1秒暂停时间不得超过5毫秒. Garbage-First GC 会尽力达成这个目标
 * (有很大的概率会满足, 但并不完全确定,具体是多少将是硬实时的[hard real-time])。
 */
public class G1GC {
}
