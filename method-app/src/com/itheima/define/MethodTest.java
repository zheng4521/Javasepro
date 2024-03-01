package com.itheima.define;

public class MethodTest {
    public static void main(String[] args) {
        //目标：掌握设计方法的技巧(三步判断)
        int sum = add(10);
        System.out.println(sum);

        a(5);

    }
    public static int add(int n){
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        return sum;
    }

    public static  void a(int n){
        if(n % 2 == 0)
            System.out.println(n + "是偶数");
        else
            System.out.println(n + "是奇数");
    }
}
