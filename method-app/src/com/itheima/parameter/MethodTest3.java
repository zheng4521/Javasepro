package com.itheima.parameter;

public class MethodTest3 {
    public static void main(String[] args) {
        //目标：完成打印int类型的数组内容
        int[] arr = {10, 30, 50, 70};
        printArray(arr);
    }
    public static void printArray(int[] arr){
        if (arr == null)//严谨性
            return;


        System.out.print("[");
/*        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + ",");
        }*/
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }
}
