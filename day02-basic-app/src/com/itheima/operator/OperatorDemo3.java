package com.itheima.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //目标：掌握扩展赋值运算符的使用，注意隐含的强制类型转换
        double a = 9.5;
        double b = 520;
        System.out.println(a += b);

        double i = 600;
        double j = 520;
        System.out.println(i -= j);

        int m = 10;
        int n = 5;
        System.out.println(m *= n);
        System.out.println(m /= n);
        System.out.println(m %= n);


        byte x = 10;
        byte y = 30;
        // x += y是错误的
        x = (byte)(x += y);
        System.out.println(x);

    }
}
