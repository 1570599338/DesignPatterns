package com.head.first.charp2.view.main.impl;

import com.head.first.charp2.view.main.Observer;
import com.head.first.charp2.view.main.Subject;

import java.util.ArrayList;

/**
 * ClassName WeatherData
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
public class WeatherData implements Subject{

    //记录观察者
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers=new ArrayList();

    }

    /**
     * 观察者注册方法
     *  当挂插着注册时，我们只要把他加入到Arraylist后面即可
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);

    }

    /**
     * 移除观察者
     *取消注册，我们把他从ArrayList
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {


    }

    /**
     * 当主题状态改变时，这个方法会被调用，以通知所有的观察者。
     */
    @Override
    public void notifyObservers() {

    }
}
