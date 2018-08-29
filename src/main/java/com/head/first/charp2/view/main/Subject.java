package com.head.first.charp2.view.main;

/**
 *主题接口
 *
 */
public interface Subject {
    /**
     * 观察者注册方法
     * @param o
     */
    public  void registerObserver(Observer o);

    /**
     * 移除观察者
     * @param o
     */
    public  void removeObserver(Observer o);

    /**
     * 当主题状态改变时，这个方法会被调用，以通知所有的观察者。
     */
    public void notifyObservers();

}
