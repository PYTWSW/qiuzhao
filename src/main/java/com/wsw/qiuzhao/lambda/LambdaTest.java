package com.wsw.qiuzhao.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wsw on 2019/9/2 10:40
 * Lambda表达式
 */
public class LambdaTest {
    public static void main(String[] args) {
        //线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1");
            }
        }).start();

        Runnable runnable = () -> System.out.println("t2");
        new Thread(runnable).start();

        new Thread(() -> System.out.println("t3")).start();

        new Thread(() -> run("t4")).start();

        new Thread(() -> {
            String str = "t5";
            System.out.println(str);
        }).start();

        //集合
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        for (String s : list) {
            System.out.println(s);
        }

        list.forEach((e) -> System.out.println(e));

    }

    private static void run(String str){
        System.out.println(str);
    }
}

