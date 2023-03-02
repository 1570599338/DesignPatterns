package com.lquan.factory01.staticfactory;



/**
 * @program: DesignPatterns
 * @description: 静态工厂模式  -不属于23中设计模式之一
 * @author: lquan
 * @create: 2023-03-02 20:16
 **/
public class SimpleFactory {

    public static  Coffee orderCoffee(String type){
        // 声明Coffee类型的变量，根据不同类型创建不同的coffee子类对象
        Coffee coffee =null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw  new RuntimeException("没有该类型的咖啡");
        }

        return coffee;
    }
}
