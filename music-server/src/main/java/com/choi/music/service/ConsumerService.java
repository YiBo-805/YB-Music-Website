package com.choi.music.service;

import com.choi.music.domain.Consumer;

import java.util.List;

/**
 * @PackageName: com.choi.music.service
 * @Description: 前端用户service接口
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/12/6 15:50
 */

public interface ConsumerService {
    /**
     *增加
     */
    public boolean insert(Consumer consumer);

    /**
     *修改
     */
    public boolean update(Consumer consumer);

    /**
     * 删除
     */
    public boolean delete(Integer id);

    /**
     * 根据主键查询整个对象
     */
    public Consumer selectByPrimaryKey(Integer id);

    /**
     * 查询所有用户
     */
    public List<Consumer> allConsumer();

    /**
     * 查看密码是否正确
     */
    public boolean verifyPassword(String username,String password);

    /**
     * 根据账号查询
     */
    public Consumer getByUsername(String username);
}
