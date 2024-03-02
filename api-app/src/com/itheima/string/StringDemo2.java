package com.itheima.string;

public class StringDemo2 {
    public static void main(String[] args) {
        //熟悉String常用方法(不能停留在方法层面，而是解决问题层面）
        String s = "黑马Java";

        //1.获取字符串长度
        System.out.println(s.length());

        //2.获取字符串中某个索引位置处的字符
        System.out.println(s.charAt(1));

        //字符串的遍历
        for (int i = 0; i < s.length(); i++) {
            System.out.print((i == s.length() - 1) ? s.charAt(i) : s.charAt(i) + ",");
        }

        //3.将字符串转换成字符数组
        char[] c = s.toCharArray();


        //4.判断字符内容是否相等
        String s1 = new String("黑马Java");
        System.out.println();
        System.out.println(s == s1);//判断的是地址
        System.out.println(s.equals(s1));//判断的是字符串内容

        //5.忽略大小写比较字符串(有中文和数字也行)(通常比较验证码)
        String s2 = "黑马jAVA";
        String s3 = "java2";
        String s4 = "JaVa2";
        System.out.println(s.equalsIgnoreCase(s2));
        System.out.println(s3.equalsIgnoreCase(s4));

        //6.截取字符串内容(抱歉不薄厚)
        String s5 = "Java是最好的编程语言之一";
        System.out.println(s5.substring(0, 8));

        //7.截取
        System.out.println(s5.substring(5));


        //8.把字符中某些内容替换为新的内容，并返回结果给我们
        String info = "这个电影真是垃圾";
        String info1 = info.replace("垃圾", "**");
        System.out.println(info1);

        //9.判断字符串中是否包含某个关键字
        String info2 = "Java是最好的编程语言之一";
        System.out.println(info2.contains("Java"));
        System.out.println(info2.contains("java"));

        //10.判断字符串是否以某个字符串开头
        String s6 = "张三丰";
        System.out.println(s6.startsWith("张三"));

        //11.把字符串按照某个指定内容分割成多个字符串，放到一个字符串数组中返回给我们
        String r7 = "张无忌， 吴京， 刘昊然";
        String[] names = r7.split("，");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
