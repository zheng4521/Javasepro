package com.itheima.define;

public class MethodDemo1 {
    public static void main(String[] args) {
        //目标：掌握定义方法的完整格式，搞清楚使用方法的好处
        int c = sum(10, 20);
        System.out.println(c);

    }


    public static int sum(int a, int b){
        int c = a + b;
        return c;
    }
}
