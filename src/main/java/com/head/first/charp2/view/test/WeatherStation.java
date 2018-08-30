package com.head.first.charp2.view.test;

import com.head.first.charp2.view.main.impl.CurrentConditionsDisplay;
import com.head.first.charp2.view.main.impl.StatisticsDisplay;
import com.head.first.charp2.view.main.impl.WeatherData;

/**
 * ClassName WeatherStation
 *
 * @Author lquan
 * @Description //测速
 * @Date
 * @Param
 * @return
 **/
public class WeatherStation {

    public static void main(String[] args) {
        // 创建气象站
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay StatisticsDisplay = new StatisticsDisplay(weatherData);
        //显示当前气象站数据
        weatherData.setMeasurements(80,65,30.4f);
       // currentDisplay.dislay();
        weatherData.setMeasurements(182,651,111.22f);
    }
}
