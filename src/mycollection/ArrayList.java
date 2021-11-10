package com.mning.mycollection;

import java.util.Arrays;
// <E>表示该类支撑泛型
public class ArrayList<E>{
    private Object[] elems;
    private int next;

    public ArrayList(int capacity){
        elems = new Object[capacity];
    }

    public ArrayList(){
        this(16);
    }
    //加入的对象必须是客户端声明的 E类型
    public void add(E e ){
        if (next == elems.length){
            elems = Arrays.copyOf(elems, elems.length * 2);
        }
        elems[next++] = e;
    }
    //取回对象 以客户端声明的 E型态返回
    public E get (int index){
        return (E) elems[index];
    }

    public int size(){
        return next;
    }

}
