package com.head.first.charp1.main.impl;

import com.head.first.charp1.main.QuackBehavior;

/**
 * ClassName MuteQuack
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
