package com.choi.music.service.impl;

import com.choi.music.dao.AdminMapper;
import com.choi.music.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @PackageName: com.choi.music.service.impl
 * @Description: 管理员service实现类
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/11/30 22:43
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    /**
     * @param username
     * @param password
     * @return
     * @description 校验密码
     * @author Envy
     * @date 2021/11/30 22:36
     */
    @Override
    public boolean verifyPassword(String username, String password) {
        return adminMapper.verifyPassword(username,password)>0;

    }
}
