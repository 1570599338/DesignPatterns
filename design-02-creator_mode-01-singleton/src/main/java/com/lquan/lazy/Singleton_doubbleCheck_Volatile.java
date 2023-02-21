package com.lquan.lazy;

/**
 * @program: DesignPatterns
 * @description: 懒汉模式--双层检查解决JVM在实例化的时候会进行优化和执行重排操作--加入volatile解决这个指令重排的问题
 * @author: lquan
 * @create: 2023-02-21 19:45
 **/
public class Singleton_doubbleCheck_Volatile {
    // 1、 私有化构造方法
    private  Singleton_doubbleCheck_Volatile(){}

    //2、在成员位置创建该类的对象
    private static  volatile  Singleton_doubbleCheck_Volatile install;

    // 3、 对外提供静态方法获取对象
    public static  Singleton_doubbleCheck_Volatile getInstance(){
        if(install==null){

            synchronized (Singleton_doubbleCheck_Volatile.class){
                if(install==null){
                    install = new Singleton_doubbleCheck_Volatile();
                }
            }

        }

        return install;
    }
}
