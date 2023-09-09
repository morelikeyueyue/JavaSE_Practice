package com.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class StudentOperation {

    private Scanner sc = new Scanner(System.in);

    //1.添加学生
    public void addStudent(ArrayList<Student> list) {
        System.out.println("添加学生");
        Student newstu = new Student();
        System.out.println("请输入学号:");
        while (true) {
            newstu.setId(sc.next());
            int index = idContains(list, newstu.getId());
            if (index > -1) {
                //存在该学生,添加失败
                System.out.println("存在该id的学生,添加失败");
                System.out.println("请再次输入添加学生的学号");
            } else {
                //不存在,继续
                break;
            }
        }
        System.out.println("请输入名字:");
        newstu.setName(sc.next());
        System.out.println("请输入年龄:");
        newstu.setAge(sc.nextInt());
        System.out.println("请输入地址:");
        newstu.setAddress(sc.next());
        list.add(newstu);
        System.out.println("添加成功");

    }

    //删除学生
    public void deleteStudent(ArrayList<Student> list) {
        System.out.println("删除学生");
        System.out.println("请输入要删除学生的学号:");
        while (true) {
            String id = sc.next();
            int index = idContains(list, id);
            if (index > -1) {
                //存在该学生,删除
                list.remove(index);
                System.out.println("已经删除该学号的学生");
                return;
            } else {
                //不存在
                System.out.println("不存在该学号的学生,删除失败");
                System.out.println("请再次输入删除学生的学号:");
            }
        }

    }

    //修改学生
    public void updataStudent(ArrayList<Student> list) {
        System.out.println("修改学生");
        System.out.println("请输入要修改学生的学号:");
        while (true) {
            String id = sc.next();
            int index = idContains(list, id);
            if (index > -1) {
                //存在,修改学生
                System.out.println("请输入要修改的学生信息");
                //            addStudent(list);
                System.out.println("添加学生");
                System.out.println("请输入修改后学号:");
                String newid;
                while (true) {
                    newid = sc.next();
                    int newIndex = idContains(list, newid);
                    if (newIndex > -1) {
                        //存在该学生
                        System.out.println("存在该学号的学生,修改失败");
                        System.out.println("请重新输入修改后学号:");
                    } else {
                        //不存在
                        break;
                    }
                }
                Student stu = list.get(index);
                stu.setId(newid);
                System.out.println("请输入修改后名字:");
                stu.setName(sc.next());
                System.out.println("请输入修改后年龄:");
                stu.setAge(sc.nextInt());
                System.out.println("请输入修改后地址:");
                stu.setAddress(sc.next());
                System.out.println("修改成功");
                return;
            } else {
                //不存在
                System.out.println("不存在该学号的学生,修改失败");
                System.out.println("请再次输入要修改的学生学号");
            }
        }
    }

    //查询学生
    public void selectStudent(ArrayList<Student> list) {
        System.out.println("查询学生");
        if (list.size() == 0) {
            //无数据
            System.out.println("当前无学生信息");
            return;
        } else {
            //有数据
            System.out.printf("id--------姓名--------年龄------家庭住址\n");
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);

                System.out.printf("%s       %s         %d       %s\n", stu.getId(), stu.getName(), stu.getAge(), stu.getAddress());
            }
        }
    }

    //判断id是否存在
    public int idContains(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student s1 = list.get(i);
            if (s1.getId().equals(id)) {
                //存在该id
                return i;
            }
        }
        //不存在
        return -1;
    }

    //用户登录
    public boolean userLogin(ArrayList<User> list) {
        System.out.println("用户登录");
        System.out.println("请输入用户名:");
        String username = sc.next();
        int index = usernameContains(list, username);
        //判断用户是否存在
        if (index < 0) {
            System.out.println("不存在该用户,请先注册");
            return false;
        }
        //判断验证码
        while (true) {
            String yanzhengma = codeRandom();
            System.out.println(yanzhengma);
            System.out.println("请输入验证码:");
            String str = sc.next();
            if (str.equals(yanzhengma)) {
                System.out.println("验证码输入正确");
                break;
            } else {
                System.out.println("验证码输入错误,请再次输入:");
                continue;
            }
        }

        //判断密码
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入密码:");
            String password = sc.next();
            for (int j = 0; j < list.size(); j++) {
                User u1 = list.get(j);
                if (password.equals(u1.getPassword())) {
                    System.out.println("密码输入正确");
                    return true;
                }
            }
            System.out.println("密码输入错误,还有" + (2 - i) + "次机会");
        }
        return false;
    }

/*        if (index > -1) {
            //存在
            User u1 = list.get(index);
            while (true) {
                String yanzhengma = codeRandom();
                System.out.println(yanzhengma);
                System.out.println("请输入验证码:");
                String userYanzhengma = sc.next();
                if (userYanzhengma.equals(yanzhengma)) {
                    //验证码正确
                    //输入密码
                    for (int i = 0; i < 3; i++) {
                        System.out.println("请输入密码:");
                        String password = sc.next();
                        //判断密码
                        if (password.equals(u1.getPassword())) {
                            //密码正确
                            System.out.println("登录成功");
                            return;
                        } else {
                            //密码不正确
                            System.out.println("密码错误,您还有" + (2 - i) + "次机会");
                        }
                    }
                } else {
                    //验证码错误
                    System.out.println("验证码错误,请重新输入验证码:");
                }
            }

        } else {
            //不存在
            System.out.println("用户名未注册,请先注册:");
            return;
        }*/


    //用户注册
    public void register(ArrayList<User> list) {
        //键盘输入用户名
        System.out.println("用户注册");
        String username;
        while (true) {
            System.out.println("请输入要注册用户名:");
            username = sc.next();
            boolean flag1;
            flag1 = checkUsername(username);
            if (!flag1) {
                System.out.println("用户名不满足条件,请重新输入:");
                continue;
            }
            //判断用户名是否唯一
            int index = usernameContains(list, username);
            if (index > -1) {
                System.out.println(index);
                System.out.println("用户名已经存在,请重新输入:");
                continue;
            } else {
                System.out.println("用户名" + username + "可用");
                break;
            }
        }
        //键盘录入密码
        String password;
        while (true) {
            System.out.println("请输入要注册的密码:");
            password = sc.next();
            System.out.println("请再次输入要注册的密码:");
            String aginPassword = sc.next();
            if (!aginPassword.equals(password)) {
                //不一样
                System.out.println("两次输入的密码不一致,请重新输入:");
                continue;
            } else {
                System.out.println("两次密码一致,继续录入其他数据");
                break;
            }
        }

        //键盘录入身份证号码
        String userId;
        while (true) {
            System.out.println("请输入要注册的身份证号码:");
            userId = sc.next();
            boolean flag2 = CheckUserId(userId);
            if (flag2) {
                System.out.println("身份证号码满足要求");
                break;
            } else {
                System.out.println("身份证号码有误,请重新输入:");
                continue;
            }
        }

        //键盘录入手机号
        String phone;
        while (true) {
            System.out.println("请输入要注册的手机号码:");
            phone = sc.next();
            boolean flag3 = checkPhone(phone);
            if (flag3) {
                System.out.println("手机号码格式正确");
                break;
            } else {
                System.out.println("手机号码格式有误,请重新输入:");
                continue;
            }
        }

        User u1 = new User(username, password, userId, phone);
        list.add(u1);
        System.out.println("注册成功");
        printList(list);
    }

    //打印list集合
    private void printList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User u1 = list.get(i);
            System.out.printf("用户名为:%s\n密码为:%s\n身份证为:%s\n手机号为:%s", u1.getUsername(), u1.getUserId(), u1.getPassword(), u1.getPhone());
        }
    }

    //判断手机号码
    private boolean checkPhone(String phone) {
        int len = phone.length();
        //11位手机号
        if (len != 11) {
            return false;
        }
        //不能以0开头
        if (phone.startsWith("0")) {
            return false;
        }
        //纯数字
        for (int i = 0; i < len; i++) {
            char c = phone.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    //检查身份证
    private boolean CheckUserId(String userId) {
        int len = userId.length();
        //总长度为18
        if (len != 18) {
            return false;
        }
        //开头不能是0
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
        System.out.println("用户注册");
        User u1 = new User();
        while (true) {
            System.out.println("请输入注册用户名:");
            String username = sc.next();
            if (usernameContains(list, username) > -1) {
                //用户名存在
                System.out.println("该用户名已经存在,请重新输入:");
            } else {
                //用户名不存在
                //变成字符数组,来判断是否是数字加字母组合
                char[] arr = stringToChar(username);
                format:
                if (arr.length >= 3 && arr.length <= 15) {
                    //用户名在3到15之间
                    int intNum = 0;
                    for (int i = 0; i < arr.length; i++) {
                        //判断格式
                        if ((arr[i] >= '0' && arr[i] <= '9') || (arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z')) {
                            if (arr[i] >= '0' && arr[i] <= '9') {
                                intNum++;
                            }
                        } else {
                            //用户名格式错误
                            System.out.println("用户名必须是字母或者数字,但是不能是纯数字,请重新输入:");
                            break format;
                        }
                    }
                    //判断是否是纯数字
//                    System.out.println(intNum);
                    if (intNum == arr.length) {
                        //纯数字
                        System.out.println("不能为纯数字,请重新输入用户名:");
                    } else {
                        //验证两次密码
                        while (true) {
                            System.out.println("请输入注册密码:");
                            String password = sc.next();
                            System.out.println("请再次输入密码:");
                            String againPassword = sc.next();
                            if (password.equals(againPassword)) {
                                //相同
                                //输入身份证
                                System.out.println("请输入身份证:");
                                while (true) {
                                    String userId = sc.next();
                                    char[] arrId = stringToChar(userId);
                                    //验证身份证
                                    if (arrId.length != 18) {
                                        System.out.println("身份证应该为18位,请重新输入身份证:");
                                    } else {
                                        //验证前十七位
                                        boolean idFlag = true;
                                        for (int i = 0; i < arrId.length - 1; i++) {
                                            if (i == 0 && arrId[i] == '0' || arrId[i] < '0' || arrId[i] > '9') {
                                                //不合法
                                                System.out.println("输入身份证不合法,请重新输入:");
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
                                            //身份证合法
                                            //输入手机号
                                            System.out.println("请输入手机号");
                                            while (true) {
                                                String phone = sc.next();
                                                char[] arrPhone = stringToChar(phone);
                                                //验证手机号
                                                if (arrPhone.length != 11) {
                                                    //不为11位
                                                    System.out.println("输入的手机号应该为11位,请再次输入:");
                                                } else {
                                                    //为11位
                                                    boolean phFlag = true;
                                                    for (int i = 0; i < arrPhone.length; i++) {
                                                        if (i == 0 && arrPhone[i] == '0' || arrPhone[i] < '0' || arrPhone[i] > '9') {
                                                            phFlag = false;
                                                            break;
                                                        }
                                                    }
                                                    if (phFlag) {
                                                        //合法手机号
                                                        u1.setUsername(username);
                                                        u1.setPassword(password);
                                                        u1.setUserId(userId);
                                                        u1.setPhone(phone);
                                                        list.add(u1);
                                                        System.out.println("添加成功");
                                                        break;
                                                    } else {
                                                        //不合法手机号
                                                        System.out.println("输入手机号第一位不能是0,而且全部是数字,请再次输入:");
                                                    }
                                                }
                                            }
                                            break;
                                        } else {
                                            System.out.println("输入身份证最后一位应该为数字,或者大小写x:");
                                        }
                                    }
                                }
                                break;
                            } else {
                                //不相同
                                System.out.println("两个输入的密码不相同,请再次输入注册密码");
                            }
                        }
                        break;
                    }
                    //判断格式完成,没有错误
                } else {
                    //不在3~15
                    System.out.println("用户名长度必须在3~15之间,请重新输入:");
                }
            }
        }
    }*/

    //用户忘记密码
    public void userForgetPwd(ArrayList<User> list) {
        System.out.println("忘记密码");
        System.out.println("请输入您的用户名:");
        String username = sc.next();
        int index = usernameContains(list, username);
        if (index > -1) {
            //存在
            //输入手机号
            User u1 = list.get(index);
            System.out.println("请输入用户的手机号:");
            while (true) {
                String phone = sc.next();
                //判断手机号
                if (phone.equals(u1.getPhone())) {
                    //正确
                    //输入身份证
                    System.out.println("请输入身份证号:");
                    while (true) {
                        String userId = sc.next();
                        if (userId.equals(u1.getUserId())) {
                            //正确,输入新密码
                            System.out.println("验证正确,请输入新密码:");
                            String newPassword = sc.next();
                            //修改新密码
                            list.get(index).setPassword(newPassword);
                            System.out.println(list.get(index).getPassword());
                            System.out.println("修改密码成功");
                            return;
                        } else {
                            //不正确
                            System.out.println("身份证不正确,请重新输入:");
                        }
                    }
                } else {
                    //不正确
                    System.out.println("手机号错误,请从新输入:");
                }
            }

        } else {
            //不存在
            return;
        }

    }

    //判断用户名是否存在
    public int usernameContains(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User u1 = list.get(i);
            if (u1.getUsername().equals(username)) {
                //存在该id
                return i;
            }
        }
        //不存在
        return -1;
    }


    //将一个字符串转换为一个字符数组
    public char[] stringToChar(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            arr[i] = c;
        }
        return arr;
    }

    //生成验证码
    public String codeRandom() {
        /*生成验证码  长度为5
        长度为5 可以是大小写和数字 但是数字只能有一位
         */
        //1.定义一个字符数组来存储随机得到的字符
        char[] arr = new char[5];
        //2.得到随机的字母
        char charLetter;
        for (int i = 0; i < 4; i++) {
            charLetter = getChar();
            arr[i] = charLetter;
        }
        //3.得到随机的数字
        char charNumber = getInt();
        arr[4] = charNumber;
        //4.打乱字符数组
        char[] result = changechaos(arr);
        //5.打印字符串
        String str = new String(result);
//        System.out.println(str);
        return str;
    }

    //生成随机字母
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

    //生成随机数字
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

    //打乱验证码
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

    //验证用户名是否正确
    public boolean checkUsername(String username) {
        int len = username.length();
        //判断用户名长度是否在3~15
        if (len < 3 || len > 15) {
            //错误
            return false;
        } else {
            //正确
            //判断是不是纯数字
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
            //满足长度和内容;

        }
    }

    //验证身份证是否正确


}
