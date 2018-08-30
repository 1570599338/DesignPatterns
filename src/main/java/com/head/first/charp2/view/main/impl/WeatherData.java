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
       int i = this.observers.indexOf(o);
       if(i>=0){
           this.observers.remove(i);
       }

    }

    /**
     * 当主题状态改变时，这个方法会被调用，以通知所有的观察者。
     *  有趣的地方：在这里，我们把状态告诉每一个观察者，因为观察者都实现了
 update（），所以我们知道该如何通知    */
    @Override
    public void notifyObservers() {
        for (int i = 0; i <observers.size() ; i++) {
            Observer observer= (Observer)observers.get(i);
            observer.update(temperature,humidity,pressure);
        }


    }


    /**
     * 当从气象站得到更新观测值时，
     * 通知观察者
     */
    public void  measurementsChanged(){
        this.notifyObservers();
    }


    public  void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }

    // WeatherData的其他方法
}
