package com.itheima.javabean;

public class StudentOperator {
    private Student student;

    public StudentOperator() {
    }

    public StudentOperator(Student student){
        this.student = student;
    }
    public void printPass(){
        System.out.println(student.getName() + (student.getScore() >= 60 ? "及格" : "不及格"));
    }
}
