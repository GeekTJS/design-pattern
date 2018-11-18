package com.joseph.pattern.singleton.register;

/**
 * 常量中去使用，常量共用
 * 通常在通用API中使用
 * Created by joseph on 2018/11/18.
 */
public enum Color {
    RED() {
        private int r = 255;
        private int g = 0;
        private int b = 0;
    },
    BLACK() {
        private int r = 0;
        private int g = 0;
        private int b = 0;
    },
    WHITE() {
        private int r = 255;
        private int g = 255;
        private int b = 255;
    }
}
