package com.wsw.qiuzhao;

import lombok.Data;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by wsw on 2019/9/2 19:10
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Person, String> tm = new TreeMap<>();
        tm.put(new Person("张三", 22), "加拿大");
        tm.put(new Person("李四", 42), "英国");
        tm.put(new Person("王五", 71), "美国");

        entrySet(tm);
    }

    private static void entrySet(TreeMap<Person, String> tm){
        for (Map.Entry<Person, String> entry : tm.entrySet()) {
            Person p = entry.getKey();
            String value = entry.getValue();
            System.out.println(p + ":" + value);
        }
    }

    @Data
    private static class Person{
        private String name;
        private int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    private static class PersonComparator{

    }
}
