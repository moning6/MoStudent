package com.mning.mycollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Map<String, String> messages = new HashMap<>();
        messages.put("Justin","Hello,信息");
        messages.put("Monica","Hello,悄悄话");
        messages.put("Daming","等待下");

        //键盘监听 取谁的键值
        Scanner console = new Scanner(System.in);
        System.out.println("取得谁的信息");
        String message = messages.get(console.nextLine());
        System.out.println(message);
        System.out.println(messages);

    }
}
