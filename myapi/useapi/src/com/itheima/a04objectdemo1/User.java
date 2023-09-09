package com.itheima.a04objectdemo1;

import java.util.StringJoiner;

public class User implements Cloneable {

    //Cloneable 如果一个接口里面没有抽象方法,表示当前的接口是一个标记性接口
    //现在cloneable 表示一旦实现了,表示当前类的对象就可以被克隆
    //如果没有实现,当前类的对象不能被克隆

    private int id;
    private String username;
    private String password;
    private String path;
    private int[] data;

    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取
     * @return data
     */
    public int[] getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "角色{编号 = " + id + ", 用户名 = " + username + ", 密码 = " + password + ", 游戏图片 = " + path + ", 进度 = " + arrToString() + "}";
    }

    public String arrToString() {
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i]+" ");
        }
        return sj.toString();
    }


    //调用父类的clone方法
    //相对于java帮我们克隆一个对象,并把克隆之后的对象返回出去
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //先把被克隆的对象中的数组获取出来
        int[] data = this.data;
        //创建新的数组
        int[] newarr = new int[data.length];
        //拷贝到新数组
        System.arraycopy(data, 0, newarr, 0, data.length);
        User u = (User)super.clone();
        u.data = newarr;
        return u;
    }
}
