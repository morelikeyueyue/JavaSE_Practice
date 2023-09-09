package com.iitheima.a10test4;

import java.util.UUID;

public class UUIDTest {
    public static void main(String[] args) {
        //获取UUID的对象
        System.out.println(UUID.randomUUID().toString().replace("-",""));
    }
}
