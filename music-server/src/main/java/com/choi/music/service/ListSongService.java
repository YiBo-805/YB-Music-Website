package com.choi.music.service;

import com.choi.music.domain.ListSong;

import java.util.List;

/**
 * @PackageName: com.choi.music.service
 * @Description: 歌单歌曲service
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/12/5 23:19
 */

public interface ListSongService {
    /**
     *增加
     */
    public boolean insert(ListSong listSong);

    /**
     *修改
     */
    public boolean update(ListSong listSong);

    /**
     * 删除
     */
    public boolean delete(Integer id);

    /**
     * 根据歌曲id和歌单id删除
     */
    public boolean deleteBySongIdAndSongListId(Integer songId,Integer songListId);

    /**
     * 根据主键查询整个对象
     */
    public ListSong selectByPrimaryKey(Integer id);

    /**
     * 查询所有歌单里面的歌曲
     */
    public List<ListSong> allListSong();

    /**
     * 根据歌单id查询所有的歌曲
     */
    public List<ListSong> listSongOfSongListId(Integer songListId);
}
