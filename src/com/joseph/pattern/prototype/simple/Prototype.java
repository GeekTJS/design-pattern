package com.joseph.pattern.prototype.simple;

import java.util.ArrayList;

/**
 * Created by joseph on 2018/11/19.
 */
public class Prototype implements Cloneable {
    public String name;

    public CloneTarget target;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
