package com.lquan.factory01.simplyfactory;

/**
 * @program: DesignPatterns
 * @description: 简单工厂类 -- 不属于23中设计模式之一
 * @author: lquan
 *          优点：
 *              解除了咖啡实现类的耦合，降低了客户端代码修改的可能性，更加容易扩展
 *          缺点：
 *              增加新产品时还是需要修改工厂类的代码，违背了-开闭原则
 *
 *
 * @create: 2023-03-02 19:51
 **/
public class SimplyFactory {



    public Coffee orderCoffee(String type){
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
