package com.itheima.random;

import java.util.Random;
import java.util.Scanner;

public class RandowDemo2 {
    public static void main(String[] args) {
        Random r = new Random();
        int data = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入一个数字:");
            int number = sc.nextInt();
            if(number > data)
                System.out.println("过大");
            else if(number < data)
                System.out.println("过小");
            else{
                System.out.println("成功");
                break;
            }
        }
    }
}
