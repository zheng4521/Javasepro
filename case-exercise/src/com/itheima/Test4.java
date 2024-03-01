package com.itheima;

public class Test4 {
    public static void main(String[] args) {
        //案例四：数字加密
        //System.out.println(encrypt(1983));
        System.out.println("加密后的结果是：" + encrypt(1983));
    }
    /*public static String encrypt(int num){
        int[] arr = new int[4];
        for (int i = arr.length - 1; i > -1 ; i--) {
            arr[i] = num % 10;
            arr[i] += 5;
            arr[i] %= 10;
            num /= 10;
        }
        String a = "";
        for(int i = 0, j = arr.length - 1; i < j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            a += arr[i];
        }
        return a;
    }*/
    public static String encrypt(int num){
        //1.密码拆分
        int[] arr = split(num);
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
            arr[i] %= 10;
        }
        String a = "";
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            a += arr[i];
        }
        return a;
    }


    private static void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }


    private static int[] split(int num) {
        int[] arr = new int[4];
        for (int i = arr.length - 1; i > -1; i--) {
            arr[i] = num % 10;
            num /= 10;
        }
        return arr;
    }
}
