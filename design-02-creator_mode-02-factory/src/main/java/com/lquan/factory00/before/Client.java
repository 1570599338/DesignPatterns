package com.lquan.factory00.before;

/**
 * @program: DesignPatterns
 * @description: 测试
 * @author: lquan
 * @create: 2023-03-02 19:34
 **/
public class Client {

    public static void main(String[] args) {
        // 创建咖啡店
        CoffeeStore coffeeStore = new CoffeeStore();
        // 点咖啡
        Coffee coffee = coffeeStore.orderCoffee("latte");
        // 咖啡名称
        System.out.println(coffee.getName());


    }
}
