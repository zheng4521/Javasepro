package com.itheima.memory;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //目标：认识多个变量指向同一个数组的形式，并掌握其注意事项
        int[] arr1 = {11, 22, 33};

        //arr1赋值给arr2的是地址
        int[] arr2 = arr1;
    }
}
