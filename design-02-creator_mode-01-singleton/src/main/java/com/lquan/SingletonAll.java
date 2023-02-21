package com.lquan;

import com.lquan.fanshe.resolve.Singlenton;

import java.io.Serializable;

/**
 * @program: DesignPatterns
 * @description: 线程安全，且不会被反射和序列化与反序列化破坏的单例
 * @author: lquan
 * @create: 2023-02-21 22:18
 **/
public class SingletonAll  {

    private static  volatile SingletonAll instance;

    // 1、构造方法私有化
    private  SingletonAll(){
        if(instance!=null){
            throw  new RuntimeException("单例出错了啦！");
        }
    }




    // 3、对外提供实例对象
    public static  SingletonAll getInstance(){

        if(instance==null){

            synchronized (SingletonAll.class){

                if (instance==null){
                    instance = new SingletonAll();
                }
            }
        }
        return instance;
    }
}
