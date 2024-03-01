package com.itheima.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        //目标：掌握常见的基本数据类型
        //1.整形：byte short int long
        byte a = 127;
        int b = 128;
        short c = 222;
        long d = 23303030l;//随便写的整数默认是int，若默认是long类型，数字后面加l
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        //2.浮点型：float double
        float e = 3.14f;//加f同理
        double f = 390.1;//随便写的小数默认是int
        System.out.println(e);
        System.out.println(f);

        //3.字符型：char
        char g = '中';
        System.out.println(g);

        //4.布尔类型


        //引用数据类型
        //String字符串类型
        String name = "张三";
        System.out.println(name);
    }
}
