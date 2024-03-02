package com.itheima.constructor;

public class Student {
    String name;


    //无参数构造器
    public Student(){
        System.out.println("触发无参数构造器");
    }

    //有参数构造器
    public Student(String name){
        System.out.println("触发有参数构造器");
        this.name = name;
    }
}
