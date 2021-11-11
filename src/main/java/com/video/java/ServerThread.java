package com.video.java;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ServerThread implements Runnable{
    private final Socket socket;
    public ServerThread(final Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
            //接收客户消息
        try {
            InputStream in = socket.getInputStream();
            byte firstByte =(byte) in.read();
            int length = in.available();
            byte[] data = new byte[length+1];
            data[0] = firstByte;//第一位先放入数组
            in.read(data,1,length); //从第一位后读
            System.out.println("客户端： " +new String(data));
            socket.shutdownInput();

            //向客户端相应
            OutputStream out = socket.getOutputStream();
            System.out.print("服务端： ");
            String resposeMessage = scanner.nextLine();
            out.write(resposeMessage.getBytes());
            out.flush();
            socket.shutdownOutput();

            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
