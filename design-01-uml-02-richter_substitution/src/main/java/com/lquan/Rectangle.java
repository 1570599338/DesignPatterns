package com.lquan;

/**
 * @program: DesignPatterns
 * @description: 长方形实现类
 * @author: lquan
 * @create: 2023-02-02 10:32
 **/
public class Rectangle   implements Quadrilateral{

        private double length;

        private double width;

        public void setLength(double length) {
            this.length = length;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        @Override
        public double getLenght() {
            return length;
        }

        @Override
        public double getWidth() {
            return width;
        }
 }


