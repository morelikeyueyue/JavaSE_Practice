package com.itheima.oop.userinfo;

public class UserInfo {

    //����
    private String username;
    private String password;
    private String email;
    private char gender;
    private int age;

    public UserInfo() {
    }

    public UserInfo(String username, String password, String email, char gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    /**
     * ��ȡ
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * ����
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * ��ȡ
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * ����
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * ��ȡ
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * ����
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * ��ȡ
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * ����
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * ��ȡ
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * ����
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "UserInfo{username = " + username + ", password = " + password + ", email = " + email + ", gender = " + gender + ", age = " + age + "}";
    }


    //��ݼ�:alt+insert\ alt+FN+insert
    //���PTG 1�����ɱ�׼JavaBean






}
