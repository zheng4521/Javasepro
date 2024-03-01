package com.itheima.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        //目标：学会关系运算符的使用
        int a = 10;
        int b = 5;
        boolean rs = a > b;
        System.out.println(rs);
        System.out.println(a >= b);
        System.out.println(2 >= 2);
        System.out.println(a <= b);
        System.out.println(2 <= 2);
        System.out.println(a == b);
        System.out.println(a != b);


        System.out.println(a = b);//里面是一个赋值运算
    }
}
