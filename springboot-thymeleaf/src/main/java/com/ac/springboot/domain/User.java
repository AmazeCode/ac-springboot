package com.ac.springboot.domain;

/**
 * @Description: 用户实体
 * @author: zhangyadong
 * @Date: 2019/11/18 0018 下午 4:33
 * @version: V1.0
 */
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;

    /**
     * @Description 构造方法
     * @params []
     * @return
     * @author zhangyadong
     * @date 2019/11/19 0019 下午 8:11
     */
    public User() {
    }

    /**
     * @Description 构造方法
     * @params [id, name, age, email]
     * @return
     * @author zhangyadong
     * @date 2019/11/19 0019 下午 8:10
     */
    public User(Long id, String name, Integer age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
