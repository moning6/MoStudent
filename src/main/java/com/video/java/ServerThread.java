package com.video.java;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
//继承线程接口类
//目的：利用流机制 将监听到的输入流显示，并在服务中写入输出流发送给客户端
public class ServerThread implements Runnable{
    private final Socket socket;
    //有参构造方法
    public ServerThread(final Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
            //接收客户消息　try ctach
        try {
            InputStream in = socket.getInputStream();
            byte firstByte =(byte) in.read();
            int length = in.available();
            byte[] data = new byte[length+1];//以length为长度+1 编写数据包
            data[0] = firstByte;//数据包第一位先放入 第一字节
            in.read(data,1,length); //从第一位后读
            System.out.println("客户端： " +new String(data));//输出字符串的数据包
            socket.shutdownInput();//关闭流

            //向客户端相应
            OutputStream out = socket.getOutputStream();//输出流
            System.out.print("服务端： ");
            String resposeMessage = scanner.nextLine();//创建请求信息接收输入请求
            out.write(resposeMessage.getBytes());//得到对象的字符串进行写入
            out.flush();//刷新当前输出流
            socket.shutdownOutput();

            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
