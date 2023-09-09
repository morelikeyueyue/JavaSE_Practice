package com.itheima.test.student;

public class StudentInfoTest2 {
    public static void main(String[] args) {
        //1.创建一个数组用来存储学生对象
        StudentInfo[] arr = new StudentInfo[3];

        //2.创建学生对象添加到数组中
        StudentInfo stu1 = new StudentInfo("heima001","小李",18);
        StudentInfo stu2 = new StudentInfo("heima002","小华",19);
        StudentInfo stu3 = new StudentInfo("heima003","小悦",20);

        arr[0]= stu1;
        arr[1]= stu2;
        arr[2]= stu3;

        StudentInfo stu4 = new StudentInfo("heima002","小黄",21);

        //要求3:通过id删除学生信息
        //存在则删除,不存在则提示删除失败
        //要找到id在数组中的对应索引
        int index = judgeId("heima004",arr);
//        System.out.println(index);
        if (index>=0&&index<arr.length){
            //存在
            arr[index] =null;
//            arr = fillArr(arr,index);
            printArr(arr);
        }else {
            //不存在
            System.out.println("当前id不存在,删除失败");
        }

        //要求4:查询数组id为2的学生,如果存在,则他的年龄+1
        //1.先要找到id为2的学生的索引
        int selectIndex = judgeId("heima002",arr);

        //判断索引
        if (selectIndex>=0&&selectIndex<=arr.length){
            //存在
            StudentInfo stu = arr[selectIndex];
            int newAge = stu.getAge()+1;
            stu.setAge(newAge);
            printArr(arr);

        }else {
            //不存在
            System.out.println("当前id不存在,修改失败");
        }

    }
    //查找id对应的索引
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

    //遍历数组,输出信息
    public static void printArr(StudentInfo[] arr){
        for (int i = 0; i < arr.length; i++) {
            StudentInfo stu = arr[i];
            if(arr[i]!=null){
                System.out.printf("%s,%s,%d%n",stu.getId(),stu.getName(),stu.getAge());
            }
        }
    }
    //将数组补满
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
