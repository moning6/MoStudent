package com.video.java;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 目的了解服务端和客户端连接机制 以及TCP机制
 * 服务器
 *socket为0的原因
 * 1.文件流一般不会受阻，网络流没有收到数据 read会受阻的
 * 2.网络的通讯是间断的
 * 3.无论网络是否会受阻，先读一个字节
 */

public class ServerDemo {
    public static void main(String[] args) throws Exception{
        //单线程 服务器
//        ServerSocket server = new ServerSocket(9999);
//        System.out.println("服务器启动");
//        //创建监听
//        //当服务器启动时，激活监听
        //监听活动
//        Socket socket = server.accept();
//        InputStream in = socket.getInputStream();
//        byte[] data = new byte[in.available()];
//        in.read(data);
//        socket.shutdownInput();//单方面关闭输入流
//        System.out.println(new String(data));
//        //向客户端响应
//        OutputStream out = socket.getOutputStream();
//        out.write("hello clint".getBytes());
//        out.flush();
//        socket.shutdownOutput();


//普通的关闭
//        in.close();
//        socket.close();
        ServerSocket server = new ServerSocket(9999);
        System.out.println("服务器启动");
        while(true){
            //创建监听
            // 当有客户端访问的时候，激活监听
            Socket socket = server.accept();
            //NIO 一个请求 一次进程
            //每次收到一个客户端的消息后，都会立即交给一个独立的线程处理
            new Thread(new ServerThread(socket)).start();

        }
        //bug: 1. 就是只能回一段消息  不能多次发送
        //然后 不能刷新


    }
}
