package com.itheima.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        //目标：掌握使用Random生成随机数步骤
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int data = r.nextInt(10) + 1;
            System.out.println(data);
        }


        System.out.println("-------------");
        //减加法
        //生成3-17的随机数
        for (int i = 0; i < 10; i++) {
            int data1 = r.nextInt(15) + 3;
            System.out.println(data1);
        }
    }
}
