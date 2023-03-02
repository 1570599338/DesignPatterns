package com.lquan.factory01.simplyfactory;

/**
 * @program: DesignPatterns
 * @description: 咖啡店
 * @author: lquan
 * @create: 2023-03-02 19:35
 **/
public class CoffeeStore {


    public Coffee orderCoffee(String type){

        SimplyFactory factory = new SimplyFactory();
        Coffee coffee = factory.orderCoffee(type);
        coffee.addMilk();
        coffee.addsugar();

        return coffee;
    }

}
