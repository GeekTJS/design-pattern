package com.joseph.pattern.singleton.test;

import com.joseph.pattern.singleton.lazy.LazyOne;

import java.util.concurrent.CountDownLatch;

/**
 * Created by joseph on 2018/11/18.
 */
public class ThreadSafeTest {

    public static void main(String[] args) {
        int count = 200;
        //此处CountDownLatch用法并不好
        CountDownLatch latch = new CountDownLatch(count);
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {
                        //阻塞
                        //count=0就会释放所有的共享锁
                        latch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //必然会调用，可能会有很多线程同时去调用getInstance()
                    Object obj = LazyOne.getInstance();
                    System.out.println(System.currentTimeMillis() + ":" + obj);
                }
            }.start();

            //每启动一次就count--
            latch.countDown();
        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start));
    }
}
