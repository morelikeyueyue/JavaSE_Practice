package com.itheima.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
    /*  public stringjoiner(�������)  ����һ��stringjoiner����,ָ��ƴ�ӵ�ʱ��������
        public stringjoiner(�������,��ʼ����,��������)  ��������,ָ��ƴ�ӵļ������\��ʼ����\��������
        ��������:add()   length()  toString()
        */

        //1.����һ������,��ָ���м�ļ������
        StringJoiner sj = new StringJoiner("---");

        //2.���Ԫ��
        sj.add("sdadas");
        System.out.println(sj);
        sj.add("124");
        System.out.println(sj);

    }
}
