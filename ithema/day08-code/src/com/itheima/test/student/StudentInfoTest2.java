package com.itheima.test.student;

public class StudentInfoTest2 {
    public static void main(String[] args) {
        //1.����һ�����������洢ѧ������
        StudentInfo[] arr = new StudentInfo[3];

        //2.����ѧ��������ӵ�������
        StudentInfo stu1 = new StudentInfo("heima001","С��",18);
        StudentInfo stu2 = new StudentInfo("heima002","С��",19);
        StudentInfo stu3 = new StudentInfo("heima003","С��",20);

        arr[0]= stu1;
        arr[1]= stu2;
        arr[2]= stu3;

        StudentInfo stu4 = new StudentInfo("heima002","С��",21);

        //Ҫ��3:ͨ��idɾ��ѧ����Ϣ
        //������ɾ��,����������ʾɾ��ʧ��
        //Ҫ�ҵ�id�������еĶ�Ӧ����
        int index = judgeId("heima004",arr);
//        System.out.println(index);
        if (index>=0&&index<arr.length){
            //����
            arr[index] =null;
//            arr = fillArr(arr,index);
            printArr(arr);
        }else {
            //������
            System.out.println("��ǰid������,ɾ��ʧ��");
        }

        //Ҫ��4:��ѯ����idΪ2��ѧ��,�������,����������+1
        //1.��Ҫ�ҵ�idΪ2��ѧ��������
        int selectIndex = judgeId("heima002",arr);

        //�ж�����
        if (selectIndex>=0&&selectIndex<=arr.length){
            //����
            StudentInfo stu = arr[selectIndex];
            int newAge = stu.getAge()+1;
            stu.setAge(newAge);
            printArr(arr);

        }else {
            //������
            System.out.println("��ǰid������,�޸�ʧ��");
        }

    }
    //����id��Ӧ������
    public static int judgeId(String id,StudentInfo[] arr){
        for (int i = 0; i < arr.length; i++) {
            StudentInfo stu = arr[i];
            if (stu!=null){
                String sid = stu.getId();
                if(id.equals(sid)){
                    return i;
                }
            }
        }
        return -1;
    }

    //��������,�����Ϣ
    public static void printArr(StudentInfo[] arr){
        for (int i = 0; i < arr.length; i++) {
            StudentInfo stu = arr[i];
            if(arr[i]!=null){
                System.out.printf("%s,%s,%d%n",stu.getId(),stu.getName(),stu.getAge());
            }
        }
    }
    //�����鲹��
    public static StudentInfo[] fillArr(StudentInfo[] arr, int index){
        StudentInfo temp = new StudentInfo();
//        System.out.printf("%s,%s,%d%n",temp.getId(),temp.getName(),temp.getAge());
        for (int i = index; i < arr.length-1; i++) {
            StudentInfo stu = arr[i];
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }
}
