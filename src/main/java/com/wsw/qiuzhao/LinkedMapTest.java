package com.wsw.qiuzhao;

import java.util.LinkedHashMap;

/**
 * Created by wsw on 2019/9/2 19:04
 */
public class LinkedMapTest {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        lhm.put("a", "65");
        lhm.put("b", "67");
        lhm.put("c", "668");

        for (String key : lhm.keySet()) {
            System.out.println(lhm.get(key));
        }
    }
}
