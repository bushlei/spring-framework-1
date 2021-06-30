package com.zero.st005;

import java.util.List;

/**
 * @description: 测试B类
 * @author: 曹长荣
 * @create: 2021-06-30 22:05
 **/
public class TestB {
    private String userId;

    private String userName;

    private List<String> phoneList;

    public TestB() {
    }

    public TestB(String userId, String userName, List<String> phoneList) {
        this.userId = userId;
        this.userName = userName;
        this.phoneList = phoneList;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<String> phoneList) {
        this.phoneList = phoneList;
    }

    @Override
    public String toString() {
        return "TestB{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", phoneList=" + phoneList +
                '}';
    }
}
