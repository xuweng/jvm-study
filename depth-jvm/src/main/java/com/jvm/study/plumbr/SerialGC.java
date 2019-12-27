package com.jvm.study.plumbr;

/**
 * 同时对年轻代和老年代生效
 * <p>
 * -XX:+UseSerialGC -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps
 */
public class SerialGC {
    public static void main(String[] args) {
        System.out.println(111);
    }
}
