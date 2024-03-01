package com.itheima.scanner;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //1.导包：一般不需要我们自己做，软件能自动导包
        //2.抄写代码
        Scanner sc = new Scanner(System.in);

        //开始调用sc的功能，来接受键盘输入的数据

        System.out.println("请您输入您的年龄：");
        int age = sc.nextInt();//执行到这，会开始等待用户输入一个整数，指导用户按了回车键，才会拿到数据
        System.out.println("您的年龄是" + age);
        System.out.println("请输入您的姓名：");
        String name = sc.next();
        System.out.println("欢迎您进入系统");
    }
}
