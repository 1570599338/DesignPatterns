package com.head.first.charp1.test;

import com.head.first.charp1.main.Duck;
import com.head.first.charp1.main.MallardDuck;
import com.head.first.charp1.main.ModelDuck;

/**
 * ClassName MiniDuckSimulator
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();



    }
}
