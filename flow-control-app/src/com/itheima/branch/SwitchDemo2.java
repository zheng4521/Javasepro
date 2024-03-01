package com.itheima.branch;

public class SwitchDemo2 {
    public static void main(String[] args) {
        //目标：掌握switch的写法，理解其执行流程
        String day = "周三";
        switch (day){
            case "周一":
                System.out.println("埋头苦干，解决bug");
                break;
            case "周二":
                System.out.println("请求大牛程序员帮忙");
                break;
            case "周三":
                System.out.println("今晚啤酒、龙虾、小烧烤");
                break;
            case "周四":
                System.out.println("今晚吃鸡");
                break;
            case "周五":
                System.out.println("埋头苦干，解决bug");
                break;
            case "周六":
                System.out.println("埋头苦干，解决bug");
                break;
            case "周日":
                System.out.println("郁郁寡欢，准备上班");
                break;
            default:
                System.out.println("输入的星期不存在");
                break;
        }
    }
}
