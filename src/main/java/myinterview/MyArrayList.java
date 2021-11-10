package myinterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//目的： 了解数组转换成list list 转换为数组并且遍历
public class MyArrayList {
    public static void main(String[] args) {
        String[] arg = {"zs","ls","ws"};
        List<String> list = Arrays.asList(arg);
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("张三");
        list1.add("李四");
        list1.add("王四");
        String[] arr1 = list1.toArray(new String[list.size()]);
        System.out.println(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }
    }
}
