package com.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class StudentOperation {

    private Scanner sc = new Scanner(System.in);

    //1.���ѧ��
    public void addStudent(ArrayList<Student> list) {
        System.out.println("���ѧ��");
        Student newstu = new Student();
        System.out.println("������ѧ��:");
        while (true) {
            newstu.setId(sc.next());
            int index = idContains(list, newstu.getId());
            if (index > -1) {
                //���ڸ�ѧ��,���ʧ��
                System.out.println("���ڸ�id��ѧ��,���ʧ��");
                System.out.println("���ٴ��������ѧ����ѧ��");
            } else {
                //������,����
                break;
            }
        }
        System.out.println("����������:");
        newstu.setName(sc.next());
        System.out.println("����������:");
        newstu.setAge(sc.nextInt());
        System.out.println("�������ַ:");
        newstu.setAddress(sc.next());
        list.add(newstu);
        System.out.println("��ӳɹ�");

    }

    //ɾ��ѧ��
    public void deleteStudent(ArrayList<Student> list) {
        System.out.println("ɾ��ѧ��");
        System.out.println("������Ҫɾ��ѧ����ѧ��:");
        while (true) {
            String id = sc.next();
            int index = idContains(list, id);
            if (index > -1) {
                //���ڸ�ѧ��,ɾ��
                list.remove(index);
                System.out.println("�Ѿ�ɾ����ѧ�ŵ�ѧ��");
                return;
            } else {
                //������
                System.out.println("�����ڸ�ѧ�ŵ�ѧ��,ɾ��ʧ��");
                System.out.println("���ٴ�����ɾ��ѧ����ѧ��:");
            }
        }

    }

    //�޸�ѧ��
    public void updataStudent(ArrayList<Student> list) {
        System.out.println("�޸�ѧ��");
        System.out.println("������Ҫ�޸�ѧ����ѧ��:");
        while (true) {
            String id = sc.next();
            int index = idContains(list, id);
            if (index > -1) {
                //����,�޸�ѧ��
                System.out.println("������Ҫ�޸ĵ�ѧ����Ϣ");
                //            addStudent(list);
                System.out.println("���ѧ��");
                System.out.println("�������޸ĺ�ѧ��:");
                String newid;
                while (true) {
                    newid = sc.next();
                    int newIndex = idContains(list, newid);
                    if (newIndex > -1) {
                        //���ڸ�ѧ��
                        System.out.println("���ڸ�ѧ�ŵ�ѧ��,�޸�ʧ��");
                        System.out.println("�����������޸ĺ�ѧ��:");
                    } else {
                        //������
                        break;
                    }
                }
                Student stu = list.get(index);
                stu.setId(newid);
                System.out.println("�������޸ĺ�����:");
                stu.setName(sc.next());
                System.out.println("�������޸ĺ�����:");
                stu.setAge(sc.nextInt());
                System.out.println("�������޸ĺ��ַ:");
                stu.setAddress(sc.next());
                System.out.println("�޸ĳɹ�");
                return;
            } else {
                //������
                System.out.println("�����ڸ�ѧ�ŵ�ѧ��,�޸�ʧ��");
                System.out.println("���ٴ�����Ҫ�޸ĵ�ѧ��ѧ��");
            }
        }
    }

    //��ѯѧ��
    public void selectStudent(ArrayList<Student> list) {
        System.out.println("��ѯѧ��");
        if (list.size() == 0) {
            //������
            System.out.println("��ǰ��ѧ����Ϣ");
            return;
        } else {
            //������
            System.out.printf("id--------����--------����------��ͥסַ\n");
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);

                System.out.printf("%s       %s         %d       %s\n", stu.getId(), stu.getName(), stu.getAge(), stu.getAddress());
            }
        }
    }

    //�ж�id�Ƿ����
    public int idContains(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student s1 = list.get(i);
            if (s1.getId().equals(id)) {
                //���ڸ�id
                return i;
            }
        }
        //������
        return -1;
    }

    //�û���¼
    public boolean userLogin(ArrayList<User> list) {
        System.out.println("�û���¼");
        System.out.println("�������û���:");
        String username = sc.next();
        int index = usernameContains(list, username);
        //�ж��û��Ƿ����
        if (index < 0) {
            System.out.println("�����ڸ��û�,����ע��");
            return false;
        }
        //�ж���֤��
        while (true) {
            String yanzhengma = codeRandom();
            System.out.println(yanzhengma);
            System.out.println("��������֤��:");
            String str = sc.next();
            if (str.equals(yanzhengma)) {
                System.out.println("��֤��������ȷ");
                break;
            } else {
                System.out.println("��֤���������,���ٴ�����:");
                continue;
            }
        }

        //�ж�����
        for (int i = 0; i < 3; i++) {
            System.out.println("����������:");
            String password = sc.next();
            for (int j = 0; j < list.size(); j++) {
                User u1 = list.get(j);
                if (password.equals(u1.getPassword())) {
                    System.out.println("����������ȷ");
                    return true;
                }
            }
            System.out.println("�����������,����" + (2 - i) + "�λ���");
        }
        return false;
    }

/*        if (index > -1) {
            //����
            User u1 = list.get(index);
            while (true) {
                String yanzhengma = codeRandom();
                System.out.println(yanzhengma);
                System.out.println("��������֤��:");
                String userYanzhengma = sc.next();
                if (userYanzhengma.equals(yanzhengma)) {
                    //��֤����ȷ
                    //��������
                    for (int i = 0; i < 3; i++) {
                        System.out.println("����������:");
                        String password = sc.next();
                        //�ж�����
                        if (password.equals(u1.getPassword())) {
                            //������ȷ
                            System.out.println("��¼�ɹ�");
                            return;
                        } else {
                            //���벻��ȷ
                            System.out.println("�������,������" + (2 - i) + "�λ���");
                        }
                    }
                } else {
                    //��֤�����
                    System.out.println("��֤�����,������������֤��:");
                }
            }

        } else {
            //������
            System.out.println("�û���δע��,����ע��:");
            return;
        }*/


    //�û�ע��
    public void register(ArrayList<User> list) {
        //���������û���
        System.out.println("�û�ע��");
        String username;
        while (true) {
            System.out.println("������Ҫע���û���:");
            username = sc.next();
            boolean flag1;
            flag1 = checkUsername(username);
            if (!flag1) {
                System.out.println("�û�������������,����������:");
                continue;
            }
            //�ж��û����Ƿ�Ψһ
            int index = usernameContains(list, username);
            if (index > -1) {
                System.out.println(index);
                System.out.println("�û����Ѿ�����,����������:");
                continue;
            } else {
                System.out.println("�û���" + username + "����");
                break;
            }
        }
        //����¼������
        String password;
        while (true) {
            System.out.println("������Ҫע�������:");
            password = sc.next();
            System.out.println("���ٴ�����Ҫע�������:");
            String aginPassword = sc.next();
            if (!aginPassword.equals(password)) {
                //��һ��
                System.out.println("������������벻һ��,����������:");
                continue;
            } else {
                System.out.println("��������һ��,����¼����������");
                break;
            }
        }

        //����¼�����֤����
        String userId;
        while (true) {
            System.out.println("������Ҫע������֤����:");
            userId = sc.next();
            boolean flag2 = CheckUserId(userId);
            if (flag2) {
                System.out.println("���֤��������Ҫ��");
                break;
            } else {
                System.out.println("���֤��������,����������:");
                continue;
            }
        }

        //����¼���ֻ���
        String phone;
        while (true) {
            System.out.println("������Ҫע����ֻ�����:");
            phone = sc.next();
            boolean flag3 = checkPhone(phone);
            if (flag3) {
                System.out.println("�ֻ������ʽ��ȷ");
                break;
            } else {
                System.out.println("�ֻ������ʽ����,����������:");
                continue;
            }
        }

        User u1 = new User(username, password, userId, phone);
        list.add(u1);
        System.out.println("ע��ɹ�");
        printList(list);
    }

    //��ӡlist����
    private void printList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User u1 = list.get(i);
            System.out.printf("�û���Ϊ:%s\n����Ϊ:%s\n���֤Ϊ:%s\n�ֻ���Ϊ:%s", u1.getUsername(), u1.getUserId(), u1.getPassword(), u1.getPhone());
        }
    }

    //�ж��ֻ�����
    private boolean checkPhone(String phone) {
        int len = phone.length();
        //11λ�ֻ���
        if (len != 11) {
            return false;
        }
        //������0��ͷ
        if (phone.startsWith("0")) {
            return false;
        }
        //������
        for (int i = 0; i < len; i++) {
            char c = phone.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    //������֤
    private boolean CheckUserId(String userId) {
        int len = userId.length();
        //�ܳ���Ϊ18
        if (len != 18) {
            return false;
        }
        //��ͷ������0
        boolean flag = userId.startsWith("0");
        if (flag) {
            return false;
        }
        for (int i = 0; i < len - 1; i++) {
            char c = userId.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        char endChar = userId.charAt(userId.length() - 1);
        if ((endChar >= '0' && endChar <= '9') || (endChar == 'X') || (endChar == 'x')) {
            return true;
        } else {
            return false;
        }
    }

   /* public void userRegister(ArrayList<User> list) {
        System.out.println("�û�ע��");
        User u1 = new User();
        while (true) {
            System.out.println("������ע���û���:");
            String username = sc.next();
            if (usernameContains(list, username) > -1) {
                //�û�������
                System.out.println("���û����Ѿ�����,����������:");
            } else {
                //�û���������
                //����ַ�����,���ж��Ƿ������ּ���ĸ���
                char[] arr = stringToChar(username);
                format:
                if (arr.length >= 3 && arr.length <= 15) {
                    //�û�����3��15֮��
                    int intNum = 0;
                    for (int i = 0; i < arr.length; i++) {
                        //�жϸ�ʽ
                        if ((arr[i] >= '0' && arr[i] <= '9') || (arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z')) {
                            if (arr[i] >= '0' && arr[i] <= '9') {
                                intNum++;
                            }
                        } else {
                            //�û�����ʽ����
                            System.out.println("�û�����������ĸ��������,���ǲ����Ǵ�����,����������:");
                            break format;
                        }
                    }
                    //�ж��Ƿ��Ǵ�����
//                    System.out.println(intNum);
                    if (intNum == arr.length) {
                        //������
                        System.out.println("����Ϊ������,�����������û���:");
                    } else {
                        //��֤��������
                        while (true) {
                            System.out.println("������ע������:");
                            String password = sc.next();
                            System.out.println("���ٴ���������:");
                            String againPassword = sc.next();
                            if (password.equals(againPassword)) {
                                //��ͬ
                                //�������֤
                                System.out.println("���������֤:");
                                while (true) {
                                    String userId = sc.next();
                                    char[] arrId = stringToChar(userId);
                                    //��֤���֤
                                    if (arrId.length != 18) {
                                        System.out.println("���֤Ӧ��Ϊ18λ,�������������֤:");
                                    } else {
                                        //��֤ǰʮ��λ
                                        boolean idFlag = true;
                                        for (int i = 0; i < arrId.length - 1; i++) {
                                            if (i == 0 && arrId[i] == '0' || arrId[i] < '0' || arrId[i] > '9') {
                                                //���Ϸ�
                                                System.out.println("�������֤���Ϸ�,����������:");
                                                idFlag = false;
                                                break;
                                            }
                                        }
                                        if (arrId[arrId.length - 1] >= '0' && arrId[arrId.length - 1] <= '9' || arrId[arrId.length - 1] == 'x' || arrId[arrId.length - 1] == 'X') {
                                        } else {
                                            System.out.println(arrId[arrId.length - 1]);
                                            idFlag = false;
                                        }
//                                        System.out.println(idFlag);
                                        if (idFlag) {
                                            //���֤�Ϸ�
                                            //�����ֻ���
                                            System.out.println("�������ֻ���");
                                            while (true) {
                                                String phone = sc.next();
                                                char[] arrPhone = stringToChar(phone);
                                                //��֤�ֻ���
                                                if (arrPhone.length != 11) {
                                                    //��Ϊ11λ
                                                    System.out.println("������ֻ���Ӧ��Ϊ11λ,���ٴ�����:");
                                                } else {
                                                    //Ϊ11λ
                                                    boolean phFlag = true;
                                                    for (int i = 0; i < arrPhone.length; i++) {
                                                        if (i == 0 && arrPhone[i] == '0' || arrPhone[i] < '0' || arrPhone[i] > '9') {
                                                            phFlag = false;
                                                            break;
                                                        }
                                                    }
                                                    if (phFlag) {
                                                        //�Ϸ��ֻ���
                                                        u1.setUsername(username);
                                                        u1.setPassword(password);
                                                        u1.setUserId(userId);
                                                        u1.setPhone(phone);
                                                        list.add(u1);
                                                        System.out.println("��ӳɹ�");
                                                        break;
                                                    } else {
                                                        //���Ϸ��ֻ���
                                                        System.out.println("�����ֻ��ŵ�һλ������0,����ȫ��������,���ٴ�����:");
                                                    }
                                                }
                                            }
                                            break;
                                        } else {
                                            System.out.println("�������֤���һλӦ��Ϊ����,���ߴ�Сдx:");
                                        }
                                    }
                                }
                                break;
                            } else {
                                //����ͬ
                                System.out.println("������������벻��ͬ,���ٴ�����ע������");
                            }
                        }
                        break;
                    }
                    //�жϸ�ʽ���,û�д���
                } else {
                    //����3~15
                    System.out.println("�û������ȱ�����3~15֮��,����������:");
                }
            }
        }
    }*/

    //�û���������
    public void userForgetPwd(ArrayList<User> list) {
        System.out.println("��������");
        System.out.println("�����������û���:");
        String username = sc.next();
        int index = usernameContains(list, username);
        if (index > -1) {
            //����
            //�����ֻ���
            User u1 = list.get(index);
            System.out.println("�������û����ֻ���:");
            while (true) {
                String phone = sc.next();
                //�ж��ֻ���
                if (phone.equals(u1.getPhone())) {
                    //��ȷ
                    //�������֤
                    System.out.println("���������֤��:");
                    while (true) {
                        String userId = sc.next();
                        if (userId.equals(u1.getUserId())) {
                            //��ȷ,����������
                            System.out.println("��֤��ȷ,������������:");
                            String newPassword = sc.next();
                            //�޸�������
                            list.get(index).setPassword(newPassword);
                            System.out.println(list.get(index).getPassword());
                            System.out.println("�޸�����ɹ�");
                            return;
                        } else {
                            //����ȷ
                            System.out.println("���֤����ȷ,����������:");
                        }
                    }
                } else {
                    //����ȷ
                    System.out.println("�ֻ��Ŵ���,���������:");
                }
            }

        } else {
            //������
            return;
        }

    }

    //�ж��û����Ƿ����
    public int usernameContains(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User u1 = list.get(i);
            if (u1.getUsername().equals(username)) {
                //���ڸ�id
                return i;
            }
        }
        //������
        return -1;
    }


    //��һ���ַ���ת��Ϊһ���ַ�����
    public char[] stringToChar(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            arr[i] = c;
        }
        return arr;
    }

    //������֤��
    public String codeRandom() {
        /*������֤��  ����Ϊ5
        ����Ϊ5 �����Ǵ�Сд������ ��������ֻ����һλ
         */
        //1.����һ���ַ��������洢����õ����ַ�
        char[] arr = new char[5];
        //2.�õ��������ĸ
        char charLetter;
        for (int i = 0; i < 4; i++) {
            charLetter = getChar();
            arr[i] = charLetter;
        }
        //3.�õ����������
        char charNumber = getInt();
        arr[4] = charNumber;
        //4.�����ַ�����
        char[] result = changechaos(arr);
        //5.��ӡ�ַ���
        String str = new String(result);
//        System.out.println(str);
        return str;
    }

    //���������ĸ
    public char getChar() {
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i < 26) {
                arr[i] = (char) ('a' + i);
            } else if (i >= 26) {
                arr[i] = (char) (i - 26 + 'A');
            }
        }
        Random r = new Random();
        int index = r.nextInt(arr.length);
        return arr[index];
    }

    //�����������
    public char getInt() {
//        char[] arr ={'0','1','2','3','4','5','6','7','8','9'};
        char[] arr = new char[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) ('0' + i);
//            System.out.print(arr[i]);
        }
        Random r = new Random();
        int index = r.nextInt(arr.length);
        return arr[index];
    }

    //������֤��
    public static char[] changechaos(char[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            char temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    //��֤�û����Ƿ���ȷ
    public boolean checkUsername(String username) {
        int len = username.length();
        //�ж��û��������Ƿ���3~15
        if (len < 3 || len > 15) {
            //����
            return false;
        } else {
            //��ȷ
            //�ж��ǲ��Ǵ�����
            for (int i = 0; i < len; i++) {
                char c = username.charAt(i);
                if (!((c <= '9' && c >= '0') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                    return false;
                }
            }
            int count = 0;
            for (int i = 0; i < len; i++) {
                char c = username.charAt(i);
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                return false;
            } else {
                return true;
            }
            //���㳤�Ⱥ�����;

        }
    }

    //��֤���֤�Ƿ���ȷ


}
