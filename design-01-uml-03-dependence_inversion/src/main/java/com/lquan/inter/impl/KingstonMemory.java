package com.lquan.inter.impl;

import com.lquan.inter.IMemory;

/**
 * @program: DesignPatterns
 * @description: 金士顿内存条
 * @author: lquan
 * @create: 2023-02-02 11:01
 **/
public class KingstonMemory implements IMemory {

    @Override
    public void save(){
        System.out.println("使用金士顿内存条-KingstonMemory");
    }
}
