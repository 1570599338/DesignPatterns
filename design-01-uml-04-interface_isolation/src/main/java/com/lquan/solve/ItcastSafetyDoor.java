package com.lquan.solve;

/**
 * @program: DesignPatterns
 * @description: 传智安全门 只具备防盗和防火功能，不具备防水功能
 * @author: lquan
 * @create: 2023-02-02 15:32
 **/
public class ItcastSafetyDoor  implements AntiTheft,Fireproof {
    @Override
    public void antiTheft() {
        System.out.println("防盗-antiTheft");
    }

    @Override
    public void fireproof() {
        System.out.println("防火-fireproof");
    }
}
