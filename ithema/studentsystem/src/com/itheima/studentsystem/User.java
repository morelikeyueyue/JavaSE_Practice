package com.itheima.studentsystem;

public class User {
    private String username;
    private String password;
    private String userId;
    private String phone;


    public User() {
    }

    public User(String username, String password, String userId, String phone) {
        this.username = username;
        this.password = password;
        this.userId = userId;
        this.phone = phone;
    }

    /**
     * ��ȡ
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * ����
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * ��ȡ
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * ����
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * ��ȡ
     *
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ����
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * ��ȡ
     *
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * ����
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return "User{username = " + username + ", password = " + password + ", userId = " + userId + ", phone = " + phone + "}";
    }
}
