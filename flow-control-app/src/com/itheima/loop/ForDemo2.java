package com.itheima.loop;

public class ForDemo2 {
    public static void main(String[] args) {
        //目标：使用for循环批量产生数据
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
        System.out.println("-----------------------------------");


        int total = 0;
        for (int i = 0; i <= 100; i++) {
            total += i;
        }
        System.out.println("1-100的数据和为" + total);


        System.out.println("-----------------------------------");
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            if(i % 2 == 1)
                sum += i;
        }
        System.out.println("1-100的奇数和为" + sum);


        System.out.println("-----------------------------------");
        int sum1 = 0;
        for (int i = 1; i < 101; i += 2) {
                sum1 += i;
        }
        System.out.println("1-100的奇数和为" + sum1);


    }




}
