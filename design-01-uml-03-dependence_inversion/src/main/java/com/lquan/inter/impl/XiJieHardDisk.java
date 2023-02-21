package com.lquan.inter.impl;

import com.lquan.inter.IHardDisk;

/**
 * @program: DesignPatterns
 * @description: 希捷数据
 * @author: lquan
 * @create: 2023-02-02 11:03
 **/
public class XiJieHardDisk implements IHardDisk {


    /**
     * 存储数据的方法
     */
    @Override
    public void save(String data){
        System.out.println("使用希捷硬盘存储数据为：" + data);
    }

    /**
     * 获取数据的方法
     */
    @Override
    public String get(){
        System.out.println("使用希捷硬盘取数据");
        return "数据";
    }
}
