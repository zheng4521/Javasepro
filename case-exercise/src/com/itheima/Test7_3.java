package com.itheima;

public class Test7_3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 101; i <= 200 ; i++) {
            if(check(i)){
                System.out.print(i + " ");
                sum++;
            }
        }
        System.out.println("\n" + sum);
    }
    public static boolean check(int a){
        for (int i = 2; i < a/2; i++) {
            if(a % i == 0)
                return false;
        }
        return true;
    }
}
