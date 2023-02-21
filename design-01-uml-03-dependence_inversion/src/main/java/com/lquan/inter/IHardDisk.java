package com.lquan.inter;

/**
 * 硬盘接口
 */
public interface IHardDisk {

    //存储数据的方法
    public void save(String data);

    //获取数据
    public String get();
}
