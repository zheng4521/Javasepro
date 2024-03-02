package com.itheima.constructor;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Test {
    public static void main(String[] args) {
        //目标：认识构造器，掌握构造器的特点，应用场景和注意事项
        Student s1 = new Student();
        Student s2 = new Student("1");
        System.out.println(s2.name);
    }
}
