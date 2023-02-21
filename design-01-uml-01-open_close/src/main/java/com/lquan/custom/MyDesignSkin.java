package com.lquan.custom;

import com.lquan.AbstractSkin;

/**
 * @program: DesignPatterns
 * @description: 自定义的皮肤
 * @author: lquan
 * @create: 2023-02-02 09:51
 **/
public class MyDesignSkin extends AbstractSkin {
    @Override
    public void display() {
        System.out.println("自定义的皮肤-MyDesignSkin");
    }
}
