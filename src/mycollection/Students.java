package com.mning.mycollection;

//意义：若是不重写equals和hashcode 则形同的对象，会出现 ，原因：因为你没说什么样的才算重复
//利用Set 机制存放对象，显示结果为 设置的三个对象均存在，1 3 对象重复

import java.util.HashSet;
import java.util.Set;

class Student {
    private String name;
    private String number;
    Student(String name, String number){
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", name, number);
    }
    //Students 类 主函数 向 set类存放 对象
    public static class Students {
        public static void main(String[] args) {
            Set students = new HashSet();
            students.add(new Student("xiaoming","45678"));
            students.add(new Student("daming","4123"));
            students.add(new Student("xiaoming","45678"));
            System.out.println(students);
        }
    }
}
/*  */