package com.itheima.test.user;

import java.util.ArrayList;

public class UserInfoTest {
    public static void main(String[] args) {
        //1.����list
        ArrayList<UserInfo> list = new ArrayList<>();

        //2.���������û�����
        UserInfo u1= new UserInfo("001","zhangsan","123");
        UserInfo u2= new UserInfo("002","lisi","1234");
        UserInfo u3= new UserInfo("003","wangwu","12345");

        //3.��ӵ�list������
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //3.����һ������ͨ��id�����Ҷ�Ӧ���û���Ϣ
        UserInfo result = selectId("004", list);
        if (result!=null) {
            System.out.printf("�û�idΪ:%s\n�û�����Ϊ:%s\n�û�����Ϊ:%s\n",result.getId(),result.getUsername(),result.getPassword());
        }else {
            System.out.println("����id����,δ��ѯ�����û�");
        }


    }


    //ͨ��id���ҵ��û�
    private static UserInfo selectId(String id,ArrayList<UserInfo> list) {
        UserInfo user;
        for (int i = 0; i < list.size(); i++) {
            user = list.get(i);
            if (user.getId().equals(id)){
                return user;
            }
        }
        return null;
    }
}
