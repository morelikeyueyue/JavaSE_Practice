package test;

public class Test5 {
    public static void main(String[] args) {
        //1.��������������¼�������е����
        int height1 = 150;
        int height2 = 165;
        int height3 = 210;

        //2.���ŵ�һ�����к͵ڶ������н��бȽ�
        //�����űȽϽ���͵��������н��бȽ�
        int temp = height1 > height2 ? height1 : height2;
        int max = temp > height3 ? temp : height3;
        //ctrl+alt+L �Զ��ĸ�ʽ����
        System.out.println(max);
    }
}
