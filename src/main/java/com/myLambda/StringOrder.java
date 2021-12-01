package com.myLambda;

public class StringOrder {
    public static int byLength(String s1, String s2){
        return s1.length() - s2.length();
    }
    public static int byLexicography(String s1, String s2){
        return s1.compareTo(s2);
    }
    //对名称按照字典顺序排序,但忽略大小写差异
    public static int byLexicographyIgnoreCase(String s1, String s2){
        return s1.compareToIgnoreCase(s2);
    }
}
