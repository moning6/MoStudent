package com.mning.mycollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordCount {
    //主函数，监听输入 将监听的后通过tokenSet函数返回hashset值保存在words 中，Set的特性：对象存储无序，且相同对象hashset相同
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入英文 ");
        Set words = tokenSet(console.nextLine());
        System.out.println("不重复单词" + words.size()+"个："+ words);
    }
    //tokenSet函数 将监听按照“ ” 的方式切割，返回hashset
    static Set tokenSet(String line){
        String[] token = line.split(" ");
        return new HashSet(Arrays.asList(token));
}
}
