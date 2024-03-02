package com.itheima.demo;

import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //1.设计一个电影类

        //2.设计一个操作类

        Film[] film = new Film[4];
        film[0] = new Film(1, "水门桥", 38.9, 9.8, "徐克", "吴京", "12万人想看");
        film[1] = new Film(2, "水门桥", 38.9, 9.8, "徐克", "吴京", "12万人想看");
        film[2] = new Film(3, "水门桥", 38.9, 9.8, "徐克", "吴京", "12万人想看");
        film[3] = new Film(4, "水门桥", 38.9, 9.8, "徐克", "吴京", "12万人想看");
        FilmOperator operator = new FilmOperator(film);
        /*operator.printAllFilms();
        operator.searchFilmById(3);*/
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==电影系统信息==");
            System.out.println("1.查询全部电影信息");
            System.out.println("2.根据id查询某个电影的详细信息");
            System.out.print("请您输入操作指令：");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    operator.printAllFilms();
                    break;
                case 2:
                    System.out.println("请您输入id：");
                    int id = sc.nextInt();
                    operator.searchFilmById(id);
                    break;
                default:
                    System.out.println("您输入的命令有误");
                    break;
            }
        }


    }
}
