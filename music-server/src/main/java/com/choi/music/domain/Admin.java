package com.choi.music.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @PackageName: com.choi.music.domain
 * @Description: 管理员实体类
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/11/30 22:00
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Admin implements Serializable {
    /**
     *主键
     */
    private Integer id;
    /**
     * 账号
     */
    private String name;
    /**
     * 密码
     */
    private String password;
}
