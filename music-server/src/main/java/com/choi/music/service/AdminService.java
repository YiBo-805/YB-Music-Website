package com.choi.music.service;

/**
 * @PackageName: com.choi.music.service
 * @Description: 管理员service接口
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/11/30 22:42
 */

public interface AdminService {
    /**
     * @description 校验密码
     * @author Envy
     * @param username
     * @param password
     * @return
     * @date 2021/11/30 22:36
     */
    public boolean verifyPassword(String username, String password);
}
