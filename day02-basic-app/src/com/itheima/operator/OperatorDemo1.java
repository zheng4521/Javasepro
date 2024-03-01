package com.itheima.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        //目标:掌握基本算数运算符的使用
        int a = 10;
        int b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        int c = 3;
        System.out.println(a / c);//表达式类型转换
        System.out.println(1.0 * a / c);
        System.out.println(a % c);

        //拓展：判断
        int a2 = 5;
        System.out.println("abc" + a2);
        System.out.println(a2 + 5);
        System.out.println("abc" + a2 + 'a');
        System.out.println(a2 + 'a' + "abc");

    }
}
