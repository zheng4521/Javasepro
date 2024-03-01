package com.itheima.loop;

public class LoopNestedDemo7 {
    public static void main(String[] args) {
        //目标：搞清楚循环嵌套的执行流程
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.println("我爱你");
            }
        }


        System.out.println("--------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
