package com.joseph.pattern.factory.func;

import com.joseph.pattern.factory.Car;

/**
 * 工厂方法
 * 一个工厂对应一个产品
 * <p>
 * 理解：一家工厂生产一种产品
 * <p>
 * 缺点：
 * 1、每增加一个产品，则需要添加新的产品类，以及它所对应的具体工厂类。系统成本增加
 * 2、使用工厂方法的类，如果更换产品，则需要修改重新创建新的工厂类，对类内部修改关闭，外部不关闭
 * Created by joseph on 2018/11/15.
 */
abstract class FuncFactory {
    abstract Car getCar();
}
