package com.itheima.define;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //目标：掌握动态初始化数组
        int[] ages = new int[3];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = i;
        }
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }


        System.out.println("---------------------------");
        char[] a = new char[2];
        for (int i = 0; i < a.length; i++) {
            System.out.println((int)a[i]);
        }


        System.out.println("---------------------------");
        double[] b = new double[2];
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }


        System.out.println("---------------------------");
        boolean[] c = new boolean[2];
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }


        System.out.println("---------------------------");
        String[] d = new String[2];
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
    }
}
