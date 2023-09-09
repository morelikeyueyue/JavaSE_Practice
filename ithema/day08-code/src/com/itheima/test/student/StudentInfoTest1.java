package com.itheima.test.student;


public class StudentInfoTest1 {
    public static void main(String[] args) {
        //1.创建一个数组用来存储学生对象
        StudentInfo[] arr = new StudentInfo[3];

        //2.创建学生对象添加到数组中
        StudentInfo stu1 = new StudentInfo("heima001","小李",18);
        StudentInfo stu2 = new StudentInfo("heima002","小华",19);
//        StudentInfo stu3 = new StudentInfo("heima003","小悦",20);

        arr[0]= stu1;
        arr[1]= stu2;
//        arr[2]= stu3;

        //要求1:再次添加一个学生对象,并在添加的时候进行学号唯一性判断
        StudentInfo stu4 = new StudentInfo("heima002","小黄",21);
//        System.out.println(contains(stu4.getId(),arr));
        //学号判断 可用--添加\不可用--不添加
//        int count = getCount(arr);
//        System.out.println(count);
        boolean flag = contains(stu4.getId(),arr);
        if (flag){
            //存在--不添加
            System.out.println("当前id重复,请修改id后再进行添加");
        }else {
            //不存在---添加
            //数组存满--创建一个新的数组,数组长度+1\没有存满----直接添加
            int count = getCount(arr);
            if (count == arr.length){
                //存满
                StudentInfo[] newArr = creatNewArr(arr);
                newArr[count] = stu4;
                //要求2:遍历所有的学生信息
                printArr(newArr);

            }else {
                //没有存满
                arr[count] = stu4;
                //要求2:遍历所有的学生信息
                printArr(arr);

            }

        }

    }


    //定义一个方法来判断学生id是否在数组中存在
    public static boolean contains(String id,StudentInfo[] arr){

        for (int i = 0; i < arr.length; i++) {
            StudentInfo stu = arr[i];
            if(stu!=null){
                String arrId = arr[i].getId();
                //比较是否存在
                if (id.equals(arrId)){
                    return true;
                }
            }
        }
        return false;
    }

    //判断数组中已经存了几个元素
    public static int getCount(StudentInfo[] arr) {
        //定义一个计数器用于统计
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null){
                count++;
            }
        }
        return count;
    }
    //创建一个新数组,长度为老数组长度+1,将老数组的数据copy到新数组
    public static StudentInfo[] creatNewArr(StudentInfo[] arr){
        StudentInfo[] newArr = new StudentInfo[arr.length+1];

        //遍历得到老数组中的每一个元素
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
