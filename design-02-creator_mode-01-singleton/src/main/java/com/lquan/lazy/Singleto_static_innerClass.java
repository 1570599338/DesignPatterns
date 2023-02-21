package com.lquan.lazy;

/**
 * @program: DesignPatterns
 * @description:  懒汉模式--静态内部类
 *                      由于 JVM 在加载外部类的过程中, 是不会加载静态内部类的, 只有内部类的属性/方法被调用时才会被加载, 并初始化其静态属性。
 * 静态属性由于被 static 修饰，保证只被实例化一次，并且严格保证实例化顺序。
 *
 * @author: lquan
 * @create: 2023-02-21 19:50
 **/
public class Singleto_static_innerClass {

    // 1、构造方法私有化
    private  Singleto_static_innerClass(){}

    private  static class Single{
        private  static  final  Singleto_static_innerClass INSTANCE = new Singleto_static_innerClass();
    }


    //2’对外提供静态方法对象获取对象

    public static  Singleto_static_innerClass getInstance(){
        return Single.INSTANCE;
    }
}
