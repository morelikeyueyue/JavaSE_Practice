package com.itheima.arithmeticperator;

public class ArithmecoperatorDemo5 {
    public static void main(String[] args) {
        //++ �� --
        int a = 10;
        a++;//���ú��
        ++a;//�ȼӺ���
        System.out.println(a);//12
        int b = 10;
        b--;
        --b;
        System.out.println(b);//8

        int c = a++;//�Ȱ�a��ֵ����c������
        int d = ++a;//�������ٰ�����֮���ֵ����d
        System.out.println(c);//12
        System.out.println(d);//14
        System.out.println(a++);//14
        System.out.println(a);//15
        System.out.println(++a);//16
    }
}
