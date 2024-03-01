package com.itheima.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        //目标:掌握三元运算符的使用
        double score = 98.5;
        String rs = score > 60 ? "成绩及格" : "成绩不及格";
        System.out.println(rs);

        //找出两个整数中的较大值
        int a = 99;
        int b = 69;
        int c = a > b ? a : b;
        System.out.println(c);

        //找三个整数中的最大值
        int i = 40;
        int j = 45;
        int k = 34;
        int max1 = i > j ? i : j;
        int max2 = max1 > k ? max1 : k;
        System.out.println(max2);
    }
}
