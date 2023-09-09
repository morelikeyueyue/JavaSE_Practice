package ccom.itheima.a01staticdemo1.a01staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        //册数工具类中的两个方法
        int[] arr1 ={1,2,3,4,5};
        String str = ccom.itheima.a01staticdemo1.a01staticdemo2.ArrayUtil.printArr(arr1);
        System.out.println(str);


        double[] arr2 = {1.5,3.7,4.9,5.8,6.6};
        double avg = ccom.itheima.a01staticdemo1.a01staticdemo2.ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}
