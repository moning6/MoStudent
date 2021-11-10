package com.mning.mycollection;

import java.util.ArrayDeque;
import java.util.Deque;

//意义： 利用deque 的addfirst  poll offerfirst peek get
public class Stack {
    private Deque elems= new ArrayDeque();
    private int capacity;

    public Stack(int capacity){
        this.capacity = capacity;
    }
    //判断是否满了，没满就character
    public boolean push(Object elem){
        if(isFull()){
            return false;
        }
        return elems.offerLast(elem);
    }
    //防插入的 数据溢出
    private boolean isFull(){
        return elems.size() + 1 > capacity;
    }

    private Object pop(){
        return elems.pollLast();
    }
    public Object peek(){
        return elems.peekLast();
    }

    public int size(){
        return elems.size();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
//        Stack.push("Justin");
//        Stack.push("Monica");
//        Stack.push("Irene");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
