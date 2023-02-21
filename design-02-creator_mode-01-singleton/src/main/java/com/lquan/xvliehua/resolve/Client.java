package com.lquan.xvliehua.resolve;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @program: DesignPatterns
 * @description: 解决反序列化的破坏单例问题
 * @author: lquan
 * @create: 2023-02-21 21:24
 **/
public class Client {

    public static void main(String[] args) throws Exception{
        // 1、 往文件中写入对象
        writeObjectFile();

       Singleton singleton = readFileToObject();
       Singleton singleton1 = readFileToObject();

        System.out.println(singleton==singleton1);

    }


    //1、 利用序列化写入对象
    public static  void writeObjectFile() throws Exception{
        // 获取Singleton的对象
        Singleton instance = Singleton.getInstance();

        // 创建对象输出流
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\lquan\\Desktop\\a.txt"));

        // 讲instance写入
        outputStream.writeObject(instance);

    }


    /**
     * 读取序列化的对象，然后反序列查看对象
     * @return
     * @throws
     */
    public  static Singleton readFileToObject() throws  Exception{
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\lquan\\Desktop\\a.txt"));

        Singleton singleton = (Singleton)inputStream.readObject();
        return singleton;

    }
}
