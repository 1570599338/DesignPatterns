package com.head.first.charp1.main;

import com.head.first.charp1.main.impl.FlyNoWay;
import com.head.first.charp1.main.impl.Quack;

/**
 * ClassName ModelDuck
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
public class ModelDuck extends  Duck{

    public ModelDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyNoWay();
    }




    @Override
    public void display() {
        System.out.println("I'm model Duck !");
    }
}
