package com.itheima.object;

public class Student {
    String name;
    double chinese;
    double math;

    public void printTotalScore(){
        System.out.println(name + "总成绩是：" + (chinese + math));
    }
    public void printAverageScore(){
        System.out.println(name + "平均成绩是：" + (chinese + math) / 2);
    }
}
