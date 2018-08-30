package com.head.first.charp2.view.main.impl;

import com.head.first.charp2.view.main.DisplayElement;
import com.head.first.charp2.view.main.Observer;
import com.head.first.charp2.view.main.Subject;

/**
 * ClassName StatisticsDisplay
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
public class StatisticsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    /**
     * 构造器需要weathDate对象（也是主题）作为注册只用
     * @param weatherData
     */
    public StatisticsDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * 当布告板需要显示时，调此方法
     */
    @Override
    public void dislay() {

        System.out.println("版本二当前环境："+temperature+"F degress and " + humidity+ "% humidity");

    }

    /**
     * 当气象观察值改变时，主题会把这些状态值当作方法的参数，传递给观察者。
     *
     * @param temp     温度
     * @param humidity 湿度
     * @param pressure 压力
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature=temp;
        this.humidity= humidity;
        dislay();
    }
}
