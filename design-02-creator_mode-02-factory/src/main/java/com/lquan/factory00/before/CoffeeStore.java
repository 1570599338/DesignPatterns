package com.lquan.factory00.before;

/**
 * @program: DesignPatterns
 * @description: 咖啡店
 * @author: lquan
 * @create: 2023-03-02 19:35
 **/
public class CoffeeStore {
    public Coffee orderCoffee(String type){

        // 声明Coffee类型的变量，根据不同类型创建不同的coffee子类对象
        Coffee coffee =null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw  new RuntimeException("错误类型");
        }

        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}
