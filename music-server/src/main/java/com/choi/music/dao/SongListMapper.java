package com.choi.music.dao;

import com.choi.music.domain.SongList;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @PackageName: com.choi.music.dao
 * @Description: 歌单mapper
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/11/30 22:01
 */

@Repository
public interface SongListMapper {
    /**
     * @description 增加
     * @author Envy
     * @param songList
     * @return
     * @date 2021/12/1 11:50
     */
    public int insert(SongList songList);

    /**
     * @description 修改
     * @author Envy
     * @param songList
     * @return
     * @date 2021/12/1 11:51
     */
    public int update(SongList songList);

    /**
     * @description 删除
     * @author Envy
     * @param id
     * @return
     * @date 2021/12/1 11:52
     */
    public int delete(int id);
    /**
     * @description 根据主键查询歌单
     * @author Envy
     * @param id
     * @return
     * @date 2021/12/1 11:53
     */
    public SongList selectByPrimaryKey(Integer id);

    /**
     * @description 查询所有歌单
     * @author Envy
     * @param
     * @return
     * @date 2021/12/1 11:53
     */
    public List<SongList> allSongList();
    /**
     * @description 根据歌单标题精确查询
     * @author Envy
     * @param title
     * @return
     * @date 2021/12/1 11:54
     */
    public List<SongList> songListOfTitle(String title);
    /**
     * @description 根据歌单标题模糊查询
     * @author Envy
     * @param title
     * @return
     * @date 2021/12/1 11:54
     */
    public List<SongList> likeTitle(String title);
    /**
     * @description 根据风格模糊查询
     * @author Envy
     * @param style
     * @return
     * @date 2021/12/1 15:56
     */
    public List<SongList> likeStyle(String style);

}

