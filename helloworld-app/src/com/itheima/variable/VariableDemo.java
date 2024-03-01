package com.itheima.variable;

public class VariableDemo {
    public static void main(String[] args) {
        int age = 19;
        System.out.println(age);
        double score = 29.30;
        System.out.println(score);

        //变量里的数据可以被替换
        int age2 = 20;
        System.out.println(age2);
        age2 = 21;
        System.out.println(age2);
        age2 = age2 + 2;
        System.out.println(age2);

        //变量的范围
        {
            int a = 18;
            System.out.println(a);
        }
        int a = 20;
        System.out.println(a);

        //不赋初始值
        int num;
        num = 20;
        System.out.println(num);
    }
}
