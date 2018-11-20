package com.joseph.pattern.prototype.simple;

import java.util.ArrayList;

/**
 * Created by joseph on 2018/11/19.
 */
public class CloneTest {
    public static void main(String[] args) {
        Prototype p = new Prototype();
        p.name = "Joseph";
        p.target = new CloneTarget();
        System.out.println(p.target);

        try {
            Prototype obj = (Prototype) p.clone();
            System.out.println(obj.target);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
