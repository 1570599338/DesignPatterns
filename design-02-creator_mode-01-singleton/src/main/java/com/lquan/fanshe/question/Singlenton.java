package com.lquan.fanshe.question;



/**
 * @program: DesignPatterns
 * @description: 反射破坏单例
 * @author: lquan
 * @create: 2023-02-21 21:49
 **/
public class Singlenton {

    private Singlenton(){}

    private static  volatile  Singlenton singlenton;

    public static  Singlenton getInstance(){

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
