package com.lquan;

/**
 * @program: DesignPatterns
 * @description: 测试类
 * @author: lquan
 * @create: 2023-02-02 10:34
 **/
public class RectangleDemo {

        public static void main(String[] args) {

            //创建长方形对象
            Rectangle r = new Rectangle();
            r.setLength(20);
            r.setWidth(10);

            resize(r);
            printLengthAndWidth(r);

        }

        /**
         * 扩宽的方法
         */
        public static void resize(Rectangle rectangle){
            //判断宽如果比长小，进行扩宽的操作
            while (rectangle.getWidth() <= rectangle.getLenght()){
                rectangle.setWidth(rectangle.getLenght() + 1);
            }
        }

        /**
         * 打印长和宽
         */
        public static void printLengthAndWidth(Quadrilateral quadrilateral){
            System.out.println(quadrilateral.getLenght());
            System.out.println(quadrilateral.getWidth());
        }
}



