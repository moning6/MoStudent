package com.mning.mycollection;

import java.util.Map;
import java.util.TreeMap;
//Treemap 方法 获取键值  可以获得有顺序的结果
public class MapKeyValue2 {
    public static void main(String[] args) {
            Map<String, String> massage = new TreeMap<>();
            massage.put("one","一");
            massage.put("two","二");
            massage.put("three","三");
            System.out.println(massage);

    }
}
