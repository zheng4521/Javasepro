package com.itheima.parameter;

public class MethodDemo2 {
    public static void main(String[] args) {
        //目标：理解引用类型的参数传递机制，也是值传递,传递的是地址因为引用类型传递的是地址
        int[] arr = {1, 2, 3};
        change(arr);
        System.out.println("main:" + arr[2]);
    }
    public static void change(int[] arr){
        System.out.println("方法内1：" + arr[2]);
        arr[2] = 4;
        System.out.println("方法内2：" + arr[2]);
    }
}
