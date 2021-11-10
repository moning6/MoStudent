package mycollection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.reverseOrder;
//JAVA8 为排序加入了语义高的API nullsFirst() 让null 提前后排序
//目的 是学习为了应对各种排序需求 JAVA8 提供更多的API
public class Sort6 {
    public static void main(String[] args) {
        List words = Arrays.asList("B","X","A","M",null,"F","W","O",null);
        words.sort(Comparator.nullsFirst(reverseOrder()));
        System.out.println(words);
    }
}

