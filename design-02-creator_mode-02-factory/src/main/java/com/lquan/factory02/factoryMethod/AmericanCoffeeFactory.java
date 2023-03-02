package com.lquan.factory02.factoryMethod;

/**
 * @program: DesignPatterns
 * @description: 美式咖啡工厂对象，专门用来生产没事咖啡的
 * @author: lquan
 * @create: 2023-03-02 20:34
 **/
public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {

        return  new AmericanCoffee();
    }
}
