package com.itheima.branch;

public class SwitchDemo3 {
    public static void main(String[] args) {
        //目标：使用switch的穿透性简化代码
        String day = "周五";
        switch (day) {
            case "周一":
                System.out.println("埋头苦干，解决bug");
                break;
            case "周二":
            case "周三":
            case "周四":
                System.out.println("请求大牛程序员帮忙");
                break;
            case "周五":
                System.out.println("埋头苦干，解决bug");
                break;
            case "周六":
            case "周日":
                System.out.println("郁郁寡欢，准备上班");
                break;
            default:
                System.out.println("输入的星期不存在");
                break;

        }

    }
}