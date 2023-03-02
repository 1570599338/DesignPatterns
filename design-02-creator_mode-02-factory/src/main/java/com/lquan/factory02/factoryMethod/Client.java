package com.lquan.factory02.factoryMethod;

/**
 * @program: DesignPatterns
 * @description:
 * @author: lquan
 * @create: 2023-03-02 20:30
 **/
public class Client {

    public static void main(String[] args) {
        // 创建一个咖啡店
        CoffeeStore coffeeStore = new CoffeeStore();

        // 创建对象
       CoffeeFactory factory = new AmericanCoffeeFactory();
       coffeeStore.setCoffeeFactory(factory);

       // 点咖啡
        Coffee coffee = coffeeStore.orderCoffee();


        System.out.println(coffee.getName());


    }
}
