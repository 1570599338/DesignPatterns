package com.lquan;

import com.lquan.inter.ICpu;
import com.lquan.inter.IHardDisk;
import com.lquan.inter.IMemory;

/**
 * @program: DesignPatterns
 * @description: 电脑
 * @author: lquan
 * @create: 2023-02-02 10:55
 **/
public class Computer {

    private IHardDisk hardDisk;

    private ICpu cpu;

    private IMemory memory;

    public IHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(IHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public ICpu getCpu() {
        return cpu;
    }

    public void setCpu(ICpu cpu) {
        this.cpu = cpu;
    }

    public IMemory getMemory() {
        return memory;
    }

    public void setMemory(IMemory memory) {
        this.memory = memory;
    }

    /**
     * 运行计算机
     */
    public void run(){
        System.out.println("运行计算机");
        String data = hardDisk.get();
        System.out.println("从硬盘上获取的数据是：" + data);
        cpu.run();
        memory.save();
    }
}
