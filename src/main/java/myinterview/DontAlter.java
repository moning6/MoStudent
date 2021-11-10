package myinterview;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//目的 确保集合（如map，list，set）不会被修改
//结论 被Collections.unmodifiableMap修饰的对象 会报UnsupportedOperationException 不能修改put

public class DontAlter {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("1","第一值");
        hashMap.put("2","第二值");
        hashMap.put("3","第三值");
        System.out.println(hashMap);

        Map<String, String> hashMap1 =Collections.unmodifiableMap(hashMap);
        hashMap1.put("4","第四值");
        System.out.println(hashMap1);
    }
    //Exception in thread "main" java.lang.UnsupportedOperationException
    //	at java.util.Collections$UnmodifiableMap.put(Collections.java:1459)
    //	at myinterview.DontAlter.main(DontAlter.java:18)


}
