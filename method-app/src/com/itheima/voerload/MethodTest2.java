package com.itheima.voerload;

public class MethodTest2 {
    public static void main(String[] args) {
        //目标：掌握方法重载的应用场景
        fire();
        fire("美国");
        fire("美国", 99);
    }
    public static void fire(){
        //System.out.println("默认给岛国发射了一枚武器");
        fire("岛国");
    }
    public static void fire(String country){
        //System.out.println("发射了一枚武器给" + country);
        fire(country, 1);
    }
    public static void fire(String country, int num){
        System.out.println("发射了" + num + "枚武器给" + country);
    }
}
