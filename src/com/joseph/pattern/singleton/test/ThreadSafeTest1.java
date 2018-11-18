package com.joseph.pattern.singleton.test;

import com.joseph.pattern.singleton.lazy.LazyOne;
import com.joseph.pattern.singleton.register.BeanFactory;

import java.util.concurrent.CountDownLatch;

/**
 * Created by joseph on 2018/11/18.
 */
public class ThreadSafeTest1 {

    public static void main(String[] args) {
        int count = 2000;
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
                    Object obj = BeanFactory.getBean("com.joseph.pattern.singleton.test.Pojo");
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
