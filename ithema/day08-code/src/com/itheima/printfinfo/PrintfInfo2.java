package com.itheima.printfinfo;
import java.util.Date;

// "%" ��ʾ���и�ʽ������� "%" ֮�������Ϊ��ʽ�Ķ���
public class PrintfInfo2 {
    public static void main(String[] args) {
        int i = 111;
        double d = Math.PI;
        String s = "Regino";
        Date dt = new Date();

        //���͵����
        System.out.printf("%d", i);//"d"��ʾ���ʮ��������
        System.out.println();
        System.out.printf("%04d", i);//�涨Ϊ4λ������������0
        System.out.println();
        System.out.printf("%d%%", i);//���������ٷ����������������� %%
        System.out.println();
        System.out.printf("%o", i);//"o"��ʾ���8��������
        System.out.println();
        System.out.printf("%x", i);//"x"��ʾ���16��������
        System.out.println();
        System.out.printf("%X", i);//"X"��ʾ���16��������,������ĸ��ɴ�д��ʽ
        System.out.println("\n---------");

        //�����͵����
        System.out.printf("%e", d);// %e ��ʾ�Կ�ѧ���������������
        System.out.println();
        System.out.printf("%E", d);// %E ��ʾ�Կ�ѧ���������������������Ϊ��д��ʽ
        System.out.println();
        System.out.printf("%f", d);// %f ��ʾ��ʮ���Ƹ�ʽ�����������
        System.out.println();
        System.out.printf("%.2f", d);// %f ��С��������������С������λ��
        System.out.println("\n---------");

        //�ַ��������
        System.out.printf("%s", 1212);// %s ��ʾ����ַ�����Ҳ���ǽ�������ַ����滻ģʽ�е� %s
        System.out.println();
        System.out.printf("%s%n", "next line");// %n ��ʾ����
        System.out.printf("%s = %s%n", "Name", "Regino");// %n ������֧�ֶ������
        System.out.printf("%S = %s%n", "Name", "Regino");// %S ���ַ����Դ�д��ʽ���
        System.out.printf("%1$s = %3$s %2$s%n", "Name", "ino", "Reg");// ֧�ֶ������ʱ��������%s֮����������ţ�1$��ʾ��һ���ַ�����3$��ʾ��3���ַ���
        System.out.println("---------");

        //�������͵����
        System.out.printf("%1$tc%n", dt);//���ʱ�����ڵ�������Ϣ
        //�������������
        System.out.printf("%1$tD%n", dt);// %t ֮����D��ʾ�� "%tm/%td/%ty" ��ʽ������
        System.out.printf("%1$tF%n", dt);// %t ֮����F��ʾ�� "%tY-%tm-%td" ��ʽ������
        System.out.printf("%1$tF %1$ta%n", dt);// %t ֮����a��ʾ�õ����ڼ��ļ��
        System.out.printf("%1$tF %1$tA%n", dt);// %t ֮����A��ʾ�õ����ڼ���ȫ��
        //������ʱ�����
        System.out.printf("%1$tR%n", dt);// %t ֮����R��ʾ�� "%tH:%tM" ��ʽ��ʱ��
        System.out.printf("%1$tT%n", dt);// %t ֮����T��ʾ�� "%tH:%tM:%tS" ��ʽ��ʱ��
        System.out.printf("%1$tr%n", dt);// %t ֮����r��ʾ�� "%tI:%tM:%tS %Tp" ��ʽ��ʱ��
    }
}

