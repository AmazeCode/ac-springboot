package com.ac.springboot.domain;

import lombok.Data;

/**
 * @Description: 用户实体
 * @author: zhangyadong
 * @Date: 2019/11/18 0018 下午 4:33
 * @version: V1.0
 */
@Data//会自动添加getter、setter、hashCode、equals、toString方法
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
