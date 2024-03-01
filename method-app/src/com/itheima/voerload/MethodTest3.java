package com.itheima.voerload;

public class MethodTest3 {
    public static void main(String[] args) {
        //目标：掌握return单独使用的场景

    }
    public static void a(int a, int b) {
        if (b == 0)
            return;
        int c = a / b;
        System.out.println("结果是:" + c);
    }
}