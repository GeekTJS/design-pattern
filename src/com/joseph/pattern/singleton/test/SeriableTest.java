package com.joseph.pattern.singleton.test;

import com.joseph.pattern.singleton.seriable.Seriable;

import java.io.*;

/**
 * Created by joseph on 2018/11/18.
 */
public class SeriableTest {
    public static void main(String[] args) {

        Seriable s1 = null;
        Seriable s2 = Seriable.getInstance();

        FileOutputStream fos = null;
        try {
            //将s2序列化写入文件
            fos = new FileOutputStream("Seriable.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);

            oos.flush();
            oos.close();

            //从文件中读出,赋值给s1。
            //调用readResolve
            FileInputStream fis = new FileInputStream("Seriable.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (Seriable) ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
