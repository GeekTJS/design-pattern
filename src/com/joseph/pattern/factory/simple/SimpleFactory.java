package com.joseph.pattern.factory.simple;

import com.joseph.pattern.factory.BuJiaDi;
import com.joseph.pattern.factory.Car;
import com.joseph.pattern.factory.LaoSiLaiSi;

/**
 * 简单工厂
 *
 * 理解：生产所有产品，不同牌子汽车
 *
 * 例子：java.text.DateFormat
 * 优点:对对象的生成做了抽象，切割
 * 缺点:违背开闭原则，增加产品，需要修改工厂逻辑;类的增加导致代码复杂
 * <p>
 * Created by joseph on 2018/11/15.
 */
public class SimpleFactory {
    public Car getCar(String name) {
        if ("laosilaisi".equals(name)) {
            return new LaoSiLaiSi();
        } else if ("bujiadi".equals(name)) {
            return new BuJiaDi();
        } else {
            System.out.println("找不到车辆");
            return null;
        }
    }
}
