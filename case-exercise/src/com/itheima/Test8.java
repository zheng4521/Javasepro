package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        //案例八：实现双色球
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr4 = {8, 9, 3, 4, 5, 6, 7};
        //int arr1[] = userSelectNumber();
        /*System.out.println("用户的双色球号码为:");
        print(arr1);
        System.out.println();;
        int arr2[] = createLuckNumbers();
        System.out.println("本期的双色球号码为:");
        print(arr2);
        judge(arr1, arr2);*/
        judge(arr3, arr4);

    }
    public static int[] createLuckNumbers(){
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < arr.length - 1; i++) {
            int number = 0;
            number = r.nextInt(33) + 1;
            while (check(arr, number)) {
            number = r.nextInt(33) + 1;
            }
            arr[i] = number;
        }
        arr[6] = r.nextInt(16) + 1;
        return arr;
    }

    public static int[] userSelectNumber(){
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("请输入您的第" + (i + 1) + "个红色号码(1-33,不能重复):");
            int number = sc.nextInt();
            while((number < 1 || number > 33) ||check(arr, number)){
                System.out.println("输入重复，请重新输入：");
                number = sc.nextInt();
            }
            arr[i] = number;
        }
        System.out.println("请输入您的蓝色号码(1-16)：");
        int number = sc.nextInt();
        while(number > 16 || number < 1){
            System.out.println("输入错误，请重新输入：");
            number = sc.nextInt();
        }
        arr[6] = number;
        return arr;
    }
    public static void judge(int[] arr1, int[] arr2){
        int red = 0;
        int blue = 0;
        for (int i = 0; i < arr1.length - 1; i++) {
            if(judge1(arr1[i], arr2))
                red++;
        }
        if(arr1[6]  == arr2[6])
            blue = 1;
        if(blue == 0){
            switch (red){
                case 4:
                    System.out.println("中五等奖，奖金10元");
                    break;
                case 5:
                    System.out.println("中四等奖，奖金200元");
                    break;
                case 6:
                    System.out.println("中五等奖，奖金最高500万元");
                    break;
                default:
                    System.out.println("未中奖");
                    break;
            }
        }else{
            switch (red){
                case 0:
                case 1:
                case 2:
                    System.out.println("中六等奖，奖金5元");
                    break;
                case 3:
                    System.out.println("中五等奖，奖金10元");
                    break;
                case 4:
                    System.out.println("中四等奖，奖金200元");
                    break;
                case 5:
                    System.out.println("中三等奖，奖金3000元");
                    break;
                case 6:
                    System.out.println("中一等奖，奖金最高1000万元");
                    break;
                default:
                    System.out.println("未中奖");
                    break;
            }
        }
    }

    public static boolean check(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num)
                return true;
        }
        return false;
    }
    public static void print(int[] arr){
        if(arr == null)
            return;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
    }
    public static boolean judge1(int n, int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(n == arr[i])
                return true;
        }
        return false;
    }
}
