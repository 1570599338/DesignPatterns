package com.lquan.factory02.factoryMethod;

/**
 * @program: DesignPatterns
 * @description: 拿铁咖啡的工厂抽象,专门类生产拿铁咖啡的
 * @author: lquan
 * @create: 2023-03-02 20:36
 **/
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
