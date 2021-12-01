package com.myLambda;

import java.util.Arrays;

//目的,在底层用的是 String 的compareto 方法 所以在新特性将原来的
//Arrays.sort(names,StringOrder::byLength); 更进一步简写
public class StringDemo {
    public static void main(String[] args) {
        String[] names = {"Justin", "caterpa", "Bush"};
        Arrays.sort(names,String::compareTo);
        System.out.println(Arrays.toString(names));
    }
}
