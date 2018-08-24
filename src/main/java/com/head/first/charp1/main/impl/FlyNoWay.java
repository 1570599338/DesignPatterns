package com.head.first.charp1.main.impl;

import com.head.first.charp1.main.FlyBehavior;

/**
 * ClassName FlyNoWay
 *
 * @Author lquan
 * @Description //实现不会飞行的鸭子
 * @Date
 * @Param
 * @return
 **/
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I cant't flys");
    }
}
