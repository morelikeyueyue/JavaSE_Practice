package com.itheima.test;

import java.util.Random;

/**
 * @author 25718
 */
public class Test4 {
    /*����:
    ���巽��ʵ���������һ��5λ����֤��
    ��֤���ʽ:����Ϊ5,ǰ��λΪ��д��ĸ��Сд��ĸ
    ���һλ������;
     */

    //����:
    //A~Z a~z 0~9
    //�����Ȱ���Щ���ݷŵ�������
    //�������ȡһ������
    public static void main(String[] args) {
        String yanzhengma = generate();
        System.out.println(yanzhengma);
    }

    //    ��֤�뷽��
    //����һ���ַ���
    public static String generate() {
        //����
        //��д��ĸ��Сд��ĸ���ŵ�������ȥ
        char[] chars = new char[52];
        for (int i = 0; i < chars.length; i++) {
            if (i <= 25) {
                //���Сд��ĸ
                //a ------97
                chars[i] = (char) (97 + i);
            } else {
                //��Ӵ�д��ĸ
                //  A---65
                chars[i] = (char) (65 + i - 26);
            }
        }
        //����һ���ַ������͵ı���,������¼���յĽ��
        String result = "";
        //�����ȡ4��
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chars.length);
            result = result + chars[randomIndex];
        }
        //int randomIndex = r.nextInt(chars.length);
        //�������ȡһ������0~9
        int number = r.nextInt(10);
        result = result + number;
        return result;
    }
}
