package com.itheima.type;

public class TypeConversionDemo2 {
    public static void main(String[] args) {
        //目标：掌握表达式类型转换
        byte a = 1;
        short b = 2;
        char c = 5;
        int d = a + b + c;
        System.out.println(d);

        double e = d + 1.0;
        System.out.println(e);

        byte a1 = 1;
        byte a2 = 2;
        int a3 = a1 + a2;
    }
}
