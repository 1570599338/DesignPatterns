package com.lquan.solve;

/**
 * @program: DesignPatterns
 * @description: 测试类
 * @author: lquan
 * @create: 2023-02-02 15:32
 **/
public class Client {

    public static void main(String[] args) {
        //创建黑马安全门对象
        HeiMaSafetyDoor door = new HeiMaSafetyDoor();

        //调用功能
        door.antiTheft();
        door.fireproof();
        door.waterproof();
        System.out.println("----------------------------------");

        // 传值的安全门不具备防水功能
        ItcastSafetyDoor door1 = new ItcastSafetyDoor();
        door1.antiTheft();
        door1.fireproof();
    }
}
