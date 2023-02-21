package com.lquan.solve;

/**
 * @program: DesignPatterns
 * @description: 黑马防盗门 具有防盗、防火、防水的功能
 * @author: lquan
 * @create: 2023-02-02 15:29
 **/
public class HeiMaSafetyDoor implements AntiTheft,Fireproof,Waterproof{

    @Override
    public void antiTheft() {
        System.out.println("防盗-antiTheft");
    }

    @Override
    public void fireproof() {
        System.out.println("防火-fireproof");
    }

    @Override
    public void waterproof() {
        System.out.println("防水-waterproof");
    }
}
