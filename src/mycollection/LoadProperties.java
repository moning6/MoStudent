package com.mning.mycollection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

//map 方法种第三种方法，Properties
//setproperties 指定字符串类型的键值，getproperties 指定字符串类型的键
public class LoadProperties {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        props.load(new FileReader(args[0]));
        System.out.println(props.getProperty("cc.openhome.username"));
        System.out.println(props.getProperty("cc.openhome.password"));
    }
}
