package mycollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//意义：了解Arraylist的存储机制，按照索引的方式进行存储
//常用方法 add get toUpperCase
public class Guest {
    //主函数负责 对象使用collectNameTo 输出ArrayList 内容
    public static void main(String[] args) {
        List names = new ArrayList();
        collectNameTo(names);
        System.out.println("访问名单： ");
        printUpperCase(names);
    }
    //函数负责监听 键盘输入，保存 若是quit 则退出 内含while 循环
    static void collectNameTo(List names){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入名字：");
            String name = scanner.nextLine();
            if (name.equals("quit")){
                break;
            }
            names.add(name);
        }
    }
    //函数负责 输出ArrayList 对象
    static void printUpperCase(List names){
        for (int i = 0; i < names.size(); i++) {
            String name =(String)names.get(i);
            System.out.println(name.toUpperCase());
        }
    }


}
