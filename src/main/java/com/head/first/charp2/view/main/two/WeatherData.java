package com.head.first.charp2.view.main.two;

import java.util.Observable;

/**
 * ClassName WeatherData
 *
 * @Author lquan
 * @Description 利用内置的支持重新做气象站
 * @Date
 * @Param
 * @return
 **/
public class WeatherData extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * 构造器不在需要为了记住观察者们而建立数据结构了。
     */
    public WeatherData(){ }


    public void measurementsChanged(){
        setChanged();
        this.notifyObservers();
    }

    public void setMessurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        this.measurementsChanged();
    }



    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }




}
