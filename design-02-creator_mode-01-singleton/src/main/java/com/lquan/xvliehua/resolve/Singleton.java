package com.lquan.xvliehua.resolve;

import java.io.Serializable;

/**
 * @program: DesignPatterns
 * @description: 破坏单例-序列化和反序列化
 * @author: lquan
 * @create: 2023-02-21 20:56
 **/
public class Singleton implements Serializable {
    // 1、私有化构造方法
    private Singleton(){}

    private static class SingletonHold{

        private static final Singleton install = new Singleton();
    }

    // 对外提供静态方法获取该对象
    public static Singleton getInstance(){

        return SingletonHold.install;
    }

    /**
     * 下面是为了解决序列化反序列化破解单例模式
     * @return
     */
    public  static  Object readResolve(){

        return  SingletonHold.install;
    }
}
