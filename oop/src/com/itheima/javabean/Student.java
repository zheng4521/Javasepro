package com.itheima.javabean;

public class Student {

    private String name;
    private double score;
    //要求1：
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //要求2:

    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }
}
