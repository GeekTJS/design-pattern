package com.joseph.pattern.singleton.lazy;

/**
 * 懒汉式单例
 * 在外部类被调用的时候内部类才会加载
 * 内部类一定要在方法调用之前加载完
 * 这种形式兼顾了饿汉式的内存浪费，也兼顾了synchronized的性能问题
 * Created by joseph on 2018/11/18.
 */
public class LazyThree {

    //static保证单例
    //final保证方法不重写重载
    public static final LazyThree getInstance() {
        //在返回结果以前，一定会加载内部类
        return LazyHolder.LAZY_THREE;
    }

    private static class LazyHolder {
        private static final LazyThree LAZY_THREE = new LazyThree();
    }
}
