package com.choi.music.dao;

import com.choi.music.domain.Consumer;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @PackageName: com.choi.music.dao
 * @Description: 前端用户mapper
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/12/6 15:46
 */
@Repository
public interface ConsumerMapper {
    /**
     *增加
     */
    public int insert(Consumer consumer);

    /**
     *修改
     */
    public int update(Consumer consumer);

    /**
     * 删除
     */
    public int delete(Integer id);

    /**
     * 根据主键查询整个对象
     */
    public Consumer selectByPrimaryKey(Integer id);

    /**
     * 查询所有用户
     */
    public List<Consumer> allConsumer();

    /**
     * 验证密码
     */
    public int verifyPassword(@Param("username") String username, @Param("password") String password);

    /**
     * 根据账号查询
     */
    public Consumer getByUsername(String username);
}
