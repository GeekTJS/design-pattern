package com.joseph.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * spring中的做法，注册式单例
 * Created by joseph on 2018/11/18.
 */
public class BeanFactory {
    private BeanFactory() {
    }

    //线程安全
    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className) {
        if (!ioc.containsKey(className)) {
            Object obj = null;
            try {
                obj = Class.forName(className).newInstance();
                //存在线程安全问题
                ioc.put(className, obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return obj;
        } else {
            return ioc.get(className);
        }
    }
}
