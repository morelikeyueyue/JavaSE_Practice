package com.itheima.myiotest9;

import java.io.*;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) throws IOException {
        /*
                Properties跟IO流结合的操作
         */

        //1.创建集合
        Properties prop  = new Properties();

        //2.添加数据
        prop.put("aaa","111");
        prop.put("bbb","222");
        prop.put("ccc","333");
        prop.put("ddd","555");

        //3.把集合中的数据以键值对的形式写到本地文件中
        FileOutputStream fos = new FileOutputStream("myiotest\\a.properties");
        prop.store(fos,"test");
        fos.close();



/*        BufferedWriter bw = new BufferedWriter(new FileWriter("myiotest\\a.properties"));
        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            bw.write(key+"="+value);
            bw.newLine();
        }
        bw.close();*/

    }
}
