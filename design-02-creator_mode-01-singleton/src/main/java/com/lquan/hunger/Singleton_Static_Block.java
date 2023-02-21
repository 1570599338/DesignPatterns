package com.lquan.hunger;

/**
 * @program: DesignPatterns
 * @description: 饿汉模式，静态代码块模式
 *              原理：
 *                  1、该类声明了Singleton_Static_Block类型的静态变量，实例化实在静态代码块中实现。
 *                  2、install的实例是随着类加载儿创建的
 *
 *               缺点： 如果对象足够大的话，并且加载后长时间不用造成内存浪费的问题。
 *
 * @author: lquan
 * @create: 2023-02-03 09:04
 **/
public class Singleton_Static_Block {

    // 1、创建一个私有的构造方法
    private Singleton_Static_Block(){}

    //2、创建一个静态变量
    private static Singleton_Static_Block install;

    // 3、创建静态代码块
    static {
        install = new Singleton_Static_Block();
    }

    // 4、对外提供静态方法获取对象

    public static Singleton_Static_Block getInstall(){

        return install;
    }

}
