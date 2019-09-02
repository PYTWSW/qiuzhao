package com.wsw.qiuzhao;

import lombok.Data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by wsw on 2019/9/2 17:36
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Person, String> hashMap = new HashMap<>();
        hashMap.put(new Person("张三", 22), "加拿大");
        hashMap.put(new Person("李四", 42), "英国");
        hashMap.put(new Person("王五", 71), "美国");

        //method(hashMap);
        method1(hashMap);
    }

    private static void method(HashMap<Person, String> hashMap){
        Set<Person> set = hashMap.keySet();
        Iterator<Person> iterator = set.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            String s = hashMap.get(p);
            System.out.println(p + ":" + s);
        }
    }

    private static void method1(HashMap<Person, String> hashMap){
        Set<Map.Entry<Person, String>> set = hashMap.entrySet();
        Iterator<Map.Entry<Person, String>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Person, String> e = iterator.next();
            System.out.println(e.getKey() + ":" + e.getValue());
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
}



