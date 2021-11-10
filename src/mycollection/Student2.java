package com.mning.mycollection;

import java.util.*;

public class Student2 {
    private String name;
    private String number;
    Student2(String name,String number){
        this.name = name;
        this.number = number;
    }
    //重写hashcode 设定
    @Override
    public int hashCode() {
//        return Objects.hash(this.name,this.number);
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.number);
        return hash;
    }

    //重写equals
    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final Student2 other = (Student2) obj;
        if (!Objects.equals(this.name, other.name)){
            return false;
        }
        if(!Objects.equals(this.number, other.number)){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", name, number);
    }

    //Students2 类 主函数 向 set类存放 新Students2对象
    public static class Students2 {
        public static void main(String[] args) {

        }
    }
}
