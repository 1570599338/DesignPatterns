package com.lquan;



import com.lquan.xvliehua.question.Singleton;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @program: DesignPatterns
 * @description: 解决反射破坏单例问题
 * @author: lquan
 * @create: 2023-02-21 22:06
 **/
public class ClientAll {

  //  @Test
    public void test() throws  Exception{
        // 1、获取对应的字节码
        Class clazz = SingletonAll.class;
        // 2、获取单例的私有无参构造方法对象
        Constructor constructor = clazz.getDeclaredConstructor();

        // 3、取消访问检查
        constructor.setAccessible(true);

        //创建singleton类的对象
        SingletonAll singlenton = (SingletonAll)constructor.newInstance();
        System.out.println(singlenton);
        SingletonAll singlenton1 = (SingletonAll)constructor.newInstance();
        System.out.println(singlenton1);

        System.out.println("*xxx*************"+(singlenton==singlenton1));

    }

    public static void main(String[] args) throws Exception{
        // 1、 往文件中写入对象
        writeObjectFile();

        SingletonAll singleton = readFileToObject();
        SingletonAll singleton1 = readFileToObject();
        System.out.println("---------------->: "+singleton);
        System.out.println(singleton1);
        System.out.println(singleton==singleton1);

    }


    //1、 利用序列化写入对象
    public static  void writeObjectFile() throws Exception{
        // 获取Singleton的对象
        SingletonAll instance = SingletonAll.getInstance();

        // 创建对象输出流
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\lquan\\Desktop\\d.txt"));

        // 讲instance写入
        outputStream.writeObject(instance);

    }


    /**
     * 读取序列化的对象，然后反序列查看对象
     * @return
     * @throws
     */
    public  static SingletonAll  readFileToObject() throws  Exception{
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\lquan\\Desktop\\d.txt"));

        SingletonAll singleton = (SingletonAll)inputStream.readObject();
        return singleton;

    }

}
