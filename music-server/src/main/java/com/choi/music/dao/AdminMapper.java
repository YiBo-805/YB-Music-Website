package com.choi.music.dao;

import org.springframework.stereotype.Repository;

/**
 * @PackageName: com.choi.music.dao
 * @Description: 管理员mapper
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/11/30 22:01
 */

@Repository
public interface AdminMapper {
    /**
     * @description 校验密码
     * @author Envy
     * @param username
     * @param password
     * @return
     * @date 2021/11/30 22:36
     */
    public int verifyPassword(String username, String password);
}

