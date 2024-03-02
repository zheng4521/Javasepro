package com.itheima.demo;

public class FilmOperator {
    private Film[] film;

    public FilmOperator(Film[] flim) {
        this.film = flim;
    }

    //展示所有电影信息
    public void printAllFilms(){
        System.out.println("---------系统全部电影信息如下：-----------");
        for (int i = 0; i < film.length; i++) {
            Film f = film[i];
            System.out.println("标号：" + f.getId());
            System.out.println("名称：" + f.getName());
            System.out.println("价格：" + f.getPrice());
            System.out.println("--------------------");
        }
    }

    //根据电影的标号查询出该电影的详细信息并展示
    public void searchFilmById(int id){
        for (int i = 0; i < film.length; i++) {
            Film f = film[i];
            if(f.getId() == id){
                System.out.println("该电影的详情如下：");
                System.out.println("编号：" + f.getId());
                System.out.println("名称：" + f.getName());
                System.out.println("价格：" + f.getPrice());
                System.out.println("得分：" + f.getScore());
                System.out.println("导演：" + f.getDirector());
                System.out.println("主演：" + f.getActor());
                System.out.println("其他：" + f.getInfo());
                return;
            }
        }
        System.out.println("没有该电影信息");
    }
}
