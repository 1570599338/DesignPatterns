package com.lquan.lazy;

/**
 * @program: DesignPatterns
 * @description: 懒汉模式-双层检查
 *                  问题：JVM在实例化对象的时候会进行优化和指令重排序操作
 *
 * @author: lquan
 * @create: 2023-02-21 19:37
 **/
public class Singleton_doubbleCheck_noVolatile {
    // 1、私有化构造方法
    private Singleton_doubbleCheck_noVolatile(){}

    //2、在成员位置创建该类的对象
    private static Singleton_doubbleCheck_noVolatile install;

    // 3 、对外提供静态的反方获取对象
    public static Singleton_doubbleCheck_noVolatile getInstance(){

        //第一次判断，如果instance不为null，不进入抢锁阶段，直接返回实例
        if (install==null){

            synchronized (Singleton_doubbleCheck_noVolatile.class){
                //抢到锁之后再次判断是否为null
                if (install==null){
                    install= new Singleton_doubbleCheck_noVolatile();
                }
            }
        }
        return install;
    }

}
