package com.itheima.define;

public class MethodDemo2 {

    public static void main(String[] args) {
        //目标：设计合理的方法来解决实际问题

        //需求1：打印
        printHelloWorld(2);
        System.out.println("-------------------");
        printHelloWorld(3);

    }
    public static void printHelloWorld(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World!");//void无返回值
        }
    }
}
