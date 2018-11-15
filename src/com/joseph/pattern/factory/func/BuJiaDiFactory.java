package com.joseph.pattern.factory.func;

import com.joseph.pattern.factory.BuJiaDi;
import com.joseph.pattern.factory.Car;

/**
 * Created by joseph on 2018/11/15.
 */
public class BuJiaDiFactory extends FuncFactory {
    @Override
    Car getCar() {
        return new BuJiaDi();
    }
}
