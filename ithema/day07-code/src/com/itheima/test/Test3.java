package com.itheima.test;

/**
 * @author 25718
 */
public class Test3 {
    public static void main(String[] args) {
        //�ж�101~200֮���ж�������,��������������
//             ctrl+alt+M  �Զ���ȡ����
        int sum = 0;
        boolean flage;
        for (int i = 101; i < 201; i++) {
            flage = judgenumber(i);
            if (flage) {
                sum++;
            }
        }
//        flage = judgenumber(103);
//        System.out.println(flage);
        System.out.println("����" + sum + "������");
    }

    public static boolean judgenumber(int number) {
        boolean flag =false;
        int i;
        for (i = 2; i < number; i++) {
//            System.out.println(i);
            if (number % i == 0) {
                flag = false;
                break;
            }
            if (i == number-1) {
                flag = true;
        }
//        if (i == number) {
//            flag = true;
        }
        return flag;
    }
}
