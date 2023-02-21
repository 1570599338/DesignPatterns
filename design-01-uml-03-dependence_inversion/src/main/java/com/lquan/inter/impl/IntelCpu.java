package com.lquan.inter.impl;

import com.lquan.inter.ICpu;

/**
 * @program: DesignPatterns
 * @description: intel的处理器
 * @author: lquan
 * @create: 2023-02-02 10:59
 **/
public class IntelCpu  implements ICpu {

    @Override
    public void run() {
        System.out.println("使用Intel处理器");
    }
}
