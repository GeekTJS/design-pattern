package com.joseph.pattern.factory.abst;

import com.joseph.pattern.factory.Car;

/**
 * Created by joseph on 2018/11/15.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new CarFactory();
        Car car = abstractFactory.getBuJiaDi();
        System.out.println(car);
    }
}
