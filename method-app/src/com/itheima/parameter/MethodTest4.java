package com.itheima.parameter;

public class MethodTest4 {
    public static void main(String[] args) {
        //判断两个int类型的数组是否一样
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(equals(arr1, arr2));
    }
    public static boolean equals(int[] arr1, int[] arr2){
        if(arr1 == null && arr2 == null)
            return true;
        if(arr1 == null || arr2 == null)
            return false;
        if(arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == arr2[i])
                continue;
            else
                return false;
        }
        return true;
    }
}
