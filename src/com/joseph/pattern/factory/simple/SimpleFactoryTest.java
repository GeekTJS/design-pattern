package com.joseph.pattern.factory.simple;

import com.joseph.pattern.factory.Car;

/**
 * Created by joseph on 2018/11/15.
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Car car = simpleFactory.getCar("laosilaisi");
        System.out.println(car);
    }
}
