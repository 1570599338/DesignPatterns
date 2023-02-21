package com.lquan;

import com.lquan.custom.MyDesignSkin;

/**
 * @program: DesignPatterns
 * @description:
 * @author: lquan
 * @create: 2023-02-02 09:59
 **/
public class Client {

    public static void main(String[] args) {
        //1.创建搜狗输入法对象
        SougouInput input = new SougouInput();

        //2.创建皮肤对象
        //DefaultSkin skin = new DefaultSkin();
        MyDesignSkin skin = new MyDesignSkin();

        //3.将皮肤设置到输入法里边
        input.setSkin(skin);

        //4.显示皮肤
        input.display();

    }

}
