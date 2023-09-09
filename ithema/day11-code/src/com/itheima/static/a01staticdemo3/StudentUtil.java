package ccom.itheima.a01staticdemo1.a01staticdemo3;

import java.util.ArrayList;

public class StudentUtil {


    //获得最大的年龄的
    public static int getMaxAge(ArrayList<ccom.itheima.a01staticdemo1.a01staticdemo3.Student> list){
        int maxAge = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int tempage = list.get(i).getAge();
            if (maxAge<tempage){
                maxAge = tempage;
            }
        }
        return maxAge;
    }
}
