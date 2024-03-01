package com.itheima;

public class Test5 {
    public static void main(String[] args) {
        //案例五：数组拷贝
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = copy(arr1);
        print(arr2);
    }
    public static int[] copy(int[] arr1){
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        return arr2;
    }
    public static void print(int[] arr){
        if(arr == null)
            return;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
    }
}
