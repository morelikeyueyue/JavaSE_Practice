package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        /*����:
        Ͷע������6�������1���������
        �����1~33��ѡ��,������1~16��ѡ��
         */
        //����:
        //1.ϵͳ��������н�����
        int[] arr =createNumbers();
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        //2.�û����빺��ĺ���
        int[] userInputArr = userInputNumber();
//        for (int i = 0; i < userInputArr.length; i++) {
//            System.out.print(userInputArr[i]+" ");
//        }
        //3.ϵͳ�ж��Ƿ��н�
        conpareArray(arr, userInputArr);
    }

    //�����н�����
    public static int[] createNumbers(){
        //1.���������û�����н�����
        //6������ 1������ ���鳤��:7
        int[] arr=new int[7];

        //2.������ɺ��벢����ӵ�������
//        ���ɺ�����벢��ӵ�������
        Random r = new Random();
        for (int i = 0; i < 6;) {
            //��ȡ�������
            int readNumber=r.nextInt(33)+1;
            boolean flag = contains(arr,readNumber);
            if (!flag){
                //�Ѻ��������ӵ����鵱��
                arr[i] = readNumber;
                i++;
            }
        }
        int buleNumber =  r.nextInt(16)+1;
        arr[arr.length-1] = buleNumber;
        return arr;
    }

    //�ж��������������Ƿ����
    public static boolean contains(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                return true;
            }
        }
        return false;
    }

    //�û��������
    public static int[] userInputNumber() {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("�������" + (i+1) + "���������:");
            int redNumber = sc.nextInt();
            if (redNumber >= 1 && redNumber <= 33) {
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    //������
                    arr[i] = redNumber;
                    i++;
                } else {
                    //����
                    System.out.println("��ǰ��������Ѿ�����,����������");
                }

            } else {
                System.out.println("��ǰ������볬����Χ");
            }
        }
        System.out.println("�����빺��ĵ��߸��������:");
        //�ж�����Χ��1~16
        while (true) {
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("�����������볬����Χ");
            }
        }
        return arr;
    }

    //�ж��Ƿ��н�
    public static void conpareArray(int[] arr, int[] userInputArr){
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < userInputArr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (userInputArr[i] ==arr[j]){
                    redCount++;
                    break;
                }
            }
        }
        if (arr[arr.length-1] == userInputArr[userInputArr.length-1]){
            blueCount++;
        }
        System.out.println("������н���:"+redCount);
        System.out.println("������н���:"+blueCount);
        scorecompare(redCount,blueCount);
    }

    //�н����
    private static void scorecompare(int redCount,int blueNumber){
        if (redCount ==6&&blueNumber==1){
            System.out.println("��ϲ��,�н�1000��");
        } else if (redCount ==6&&blueNumber==0) {
            System.out.println("��ϲ��,�н�500��");
        } else if (redCount ==5&&blueNumber==1) {
            System.out.println("��ϲ��,�н�3000");
        }else if (redCount ==5&&blueNumber==0||redCount ==4&&blueNumber==1) {
            System.out.println("��ϲ��,�н�200");
        }else if (redCount ==4&&blueNumber==0||redCount ==3&&blueNumber==1) {
            System.out.println("��ϲ��,�н�10");
        }else if (redCount ==2&&blueNumber==1||redCount ==1&&blueNumber==1||redCount ==0&&blueNumber==1) {
            System.out.println("��ϲ��,�н�5");
        }else {
            System.out.println("δ�н�");
        }
    }
}
