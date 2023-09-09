package com.itheima.studentsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    static ArrayList<User> usersList = new ArrayList<>();
    static ArrayList<Student> stuList = new ArrayList<>();
    static{
        //���һЩ�û���Ϣ
        usersList.add(new User("a01","123","430524200205237154","17136375479"));
        stuList.add(new Student("001","001",18,"001"));
        stuList.add(new Student("002","002",19,"002"));
    }


    private static final String ADD_STUDENT="1";
    private static final String DELETE_STUDENT="2";
    private static final String UPADATA_STUDENT="3";
    private static final String SELECT_STUDENT="4";
    private static final String EXIT="5";



    public static void main(String[] args) {




        //�û���¼
        StudentOperation so = new StudentOperation();


/*        User u1 = new User("12a","123","430524200205237154","17136375479");
        usersList.add(u1);*/

        Scanner sc = new Scanner(System.in);
        login:
        while (true) {
            System.out.println("-----------��ӭ����ѧ������ϵͳ----------------");
            System.out.println("��ѡ�����1��¼ 2ע�� 3��������");
            System.out.println("����������ѡ��:");
            String userLogin = sc.next();
            switch (userLogin) {
                case "1" -> {
                    boolean flag = so.userLogin(usersList);
                    if (flag) {
                        //��¼�ɹ�
                        break login;
                    }
                }
                case "2" -> {
                    so.register(usersList);
//                    for (int i = 0; i < usersList.size(); i++) {
//                        User u1 = usersList.get(i);
//                        System.out.printf("%s %s %s %s",u1.getUsername(),u1.getPassword(),u1.getUserId(),u1.getPhone());
//                    }
                }
                case "3" -> {
                    so.userForgetPwd(usersList);
                }
                default -> {
                    System.out.println("����ѡ�����");
                }
            }
        }


        loop:
        while (true) {
            System.out.println("---------------------------��ӭ��������ѧ������ϵͳ--------------------------");
            System.out.println("1.���ѧ��");
            System.out.println("2.ɾ��ѧ��");
            System.out.println("3.�޸�ѧ��");
            System.out.println("4.��ѯѧ��");
            System.out.println("5.�˳�");

            //����ѡ��
            System.out.println("����������ѡ��:");
            String choose = sc.next();
            switch (choose) {
                case ADD_STUDENT -> {
                    so.addStudent(stuList);

//                    System.out.println(flag);
//                    for (int i = 0; i < list.size(); i++) {
//                        Student s1 = list.get(i);
//                        System.out.printf("id:%s\n����:%s\n����%d\n��ַ%s\n",s1.getId(),s1.getName(),s1.getAge(),s1.getAddress());
//                    }

                }
                case DELETE_STUDENT -> {
                    so.deleteStudent(stuList);

                }
                case UPADATA_STUDENT -> {
                    so.updataStudent(stuList);
                }
                case SELECT_STUDENT
                        -> {
                    so.selectStudent(stuList);
                }
                case EXIT -> {
                    System.out.println("�˳�ϵͳ");
//                    break loop;
                    System.exit(0);
                }
                default -> {
                    System.out.println("û�����ѡ��");
                }
            }
        }
    }
}
