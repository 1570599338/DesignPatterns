package com.lquan.fanshe.resolve;



/**
 * @program: DesignPatterns
 * @description: 反射破坏单例--解决
 * @author: lquan
 * @create: 2023-02-21 21:49
 **/
public class Singlenton {

    private Singlenton(){
        if(singlenton!=null){
           throw  new RuntimeException();
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
