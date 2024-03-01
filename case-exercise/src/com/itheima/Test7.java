package com.itheima;

public class Test7 {
    public static void main(String[] args) {
       int count = find(100, 200);
       System.out.println();
       System.out.println("素数的个数是：" + count);
    }
    public static int find(int a, int b){
        int sum = 0;
        int num = find1(b);//找最近的素数
        for (int i = a; i <= b ; i++) {
            boolean flag = true;
            for (int j = 2; j < i / 2 ; j++) {
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i == num ? i : i + ",");
                sum++;
            }
        }
        return sum;
    }
    public static int find1(int b){//找最近的素数
        int num = 0;
        for (int i = b; i > 0 ; i--) {
            boolean flag = true;
            for (int j = 2; j < i/2; j++) {
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                num = i;
                break;
            }
        }
        return num;
    }
}
