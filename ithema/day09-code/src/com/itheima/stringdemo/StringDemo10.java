package com.itheima.stringdemo;

public class StringDemo10 {
    public static void main(String[] args) {
/*        ���֤�鿴:           ������Ϣλ:
        7-14λ ����������          ����������:XXXX��X��X��
        17λ �Ա�                  �Ա�Ϊ:��/Ů
        */

        //1.����һ���ַ�����¼���֤����
        String id = "321281202001011234";

        //2.��ȡ����������
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);
//        System.out.println(year+" "+month+" "+day);
        System.out.println("������Ϣλ:");
        System.out.printf("����������Ϊ:%s��%s��%s��\n", year, month, day);

        //3.��ȡ�Ա�
        char gender = id.charAt(16);
        int genderNumber = gender - '0';
//        System.out.println(genderNumber);
        if(genderNumber%2==0) {
            //Ů
            System.out.println("�Ա�Ϊ:Ů");
        }else{
            //��
            System.out.println("�Ա�Ϊ:��");
        }

    }
}