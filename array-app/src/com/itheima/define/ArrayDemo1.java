package com.itheima.define;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //目标：掌握数组的定义方式一：静态初始化数组
        int[] ages = new int[] {1, 2, 3};
        double[] scores = new double[] {1.1, 2.2, 89, 44.4};

        //简化写法
        int[] ages1 = {1, 2, 3};
        double[] scores1 = {1.1, 2.2, 89, 44.4};

        //age是数组变量，存数组对象的地址。
        System.out.println(ages);
        System.out.println(scores);
    }
}
