package ccom.itheima.a01staticdemo1.a01staticdemo2;

import java.util.StringJoiner;

public class ArrayUtil {

    //私有化构造方法
    private ArrayUtil(){}

    //定义静态的,方便调用
    public static String printArr(int[] arr){
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
                sj.add(String.valueOf(arr[i]));
        }
        String str = sj.toString();
        return str;
    }

    //返回平均值
    public static double getAverage(double[] arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        double avg=sum/arr.length;
        return avg;
    }
}
