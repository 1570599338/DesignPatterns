package com.head.first.charp1.main;

/**
 *
 */
public abstract class Duck {
    /** 为行为接口类型生命2个引用变量，所有鸭子子类都继承他**/
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public  void  performFly(){
        flyBehavior.fly();
    }


    public  void  performQuack(){
        quackBehavior.quack();
    }


    public void  swim(){
        System.out.println("所有的鸭子的，");
    }
}

