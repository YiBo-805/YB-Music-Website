package com.choi.music.service;

import com.choi.music.domain.Song;

import java.util.List;

/**
 * @PackageName: com.choi.music.service
 * @Description: 歌曲service接口
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/11/30 22:42
 */

public interface SongService {
    /**
     * @description 增加
     * @author Envy
     * @param song
     * @return
     * @date 2021/12/1 11:50
     */
    public boolean insert(Song song);

    /**
     * @description 修改
     * @author Envy
     * @param song
     * @return
     * @date 2021/12/1 11:51
     */
    public boolean update(Song song);

    /**
     * @description 删除
     * @author Envy
     * @param id
     * @return
     * @date 2021/12/1 11:52
     */
    public boolean delete(int id);
    /**
     * @description 根据主键查询歌曲
     * @author Envy
     * @param id
     * @return
     * @date 2021/12/1 11:53
     */
    public Song selectByPrimaryKey(Integer id);

    /**
     * @description 查询所有歌曲
     * @author Envy
     * @param
     * @return
     * @date 2021/12/1 11:53
     */
    public List<Song> allSong();
    /**
     * @description 根据歌名精确查询
     * @author Envy
     * @param name
     * @return
     * @date 2021/12/2 23:47
     */
    public List<Song> SongOfName(String name);
    /**
     * @description 根据歌名模糊查询
     * @author Envy
     * @param name
     * @return
     * @date 2021/12/1 11:54
     */
    public List<Song> likeSongOfName(String name);
    /**
     * @description 根据歌手id查询
     * @author Envy
     * @param singerId
     * @return
     * @date 2021/12/2 23:48
     */
    public List<Song> songOfSingerId(Integer singerId);
}
