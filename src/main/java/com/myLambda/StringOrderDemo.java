package com.myLambda;

import java.util.Arrays;
//目的,
// 在 Arrays.sort(names, (name1, name2) -> StringOrder.bylength(name1, name2);
// 进行新特性重用的方法

public class StringOrderDemo {
    public static void main(String[] args) {
        String[] names = {"Justin", "caterpa", "Bush"};
        Arrays.sort(names,StringOrder::byLength);
        System.out.println(Arrays.toString(names));
    }
}
