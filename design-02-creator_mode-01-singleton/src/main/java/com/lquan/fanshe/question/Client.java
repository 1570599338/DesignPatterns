package com.lquan.fanshe.question;

import java.lang.reflect.Constructor;

/**
 * @program: DesignPatterns
 * @description: 反射破坏-测试类
 * @author: lquan
 * @create: 2023-02-21 21:59
 **/
public class Client {

    public static void main(String[] args) throws  Exception{
        // 1、获取对应的字节码
        Class<Singlenton> aClass = Singlenton.class;
        // 2、获取单例的私有无参构造方法对象
        Constructor<Singlenton> constructor = aClass.getDeclaredConstructor();

        // 3、取消访问检查
        constructor.setAccessible(true);

        //创建singleton类的对象
        Singlenton singlenton = constructor.newInstance();
        Singlenton singlenton1 = constructor.newInstance();

        System.out.println(singlenton==singlenton1);

    }

}
