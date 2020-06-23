package com.practice.beforeUEA.maps;

import java.util.*;

public class PraticeMaps {

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "one");
        hashMap.put(2,"two");
        hashMap.put(3,"three");

        //using simple for loop for traversal
        for(Map.Entry m: hashMap.entrySet()) {
           // System.out.println(m.getKey() + " " + m.getValue());
        }

        //using Iterator
        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("[Key] : " + entry.getKey() + " [Value] : " + entry.getValue());
        }

        //using set
        Set<Map.Entry<Integer, String>> s = hashMap.entrySet();
        for(Map.Entry<Integer, String> it : s) {
            System.out.println(it.getKey() + " " + it.getValue());
        }

        Map<Integer, String> hashtable = new Hashtable<>();

    }
}
