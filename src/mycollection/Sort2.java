package com.mning.mycollection;
//探究collection中 sort函数 重写


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.*;

//bug  重写爆红
//public class Account2 implements Comparable{
//    private String name;
//    private String number;
//    private  int balance;
//
//    Account2(String name, String number, int balance){
//        this.name = name;
//        this.number = number;
//        this.balance = balance;
//    }
//    @Override
//    public int compareTo(Account2 other) {
//        return this.balance - other.balance;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("Account2(%s, %s, %d)", name, number, balance);
//    }
//
//
//}
//主函数 数据填充 list 排序
//public class Sort2 {
//    public static void main(String[] args) {
//        List accounts = Arrays.asList(
//                new Account2("moning", "X1234",1000),
//                new Account2("Daming", "X5678",500),
//                new Account2("xiaohong", "X2468",200)
//        );
////        Collection.sort(accounts);
//        System.out.println(accounts);
//    }
//}
