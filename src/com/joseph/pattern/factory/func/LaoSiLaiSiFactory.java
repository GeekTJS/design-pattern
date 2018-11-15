package com.joseph.pattern.factory.func;

import com.joseph.pattern.factory.Car;
import com.joseph.pattern.factory.LaoSiLaiSi;

/**
 * Created by joseph on 2018/11/15.
 */
public class LaoSiLaiSiFactory extends FuncFactory {
    @Override
    Car getCar() {
        return new LaoSiLaiSi();
    }
}
