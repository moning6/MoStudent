package mycollection;

import java.util.*;

//当在进行排序 重写comparator，当对象无法操作comparable
class StringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}
//主类型 负责输入 数据到对象 通过
public class Sort3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("B","X","A","M","F","W","O");
        Collections.sort(words,new StringComparator());
        System.out.println(words);
    }
}
