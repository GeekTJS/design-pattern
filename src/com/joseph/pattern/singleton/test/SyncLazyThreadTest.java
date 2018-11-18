package com.joseph.pattern.singleton.test;

import com.joseph.pattern.singleton.lazy.LazyTwo;

/**
 * 线程安全和不安全懒汉式的耗时区别
 * Created by joseph on 2018/11/18.
 */
public class SyncLazyThreadTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 200000000; i++) {
            Object obj = LazyTwo.getInstance();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
