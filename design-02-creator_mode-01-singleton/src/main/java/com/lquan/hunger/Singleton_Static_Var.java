package com.lquan.hunger;

/**
 * @program: DesignPatterns
 * @description: 饿汉模式，静态变量模式
 *
 *                     原理：
 *                          1、在该类的成员变量位置声明了该类的成员变量，并且创建了Singleton_Static_Var的对象install
 *                          2、install对象随着类加载而创建
 *
 *                     缺点：如果这个对象足够大的话，并且加载后一直没有使用的话会造成内存浪费
 *
 *
 * @author: lquan
 * @create: 2023-02-03 08:51
 **/
public class Singleton_Static_Var {

    //1、必须有个私有的构造方法
    private Singleton_Static_Var(){}


    // 2、 静态成员变量
    private static  Singleton_Static_Var install = new Singleton_Static_Var();


    // 3、对外提供静态方法获取该对象
    public  static  Singleton_Static_Var getInstall(){

        return install;
    }

}
