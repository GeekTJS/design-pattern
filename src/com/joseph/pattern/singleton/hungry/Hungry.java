package com.joseph.pattern.singleton.hungry;

/**
 * 饿汉式单例
 * 在类加载的时候立即初始化，并且创建单例对象
 * <p>
 * 优点：沒有任何加载的锁，执行效率比较高，用户体验优于懒汉式；绝对线程安全
 * <p>
 * 缺点：类加载的时候初始化，不管用还是不用，总是占着空间（有可能浪费内存）
 * <p>
 * Created by joseph on 2018/11/18.
 */
public class Hungry {
    private Hungry() {

    }

    private static final Hungry HUNGRY = new Hungry();

    public static Hungry getInstance() {
        return HUNGRY;
    }

}
