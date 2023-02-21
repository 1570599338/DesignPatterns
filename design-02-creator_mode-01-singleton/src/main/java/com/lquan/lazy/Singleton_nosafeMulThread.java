package com.lquan.lazy;

/**
 * @program: DesignPatterns
 * @description: 懒汉模式-线程不安全
 * @author: lquan
 * @create: 2023-02-21 19:27
 **/
public class Singleton_nosafeMulThread {

    // 私有化构造方法
    private  Singleton_nosafeMulThread(){}

    // 在成员位置创建该类的对象
    private  static  Singleton_nosafeMulThread install;

    // 对外提供静态方法获取该对象
    public static  Singleton_nosafeMulThread getInstall(){

        if(install==null){

            install = new Singleton_nosafeMulThread();

        }
        return install;
    }
}
