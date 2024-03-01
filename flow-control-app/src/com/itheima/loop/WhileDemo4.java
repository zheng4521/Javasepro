package com.itheima.loop;

public class WhileDemo4 {
    public static void main(String[] args) {
        double paper = 0.1;
        double height = 8848860;
        int t = 0;
        while(paper < height){
            paper *= 2;
            t++;
        }
        System.out.println(t);
    }
}
