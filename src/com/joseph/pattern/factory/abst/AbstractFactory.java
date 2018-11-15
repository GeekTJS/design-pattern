package com.joseph.pattern.factory.abst;

import com.joseph.pattern.factory.Car;

/**
 * 抽象工厂
 * 产品族概念
 * 理解：一家工厂生产他自己旗下的所有产品，奥迪工厂成生产不同的型号车子
 * 缺点：不能添加产品
 * Created by joseph on 2018/11/15.
 */
abstract class AbstractFactory {
    abstract Car getLaoSiLaiSi();

    abstract Car getBuJiaDi();
}
