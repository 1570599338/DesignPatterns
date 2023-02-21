package com.lquan;

/**
 * @program: DesignPatterns
 * @description: 正方形
 * @author: lquan
 * @create: 2023-02-02 10:33
 **/
public class Square implements Quadrilateral{

    /**
     * 边长
     */
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLenght() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}