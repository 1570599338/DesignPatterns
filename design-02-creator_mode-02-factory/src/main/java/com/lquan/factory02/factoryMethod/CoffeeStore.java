package com.lquan.factory02.factoryMethod;



/**
 * @program: DesignPatterns
 * @description: 咖啡店
 * @author: lquan
 * @create: 2023-03-02 19:35
 **/
public class CoffeeStore {

    private  CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(){

        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }

}
