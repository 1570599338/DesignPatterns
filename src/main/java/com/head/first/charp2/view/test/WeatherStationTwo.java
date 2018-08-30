package com.head.first.charp2.view.test;

import com.head.first.charp2.view.main.two.CurrentConditionsDisplay;
import com.head.first.charp2.view.main.two.WeatherData;

/**
 * ClassName WeatherStationTwo
 *
 * @Author lquan
 * @Description //TODO
 * @Date
 * @Param
 * @return
 **/
public class WeatherStationTwo {
    public static void main(String[] args) {
        // 创建气象站
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        //显示当前气象站数据
        weatherData.setMessurements(80,65,30.4f);

    }
}
