package com.head.first.charp2.view.main;

/**
 * 观察者
 */
public interface Observer {
    /**
     * 当气象观察值改变时，主题会把这些状态值当作方法的参数，传递给观察者。
     * @param temp 温度
     * @param humidity  湿度
     * @param pressure  压力
     */
    public void update(float temp,float humidity,float pressure);
}
