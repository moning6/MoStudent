package mycollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//目的： map put的方法
public class Messages {
    public static void main(String[] args) throws Exception{
        Map<String, String> messages = new HashMap<>();
        messages.put("Moning","我自己");
        messages.put("fohua","我的好朋友");
        messages.put("xianqian","他是老铁");
        messages.keySet().forEach( key -> System.out.println(key));
        //键盘监听 取谁的键值
        while(true){
            Scanner console = new Scanner(System.in);
            System.out.println("想取得谁的信息");
            String message = messages.get(console.nextLine());

            if (message.equals("quit")) {
                break;
            }
            System.out.println(message);
        }
    }
}
