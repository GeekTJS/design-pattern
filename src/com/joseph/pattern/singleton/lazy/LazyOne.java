package com.joseph.pattern.singleton.lazy;

/**
 * 懒汉式单例
 * 在外部需要使用的时候才进行实例化
 * <p>
 * Created by joseph on 2018/11/18.
 */
public class LazyOne {

    //静态块，公共内存区域
    private static LazyOne LAZY_ONE = null;


    public static LazyOne getInstance() {
        //调用方法之前先判断
        //如果没有实例化，将其进行实例化，并且赋值
        //将该实例缓存好
        if (LAZY_ONE == null) {
            LAZY_ONE = new LazyOne();
        }
        //如果已经初始化，直接返回已经保存好的结果
        return LAZY_ONE;
    }
}
