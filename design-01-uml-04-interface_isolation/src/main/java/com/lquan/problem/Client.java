package com.lquan.problem;

/**
 * @program: DesignPatterns
 * @description: 测试类
 * @author: lquan
 * @create: 2023-02-02 15:24
 **/
public class Client {

    public static void main(String[] args) {
        HeimaSafetyDoor door = new HeimaSafetyDoor();
        door.antiTheft();
        door.fireProof();
        door.waterProof();
    }
}
