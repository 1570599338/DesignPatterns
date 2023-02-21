package com.lquan.lazy;

/**
 * @program: DesignPatterns
 * @description: 懒汉模式-线程安全
 * @author: lquan
 * @create: 2023-02-21 19:31
 **/
public class Singleton_safeMulThread {

    // 构造方法私有化
    private  Singleton_safeMulThread(){}


    // 在成员位置创建该类的对象
    private static Singleton_safeMulThread install;

    // 对外提供静态方法获取该对象

    public  static synchronized  Singleton_safeMulThread getInstance(){
        if(install==null){
            install = new Singleton_safeMulThread();
        }

        return install;
    }
}
