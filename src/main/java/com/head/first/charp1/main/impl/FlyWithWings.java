package com.head.first.charp1.main.impl;

import com.head.first.charp1.main.FlyBehavior;

/**
 * ClassName FlyWithWings
 *
 * @Author lquan
 * @Description //这是飞行为的实现，给真会飞的鸭子用
 * @Date
 * @Param
 * @return
 **/
public class FlyWithWings implements FlyBehavior{

    /**
     * 实现飞行行为
     */
    @Override
    public void fly() {
        System.out.println("I'm flying!!!");
    }
}
