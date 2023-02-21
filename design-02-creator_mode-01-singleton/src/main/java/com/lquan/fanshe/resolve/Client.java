package com.lquan.fanshe.resolve;

import com.lquan.fanshe.question.Singlenton;

import java.lang.reflect.Constructor;

/**
 * @program: DesignPatterns
 * @description: 解决反射破坏单例问题
 * @author: lquan
 * @create: 2023-02-21 22:06
 **/
public class Client {

    public static void main(String[] args) throws  Exception{
        // 1、获取对应的字节码
        Class<com.lquan.fanshe.question.Singlenton> aClass = com.lquan.fanshe.question.Singlenton.class;
        // 2、获取单例的私有无参构造方法对象
        Constructor<Singlenton> constructor = aClass.getDeclaredConstructor();

        // 3、取消访问检查
        constructor.setAccessible(true);

        //创建singleton类的对象
        com.lquan.fanshe.question.Singlenton singlenton = constructor.newInstance();
        Singlenton singlenton1 = constructor.newInstance();

        System.out.println(singlenton==singlenton1);

    }
}
