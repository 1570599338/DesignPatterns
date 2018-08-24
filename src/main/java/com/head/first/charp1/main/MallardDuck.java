package com.head.first.charp1.main;

import com.head.first.charp1.main.impl.FlyWithWings;
import com.head.first.charp1.main.impl.Quack;

/**
 * ClassName MallardDuck
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
public class MallardDuck extends Duck{

    public MallardDuck() {
        this.quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }


    public  void  display(){
        System.out.println("我是一个mallard duck");
    }


}
