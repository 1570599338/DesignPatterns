package com.lquan;


import java.io.Serializable;

/**
 * @program: DesignPatterns
 * @description: 线程安全，且不会被反射和序列化与反序列化破坏的单例
 * @author: lquan
 * @create: 2023-02-21 22:18
 **/
public class SingletonAll implements Serializable {

    // 红绿灯法，标识位
    private  static boolean  isfanshe = false;

    private static  volatile SingletonAll instance;

    // 1、构造方法私有化
    private  SingletonAll(){

        /**
         * 防止反射造成对单例的破坏，进而实例化的单例问题
         *      此种方法为解决高并发和性能问题而设计的
         */
        if(isfanshe){
            throw  new RuntimeException("单例出错了啦！");
        }
        if (!isfanshe){
            synchronized (SingletonAll.class){
                if(isfanshe){
                    throw  new RuntimeException("单例出错了啦！");
                }
                isfanshe=true;
            }
        }
    }

    private static class SingletonHolder {
        private static final SingletonAll INSTANCE = new SingletonAll();
    }


    // 3、对外提供实例对象
    public static  SingletonAll getInstance(){

       return  SingletonHolder.INSTANCE;
    }



    private  Object readResolve(){
        return SingletonHolder.INSTANCE;
    }


}
