package com.joseph.pattern.factory.abst;

import com.joseph.pattern.factory.BuJiaDi;
import com.joseph.pattern.factory.Car;
import com.joseph.pattern.factory.LaoSiLaiSi;

/**
 * Created by joseph on 2018/11/15.
 */
public class CarFactory extends AbstractFactory {
    @Override
    Car getLaoSiLaiSi() {
        return new LaoSiLaiSi();
    }

    @Override
    Car getBuJiaDi() {
        return new BuJiaDi();
    }
}
