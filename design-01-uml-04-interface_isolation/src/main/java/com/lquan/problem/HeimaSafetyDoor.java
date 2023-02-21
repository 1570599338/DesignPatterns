package com.lquan.problem;

/**
 * @program: DesignPatterns
 * @description: 黑马安全门
 * @author: lquan
 * @create: 2023-02-02 15:22
 **/
public class HeimaSafetyDoor implements SafetyDoor {

    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }

}
