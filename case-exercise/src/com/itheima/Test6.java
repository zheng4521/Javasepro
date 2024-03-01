package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        //案例六：抢红包
        int[] arr = {9, 666, 188, 520, 99999};
        start1(arr);

    }

    public static void start(int[] arr) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入任何内容进行抽奖:");
            sc.next();
            int index = r.nextInt(arr.length);
            while (arr[index] == 0){
                index = r.nextInt(arr.length);
            }
            System.out.println("恭喜您抽中" + arr[index] + "元");
            arr[index] = 0;
        }
        System.out.println("活动结束");
    }
    public static void start1 (int[] arr){
        method(arr);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入任何内容进行抽奖:");
            sc.next();
            System.out.println("恭喜您抽中" + arr[i] + "元");
        }
    }
    public static int[] method(int[] arr){
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }
}
