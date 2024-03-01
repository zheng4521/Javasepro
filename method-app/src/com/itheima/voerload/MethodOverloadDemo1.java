package com.itheima.voerload;

public class MethodOverloadDemo1 {
    public static void main(String[] args) {
        //目标：认识方法重载，并掌握其应用场景
        test();
        test(100);
    }
    public static void test(){
        System.out.println("test1");
    }
    public static void test(int a){
        System.out.println("test1" + a);
    }

    void test(double a, int b){

    }
    void test(int b, double a){

    }//顺序不同
}
