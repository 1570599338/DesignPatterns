package com.lquan.factory02.factoryMethod;

/**
 * @program: DesignPatterns
 * @description: 咖啡类
 * @author: lquan
 * @create: 2023-03-02 19:27
 **/
public abstract class Coffee {

    public abstract  String getName();

    /**
     * 加糖
     */
    public  void addsugar(){
        System.out.println("加糖");
    }

    public  void addMilk(){
        System.out.println("加奶！");
    }
}
