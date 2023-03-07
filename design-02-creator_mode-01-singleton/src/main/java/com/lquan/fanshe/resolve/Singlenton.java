package com.lquan.fanshe.resolve;



/**
 * @program: DesignPatterns
 * @description: 反射破坏单例--解决
 * @author: lquan
 * @create: 2023-02-21 21:49
 **/
public class Singlenton {

    // 红绿灯法，标识位
    private  static boolean  isfanshe = false;

    private Singlenton(){

        if(isfanshe){
            throw  new RuntimeException("单例反射出问题了");
        }
        if (!isfanshe){
            synchronized (Singlenton.class){
                if(isfanshe){
                    throw  new RuntimeException("单例出错了啦！");
                }
                isfanshe=true;
            }
        }
    }

    private static  volatile Singlenton singlenton;

    public static Singlenton getInstance(){

        if(singlenton==null){

            synchronized (Singlenton.class){

                if (singlenton==null){
                    singlenton = new Singlenton();
                }
            }
        }
        return singlenton;
    }


}
