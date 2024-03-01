package com.itheima;

import java.util.Scanner;


public class Test3 {
    public static void main(String[] args) {
        //案例三：评委打分案例
        System.out.println("该选手的平均分为：" + getAverage(6));

    }
    public static double getAverage(int n){
        int[] scores = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请您录入第" + (i+1) + "位评委的打分：");
            scores[i] = sc.nextInt();
        }
        int max = scores[0];
        int min = scores[0];
        int sum = 0;
        double average;
        for (int i = 0; i < scores.length; i++) {
            if(max < scores[i])
                max = scores[i];
            if(min > scores[i])
                min = scores[i];
            sum += scores[i];
        }
        average = 1.0 * (sum - max - min) / (scores.length - 2);//赋值语句不是表达式
        return average;
    }
}
