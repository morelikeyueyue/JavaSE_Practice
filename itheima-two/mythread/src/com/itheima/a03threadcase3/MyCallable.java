package com.itheima.a03threadcase3;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum+=i;
        }
        return sum;
    }
}
