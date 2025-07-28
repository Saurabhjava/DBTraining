package com.db.mapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, String> m=new TreeMap<>();

        m.put("A","Apple");
        m.put("B","Book");
        m.put("E","Elephant");
        m.put("D","Dog");
        m.put("F","Fish");
        m.put("D","Doll");

        System.out.println(m);
        System.out.println(m.get("B"));
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.containsKey("B"));
    }
}
