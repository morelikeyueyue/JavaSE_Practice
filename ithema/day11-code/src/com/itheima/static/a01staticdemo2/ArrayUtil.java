package ccom.itheima.a01staticdemo1.a01staticdemo2;

import java.util.StringJoiner;

public class ArrayUtil {

    //˽�л����췽��
    private ArrayUtil(){}

    //���徲̬��,�������
    public static String printArr(int[] arr){
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
                sj.add(String.valueOf(arr[i]));
        }
        String str = sj.toString();
        return str;
    }

    //����ƽ��ֵ
    public static double getAverage(double[] arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        double avg=sum/arr.length;
        return avg;
    }
}
