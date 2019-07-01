package com.liuwq.entity;

public class UserEntity {
    private Integer userId;
    private String userName;

    public UserEntity() {
        System.out.println(">>>无参构造方法...");
    }

    public UserEntity(Integer userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        System.out.println(">>>有参构造方法...");
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
