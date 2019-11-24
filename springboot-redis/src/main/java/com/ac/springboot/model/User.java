package com.ac.springboot.model;
/**
 *  @Description: 用户类
 *  @author: zhangyadong
 *  @Date: 2019/11/23 13:10
 *  @version: V1.0
 */
public class User {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String userName;
    private String password;
    private String email;
    private String nickname;
    private String regTime;

    public User() {
        super();
    }

    public User(String email, String nickname, String password, String userName, String regTime) {
        super();
        this.email = email;
        this.nickname = nickname;
        this.password = password;
        this.userName = userName;
        this.regTime = regTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }
}
