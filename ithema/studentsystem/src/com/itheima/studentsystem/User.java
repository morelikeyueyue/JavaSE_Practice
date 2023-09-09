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
     * 获取
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     *
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取
     *
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
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
