package com.wsw.qiuzhao;

import lombok.Data;

import java.util.Set;
import java.util.TreeMap;

/**
 * Created by wsw on 2019/9/2 16:08
 */
public class ComparableTest {
    public static void main(String[] args) {
        TreeMap<Person, String> pdata = new TreeMap<>();
        pdata.put(new Person("张三", 30), "zhangsan");
        pdata.put(new Person("李四", 20), "lisi");
        pdata.put(new Person("王五", 10), "wangwu");

        Set<Person> keys = pdata.keySet();
        for (Person key : keys) {
            System.out.println(key.getAge() + "-" + key.getName());
        }

    }
}

@Data
class Person implements Comparable<Person> {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (this.age > o.getAge()){
            return 1;
        }else if (this.age < o.getAge()){
            return -1;
        }
        return age;
    }
}