package com.mning.mycollection;
/*
简答Lambda表达式
使用匿名类语法实现request接口的实例
Request request = new Request(){
public void execute(){
    out.printf("处理函数 %f%n",Math.random());
    }
};
Request request = () -> out.printf("处理函数 %f%n",Math.random());

同样的 有个IntegerFunction 接口方法  使用匿名类实现
public interface IntegerFunction{
    Integer apply(Integer i);
}
IntegerFunction doubleFunction = new IntegerFunction {
    public Integer apply(Integer i){
        return i * 2;
    }
}
IntegerFunction doubleFunction = (Integer i) ->  i * 2;
实际上 使用了IntegerFunction的实例 那么编译程序也就知道参数i的类型为 Integer 所以可以简写
IntegerFunction doubleFunction = (i) ->  i * 2;
实际上 若是单参数 又无需写出参数类型时 可以省略（）
IntegerFunction doubleFunction = i ->  i * 2;
 */

/*
java 9 开始 对于泛型也可以进行省略
 public interface Comparator<T>{
    int compare(T o1, T o2);
 }
用匿名类实现则
Comparator<String> byLength = new Comparator<String>(){
    public int compare(String name1, String name2){
        return name1.length() - name2.length();
    }
}
java 9  省略泛型
Comparator<String> byLength = new Comparator<>(){
    public int compare(String name1, String name2){
        return name1.length() - name2.length();
    }
}
java9 后 省略泛型 以及使用lambde 表达式后
Comparator<String> byLength = (name1, name2) -> name1.length() - name2.length;

 */

import java.util.LinkedList;
import java.util.Queue;

//定义接口Request 定义方法
interface Request2{
    void execute();
}

public class RequestQueue2 {
    // 主函数 创建对象，使用offerRequestTo process
    public static void main(String[] args) {
        Queue<Request2> requests = new LinkedList<>();
        offerRequestTo(requests);
        process(requests);

    }
    // offerRequestTo函数 计算
    static void offerRequestTo(Queue<Request2> requests){
        //仿真请求加入队列
        for (int i = 0; i < 6; i++) {
            //Queue队列 利用offer 推入对象 操作失败返回特意值
            requests.offer(
                    () -> System.out.println("处理数据 @f@n"+Math.random())
            );
        }

    }
    //入参值 判断是否为空 不空则推入
    static void process(Queue<Request2> requests){
        while(requests.peek() != null){
            Request request = (Request) requests.poll();
            request.execute();
        }
    }

}

