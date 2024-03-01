package com.itheima.memory;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //目标：掌握普通变量，数组在计算机中的执行原理,以及区别
        //java程序在计算机中的执行过程
        int a = 10;
        System.out.println(a);

        int[] arr = {1, 2, 3};
        System.out.println(arr);
        System.out.println(arr[1]);

        arr[0] = 2;
        arr[0] = 3;
        arr[0] = 4;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }
}
