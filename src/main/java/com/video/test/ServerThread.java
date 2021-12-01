package com.video.test;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ServerThread implements Runnable{
    private Socket socket;
    public  ServerThread(final Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        try {
            InputStream in = socket.getInputStream();
            byte firstByte = (byte)in.read();
            int length = in.available();
            byte[] data =new byte[length+1];
            data[0]=firstByte;
            in.read(data,1,length);
            System.out.println("接收客户端的消息："+ new String(data));
            socket.shutdownInput();

            OutputStream out = socket.getOutputStream();
            System.out.println("发送给服务端的消息：");
            String resposeMessage = scanner.nextLine();
            out.write(resposeMessage.getBytes());
            out.flush();
            System.out.println("已经发送信息："+new String(resposeMessage.getBytes()));
            socket.shutdownOutput();

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
//优化：有网名
// 输入回车后消失输入值
