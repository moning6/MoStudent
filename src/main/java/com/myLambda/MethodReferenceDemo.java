package com.myLambda;

import java.util.ArrayList;
import java.util.*;
import java.util.function.Function;
import static java.lang.System.out;

//目的: 方法和构造函数参考
class Person {
    String name;

    Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class MethodReferenceDemo {
    static <P, R> List<R> map(List<P> list, Function<P, R> mapper) {
        List<R> mapped = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            mapped.add(mapper.apply(list.get(i)));
        }
        return mapped;
    }

    public static void main(String[] args) {
        //书中用到java9 List.of(args) 同等于new ArrayList<>();  list.add()
        List<String> names =new ArrayList<>();
        names.add("args");
        List<Person> persons = map(names, Person::new);
        persons.forEach(out::println);
    }
}
