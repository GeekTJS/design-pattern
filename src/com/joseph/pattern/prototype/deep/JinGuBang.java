package com.joseph.pattern.prototype.deep;

import com.sun.scenario.effect.impl.prism.PrImage;

import java.io.Serializable;

/**
 * Created by joseph on 2018/11/19.
 */
public class JinGuBang implements Serializable {
    private float h = 100;
    private float d = 10;

    public void big() {
        this.d *= 2;
        this.h *= 2;
    }

    public void small() {
        this.d /= 2;
        this.h /= 2;
    }
}
