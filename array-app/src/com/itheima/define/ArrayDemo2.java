package com.itheima.define;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //目标：掌握数组的访问
        int[] arr = {12, 24, 36};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //修改数组中的数据
        arr[0] = 2;
        arr[2] = 2;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("-------------------------");
        //访问数组的元素个数
        System.out.println("数组的长度是" + arr.length);

        //获取数组的最大索引
        System.out.println("-------------------------");
        System.out.println("数组的最大索引是" + (arr.length - 1));//前提必须是数组中存在数据
    }
}
