package com.lquan;

import com.lquan.inter.ICpu;
import com.lquan.inter.IHardDisk;
import com.lquan.inter.IMemory;
import com.lquan.inter.impl.IntelCpu;
import com.lquan.inter.impl.KingstonMemory;
import com.lquan.inter.impl.XiJieHardDisk;

/**
 * @program: DesignPatterns
 * @description: 测试类
 * @author: lquan
 * @create: 2023-02-02 11:05
 **/
public class ComputerDemo {

    public static void main(String[] args) {
        //创建组件对象
        IHardDisk hardDisk = new XiJieHardDisk();
        ICpu cpu = new IntelCpu();
        IMemory memory = new KingstonMemory();

        //创建计算机对象
        Computer c = new Computer();
        //组装计算机
        c.setCpu(cpu);
        c.setHardDisk(hardDisk);
        c.setMemory(memory);
        //运行计算机
        c.run();
    }
}
