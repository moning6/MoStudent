package com.video.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClinkDemo {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        while (true){
            Socket socket = new Socket("localhost",9999);
            OutputStream out = socket.getOutputStream();
            System.out.println("发送给服务端的消息：");
            String data = s.nextLine();
            out.write(data.getBytes());
            out.flush();
            System.out.println("已经发送信息："+new String(data.getBytes()));
            socket.shutdownOutput();

            InputStream in = socket.getInputStream();
            byte firstdata = (byte) in.read();
            int length = in.available();
            byte[] data1 = new byte[length+1];
            data1[0] = firstdata;
            in.read(data1,1,length);
            System.out.println("接受到服务端的消息："+ new String(data1));
            socket.shutdownInput();

        }



    }
}
