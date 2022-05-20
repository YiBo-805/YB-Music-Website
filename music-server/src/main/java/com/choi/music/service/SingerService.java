package com.choi.music.service;

import com.choi.music.domain.Singer;

import java.util.List;

/**
 * @PackageName: com.choi.music.service
 * @Description: 歌手service接口
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/11/30 22:42
 */

public interface SingerService {
    /**
     * @description 增加
     * @author Envy
     * @param singer
     * @return
     * @date 2021/12/1 11:50
     */
    public boolean insert(Singer singer);

    /**
     * @description 修改
     * @author Envy
     * @param singer
     * @return
     * @date 2021/12/1 11:51
     */
    public boolean update(Singer singer);

    /**
     * @description 删除
     * @author Envy
     * @param id
     * @return
     * @date 2021/12/1 11:52
     */
    public boolean delete(int id);
    /**
     * @description 根据主键查询歌手
     * @author Envy
     * @param id
     * @return
     * @date 2021/12/1 11:53
     */
    public Singer selectByPrimaryKey(Integer id);

    /**
     * @description 查询所有歌手
     * @author Envy
     * @param
     * @return
     * @date 2021/12/1 11:53
     */
    public List<Singer> allSinger();
    /**
     * @description 根据歌手名模糊查询
     * @author Envy
     * @param name
     * @return
     * @date 2021/12/1 11:54
     */
    public List<Singer> singerOfName(String name);
    /**
     * @description 根据性别查询
     * @author Envy
     * @param sex
     * @return
     * @date 2021/12/1 15:56
     */
    public List<Singer> singerOfSex(Integer sex);
}
