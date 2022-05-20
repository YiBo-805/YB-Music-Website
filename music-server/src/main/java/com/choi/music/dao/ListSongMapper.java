package com.choi.music.dao;

import com.choi.music.domain.ListSong;
import com.choi.music.domain.SongList;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @PackageName: com.choi.music.dao
 * @Description: 歌单歌曲DAO
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/12/5 18:54
 */
@Repository
public interface ListSongMapper {
    /**
     * 添加
     */
    public int insert(ListSong listSong);

    /**
     * 修改
     */
    public int update(ListSong listSong);

    /**
     * 删除
     */
    public int delete(Integer id);
    /**
     * 根据歌曲id和歌单id删除
     */
    public int deleteBySongIdAndSongListId(@Param("songId") Integer songId, @Param("songListId")Integer songListId);

    /**
     * 根据主键查询
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
