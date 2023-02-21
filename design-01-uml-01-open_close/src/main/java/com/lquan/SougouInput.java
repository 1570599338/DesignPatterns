package com.lquan;

/**
 * @program: DesignPatterns
 * @description: 输入法
 * @author: lquan
 * @create: 2023-02-02 09:48
 **/
public class SougouInput {

    //聚合
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display(){
        skin.display();
    }
}
