package com.video.java;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端
 * @ param args
 */
public class ClinkDemo {
    public static void main(String[] args) throws Exception {
        /*
        服务器IP  服务器端口
        * */
        Scanner scanner = new Scanner(System.in);
        //循环发送
        while (true) {
            Socket socket = new Socket("localhost", 9999);
            System.out.print("客户端：");
            String requestMassage = scanner.nextLine();

            OutputStream out = socket.getOutputStream();
            out.write(requestMassage.getBytes());
            out.flush();
            socket.shutdownOutput();//单方面关闭输出值

            InputStream in = socket.getInputStream();
            byte firstByte =(byte) in.read();
            int length = in.available();
            byte[] data = new byte[length+1];
            data[0] = firstByte;//第一位先放入数组
            in.read(data,1,length); //从第一位后读
            socket.shutdownInput();//单方面关闭输入值
            System.out.println("服务端： "+ new String(data));

        }

//        out.close();
//        socket.close();

    }
}
