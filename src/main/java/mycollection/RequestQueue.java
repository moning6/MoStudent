package mycollection;
//意义：了解 队列的 基本使用方法 如 addfirst removefirst element getfirst addlast
//offerfirst() poll() peek()

import java.util.LinkedList;
import java.util.Queue;
import java.lang.Math;

import static java.lang.Math.random;

//定义接口Request 定义方法
interface Request{
    void execute();
}

public class RequestQueue {
// 主函数 创建对象，使用offerRequestTo process
    public static void main(String[] args) {
        Queue requests = new LinkedList();
        offerRequestTo(requests);
        process(requests);

    }
// offerRequestTo函数 计算
    static void offerRequestTo(Queue requests){
        //仿真请求加入队列
        for (int i = 0; i < 6; i++) {
            Request request = new Request(){
                public void execute(){
                    System.out.println("处理数据 @f@n"+Math.random() );
                }
            };
            //Queue队列 利用offer 推入对象 操作失败返回特意值
            requests.offer(request);
        }

    }
//入参值 判断是否为空 不空则推入
    static void process(Queue requests){
        while(requests.peek() != null){
            Request request = (Request) requests.poll();
            request.execute();
        }
    }

}
