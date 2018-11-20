package com.joseph.pattern.prototype.deep;

/**
 * Created by joseph on 2018/11/20.
 */
public class DeepTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        try {
            QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();
            System.out.println(qiTianDaSheng == clone);
            System.out.println(qiTianDaSheng.jinGuBang == clone.jinGuBang);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
