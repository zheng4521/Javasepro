package com.itheima.define;

import java.util.Scanner;

public class ArrayTest6 {
    public static void main(String[] args) {
        //目标：需要完成评委打分的案例
        double[] scores = new double[6];
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入选手分数：");
            scores[i] = sc.nextDouble();
            sum += scores[i];
        }
        double average = sum / scores.length;
        System.out.println("选手的平均分为：" + average);
    }
}
