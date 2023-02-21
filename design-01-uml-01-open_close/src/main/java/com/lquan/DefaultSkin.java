package com.lquan;

/**
 * @program: DesignPatterns
 * @description:  默认皮肤
 * @author: lquan
 * @create: 2023-02-02 09:47
 **/
public class DefaultSkin extends  AbstractSkin{

    @Override
    public void display() {
        System.out.println("默认皮肤-DefaultSkin");
    }
}
