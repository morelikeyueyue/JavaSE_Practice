package com.itheima.test.student;


public class StudentInfoTest1 {
    public static void main(String[] args) {
        //1.����һ�����������洢ѧ������
        StudentInfo[] arr = new StudentInfo[3];

        //2.����ѧ��������ӵ�������
        StudentInfo stu1 = new StudentInfo("heima001","С��",18);
        StudentInfo stu2 = new StudentInfo("heima002","С��",19);
//        StudentInfo stu3 = new StudentInfo("heima003","С��",20);

        arr[0]= stu1;
        arr[1]= stu2;
//        arr[2]= stu3;

        //Ҫ��1:�ٴ����һ��ѧ������,������ӵ�ʱ�����ѧ��Ψһ���ж�
        StudentInfo stu4 = new StudentInfo("heima002","С��",21);
//        System.out.println(contains(stu4.getId(),arr));
        //ѧ���ж� ����--���\������--�����
//        int count = getCount(arr);
//        System.out.println(count);
        boolean flag = contains(stu4.getId(),arr);
        if (flag){
            //����--�����
            System.out.println("��ǰid�ظ�,���޸�id���ٽ������");
        }else {
            //������---���
            //�������--����һ���µ�����,���鳤��+1\û�д���----ֱ�����
            int count = getCount(arr);
            if (count == arr.length){
                //����
                StudentInfo[] newArr = creatNewArr(arr);
                newArr[count] = stu4;
                //Ҫ��2:�������е�ѧ����Ϣ
                printArr(newArr);

            }else {
                //û�д���
                arr[count] = stu4;
                //Ҫ��2:�������е�ѧ����Ϣ
                printArr(arr);

            }

        }

    }


    //����һ���������ж�ѧ��id�Ƿ��������д���
    public static boolean contains(String id,StudentInfo[] arr){

        for (int i = 0; i < arr.length; i++) {
            StudentInfo stu = arr[i];
            if(stu!=null){
                String arrId = arr[i].getId();
                //�Ƚ��Ƿ����
                if (id.equals(arrId)){
                    return true;
                }
            }
        }
        return false;
    }

    //�ж��������Ѿ����˼���Ԫ��
    public static int getCount(StudentInfo[] arr) {
        //����һ������������ͳ��
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null){
                count++;
            }
        }
        return count;
    }
    //����һ��������,����Ϊ�����鳤��+1,�������������copy��������
    public static StudentInfo[] creatNewArr(StudentInfo[] arr){
        StudentInfo[] newArr = new StudentInfo[arr.length+1];

        //�����õ��������е�ÿһ��Ԫ��
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static void printArr(StudentInfo[] arr){
        for (int i = 0; i < arr.length; i++) {
            StudentInfo stu = arr[i];
            if(arr[i]!=null){
                System.out.printf("%s,%s,%d%n",stu.getId(),stu.getName(),stu.getAge());
            }
        }
    }
}
