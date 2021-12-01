package com.video.test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);

        while (true){
            Socket socket = serverSocket.accept();
            new Thread (new ServerThread(socket)).start();
        }

    }
}
