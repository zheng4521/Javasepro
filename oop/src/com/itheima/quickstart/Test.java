package com.itheima.object;

public class Test {
    public static void main(String[] args) {
        //面向对象编程快速入门
        com.itheima.object.Student s1 = new com.itheima.object.Student();
        s1.name = "小明";
        s1.chinese = 100;
        s1.math = 98;
        s1.printTotalScore();
        s1.printAverageScore();
    }
}

