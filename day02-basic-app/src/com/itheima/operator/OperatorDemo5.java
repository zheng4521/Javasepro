package com.itheima.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        //目标：掌握逻辑运算符的使用
        //手机尺寸和内存
        double size = 9.8;
        int storage = 16;
        System.out.println(size >= 6.95 & storage >= 8);
        System.out.println(size >= 6.95 | storage >= 8);
        System.out.println(size >= 6.95 ^ storage >= 8);
        System.out.println(size <= 6.95 | storage >= 8);

        int i = 10;
        int j = 20;
        System.out.println(i >= 100 && j++ > 90);
        System.out.println(j);
        System.out.println (i < 100 || j++ > 30);
        System.out.println(j);
    }
}
