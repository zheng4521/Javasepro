package com.itheima.define;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //数字案例训练
        int[] money = {16, 26, 36, 6, 100};
        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println("总销售额为" + sum + "万");
    }
}
