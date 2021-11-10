package com.mning.mycollection;

//了解List 的链接机制，
public class SimpleLinkedList {
    private class Node{
        Node(Object o){
            this.o = o;
        }
        Object o;
        Node next;
    }

    private Node first;

    public void add(Object elem){
        Node node = new Node(elem);
        if(first == null){
            first = node;
        }
        else {
            append(node);
        }
    }
    //下一值
    private void append(Node node) {
        Node last = first;
        while(last.next != null){
            last = last.next;
            last.next = node;
        }
    }
    //访问所有Node 并计数以获得长度
    public  int size(){
        int count = 0;
        Node last = first;
        while(last != null){
            last = last.next;
            count++;
        }
        return count;
    }
    //过程函数 包含检查size 返回findElemOf
    public  Object get(int index){
        checkSize(index);
        return findElemOf(index);
    }
    //检查Size 是否超出，超出则抛出异常
    private void checkSize(int index) throws IndexOutOfBoundsException{
        int size = size();
        if(index >= size){
            throw new IndexOutOfBoundsException(
                String.format("Index: @d, Size: @d",index,size)
            );
        }
    }
    //访问所有node 并且计算以取得对应的索引对象
    private Object findElemOf(int index){
        int count = 0 ;
        Node last = first;
        while(count < index){
            last = last.next;
            count++;
        }
        return last.o;
    }
}
