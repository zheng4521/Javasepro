package com.itheima.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        int a = 10;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);

        --a;
        System.out.println(a);
        a--;
        System.out.println(a);

        int b = 10;
        int rs = b++;
        System.out.println(rs);
        rs = ++b;
        System.out.println(rs);

        int c = 10;
        rs = ++c;
        System.out.println(rs);
        rs = c++;
        System.out.println(rs);

        int m = 5;
        int n = 3;
        // m 5 6 5 4
        // n 3 4 3
        int result = ++m - --m  + m-- - ++n + n-- + 3;
        System.out.println(result);
        System.out.println(m);// 4
        System.out.println(n);// 3
    }
}
