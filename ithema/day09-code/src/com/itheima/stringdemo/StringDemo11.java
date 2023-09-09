package com.itheima.stringdemo;

public class StringDemo11 {
    public static void main(String[] args) {
        //srting replace(旧值,新值) 替换
        //只有返回值才是替换后的结果
        //1.获取到说的话
        String talk = "你玩的真好SB,以后不要再玩了,TMD";

        //2.定义一个敏感词库
        String[] arr = {"TMD", "CNM", "SB", "MLGB"};

        String result =talk;
//        System.out.println(result);
        //3.循环得到数组里面的每一个敏感词,依次进行替换
        for (int i = 0; i < arr.length; i++) {
            result = result.replace(arr[i],"****");
//            System.out.println(result);
//            talk = talk.replace(arr[i],"****");
//            System.out.println(talk);

        }

        //2.把里面的敏感词TMD替换为***
//        String result = talk.replace("TMD", "***");

        //3.打印结果
        System.out.println(result);
//        System.out.println(talk);

    }
}
