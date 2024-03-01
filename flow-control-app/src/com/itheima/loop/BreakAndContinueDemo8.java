package com.itheima.loop;

public class BreakAndContinueDemo8 {
    public static void main(String[] args) {
        //目标：掌握break和continue的作用
        for (int i = 1; i < 6; i++) {
            System.out.println("我爱你" + i);
            if(i == 3)
                break;
        }

        for (int i = 1; i < 6 ; i++) {
            if(i == 3)
                continue;
            System.out.println("洗碗" + i);
        }
    }
}
