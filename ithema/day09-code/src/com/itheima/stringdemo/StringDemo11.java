package com.itheima.stringdemo;

public class StringDemo11 {
    public static void main(String[] args) {
        //srting replace(��ֵ,��ֵ) �滻
        //ֻ�з���ֵ�����滻��Ľ��
        //1.��ȡ��˵�Ļ�
        String talk = "��������SB,�Ժ�Ҫ������,TMD";

        //2.����һ�����дʿ�
        String[] arr = {"TMD", "CNM", "SB", "MLGB"};

        String result =talk;
//        System.out.println(result);
        //3.ѭ���õ����������ÿһ�����д�,���ν����滻
        for (int i = 0; i < arr.length; i++) {
            result = result.replace(arr[i],"****");
//            System.out.println(result);
//            talk = talk.replace(arr[i],"****");
//            System.out.println(talk);

        }

        //2.����������д�TMD�滻Ϊ***
//        String result = talk.replace("TMD", "***");

        //3.��ӡ���
        System.out.println(result);
//        System.out.println(talk);

    }
}
