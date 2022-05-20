package com.choi.music.service;

import com.choi.music.domain.Singer;
import com.choi.music.domain.SongList;

import java.util.List;

/**
 * @PackageName: com.choi.music.service
 * @Description: 歌单service接口
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/11/30 22:42
 */

public interface SongListService {
    /**
     * @description 增加
     * @author Envy
     * @param songList
     * @return
     * @date 2021/12/4 23:09
     */
    public boolean insert(SongList songList);

    /**
     * @description 修改
     * @author Envy
     * @param songList
     * @return
     * @date 2021/12/4 23:08
     */
    public boolean update(SongList songList);

    /**
     * @description 删除
     * @author Envy
     * @param id
     * @return
     * @date 2021/12/4 23:08
     */
    public boolean delete(Integer id);

    /**
     * @description 根据主键查询整个对象
     * @author Envy
     * @param id
     * @return
     * @date 2021/12/4 23:08
     */
    public SongList selectByPrimaryKey(Integer id);

    /**
     * @description: 查询所有歌单
     * @author Envy
     * @date 23:08 2021/12/4
     * @version 1.0
     */
    public List<SongList> allSongList();

    /**
     * @description 根据标题精确查询歌单列表
     * @author Envy
     * @param title
     * @return
     * @date 2021/12/4 23:08
     */
    public List<SongList> songListOfTitle(String title);

    /**
     * @description 根据标题模糊查询歌单列表
     * @author Envy
     * @param title
     * @return
     * @date 2021/12/4 23:08
     */
    public List<SongList> likeTitle(String title);

    /**
     * @description 根据风格模糊查询歌单列表
     * @author Envy
     * @param style
     * @return
     * @date 2021/12/4 23:08
     */
    public List<SongList> likeStyle(String style);
}
