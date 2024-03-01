package com.itheima.branch;

public class IfDemo1 {
    public static void main(String[] args) {
        //目标：掌握if分支三种形式的用法和执行流程
        //需求：测量用户体温，发现体温高于37度就报警
        double t = 37.9;
        if(t > 37){
            System.out.println("这个人的温度异常，把他赶紧带走");
        }

        //需求2：发红包，你的钱包余额是99元，现在要发出90
        //如果够，触发发钱包的动作，如果不够，则提示余额不足
        double money = 89;
        if(money >= 90){
            System.out.println("发红包成功了");
        }else{
            System.out.println("余额不足");
        }

        //需求3
        int score = 78;
        if(score >= 0 && score < 60){
            System.out.println('D');
        }else if(score >= 60 && score < 80){
            System.out.println('C');
        }else if(score >= 80 && score < 90){
            System.out.println('B');
        }else if(score >= 90 && score <= 100){
            System.out.println('A');
        }
    }

}
