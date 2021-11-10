package mycollection;

import java.util.HashMap;
import java.util.Map;

// 访问Map的键值 利用keySet() 方法访问Map键值 取键   利用values 取值
//hashMap 方法得出结果是无序的  而 TreeSet结果是有序的
public class MapKeyValue {
    public static void main(String[] args) {
        //以泛型语法指定键值类型
        Map<String, String> map = new HashMap<>();
        map.put("one","一");
        map.put("two","二");
        map.put("three","三");

        System.out.println("显示键");
        map.keySet().forEach(key -> System.out.println(key));

        System.out.println("显示值");
        map.values().forEach(key -> System.out.println(key));
    }
}
//错误: 找不到或无法加载主类 com.mning.mycollection.MapKeyValue