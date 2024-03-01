package com.itheima.demo;

import java.lang.module.FindException;
import java.net.BindException;
import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int[] scores = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入工号：");
            scores[i] = sc.nextInt();
        }
        System.out.println("原来的员工序号为：");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();

        Random r = new Random();
        for (int i = 0; i < scores.length; i++) {
            int index = r.nextInt(5);
            int temp = scores[i];
            scores[i] = scores[index];
            scores[index] = temp;
        }
        System.out.println("打乱后的员工序号为：");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
    }
}
