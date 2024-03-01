package com.itheima.loop;

public class ForDemo1 {
    public static void main(String[] args) {
        //目标：掌握for循环的书写格式，并理解其执行流程
        //执行流程，和自己想的不一样
        for(int i = 0; i < 5; ++i) {
            System.out.println("Hello World!");
            System.out.println(i);
        }
        for(int i = 0; i < 5; i++){
            System.out.println("Hello World!");
            System.out.println(i);
        }
        //前++和后++是一样的，因为判断在前，而++在后（没处用）
        //i在for括号内定义，范围有限，for结束后i就没了
    }
}
