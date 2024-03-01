package com.itheima.parameter;

public class MethodDemo1 {
    public static void main(String[] args) {
        //目标：理解基本类型的参数传递机制，值传递
        int a = 10;
        change(a);
        System.out.println("main:" + a);
    }

    public static void change(int a){
        System.out.println("change1:" + a);
        a = 20;
        System.out.println("change2:" + a);
    }
}
