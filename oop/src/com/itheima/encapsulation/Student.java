package com.itheima.encapsulation;

public class Student {
    String name;
    private double score;

    public void printPass(){
        System.out.println(score > 60 ? "成绩及格" : "成绩不及格");
    }

    public void setScore(double score){
        this.score = score;
    }
    public double getScore(){
        return this.score;
    }
}
