package com.joseph.pattern.factory.func;

import com.joseph.pattern.factory.Car;

/**
 * Created by joseph on 2018/11/15.
 */
public class FuncFactoryTest {
    public static void main(String[] args) {
        FuncFactory bujiadiFactory = new BuJiaDiFactory();
        Car car = bujiadiFactory.getCar();
        System.out.println(car);
    }
}
