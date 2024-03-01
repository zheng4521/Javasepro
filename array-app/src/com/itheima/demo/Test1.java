package com.itheima.demo;

public class Test1 {
    public static void main(String[] args) {
        //求数组最值
        int[] scores = {15, 9000, 10000, 20000, 9500, -5};
        int max = scores[0];//注意初始值
        int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if(max < scores[i])
                max = scores[i];
            if(min > scores[i])
                min = scores[i];
        }
        System.out.println("最大值是：" + max);
        System.out.println("最小值是：" + min);
    }
}
