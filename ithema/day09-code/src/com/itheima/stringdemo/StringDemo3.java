package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo3 {

    public static void main(String[] args) {
        //Ҫ��,��֤�û���¼,�ܹ������λ���
        //1.�������ַ����������洢�û���������
        String rightUsername = "zhangsan";
        String rightPassword = "123456";

        //2.����һ������������ѭ������
        int flag = 0;
//        ����ѭ��
        for (int i = 0; i < 4; i++) {
            //��flag�����ж�
            if(flag>2){
                //��������
                System.out.println("�Ѿ���������,��֤ʧ��");
                break;
            }else{
                //����������
//                ���������û���������
                Scanner sc = new Scanner(System.in);
                System.out.println("�������û���");
                String username = sc.next();
                System.out.println(username.equals(rightUsername));
                System.out.println("����������");
                String password = sc.next();
                System.out.println(password.equals(rightPassword));
                //�����жϺ���
                boolean judge = judegUser(username, password,rightUsername,rightPassword);
                System.out.println(judge);
                if (!judge) {
                    //����ȷ
                    System.out.println("�û����������벻��ȷ,���ٴ�����");
                    flag++;
                    if (flag==3){
                        System.out.println("�����˺ű�����,����ϵ����Ա");
                    }else {
                        System.out.println("����ʣ��" + (3 - flag) + "�λ���");
                    }
                }else{
                    //��ȷ
                    System.out.println("��¼�ɹ�");
                    break;
                }
            }
        }


/*        while (flag<3){
            Scanner sc = new Scanner(System.in);
            System.out.println("�������û���");
            String username = sc.next();
            System.out.println(username.equals(rightUsername));
            System.out.println("����������");
            String password = sc.next();
            System.out.println(password.equals(rightPassword));
            //�����жϺ���
            boolean judge = judegUser(username, password,rightUsername,rightPassword);
            System.out.println(judge);
            if (!judge) {
                //����ȷ
                System.out.println("�û����������벻��ȷ,���ٴ�����");
                flag++;
            }else{
                //��ȷ
                System.out.println("��¼�ɹ�");
                break;
            }
        }
        if(flag==3){
            System.out.println("�����Ĵ�");
        }*/



    }

    //�ж��û�������������ȷ
    //��ȷ����true ���󷵻�false
    public static boolean judegUser(String username, String password,String rightUsername,String rightPassword){
        if (username.equals(rightUsername)&&password.equals(rightPassword)){
            return true;
        }else {
            return false;
        }
    }
}
