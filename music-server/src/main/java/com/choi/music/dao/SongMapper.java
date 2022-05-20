package com.choi.music.dao;

import com.choi.music.domain.Song;
import com.choi.music.domain.Song;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @PackageName: com.choi.music.dao
 * @Description: 歌曲mapper
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/11/30 22:01
 */

@Repository
public interface SongMapper {
    /**
     * @description 增加
     * @author Envy
     * @param song
     * @return
     * @date 2021/12/1 11:50
     */
    public int insert(Song song);

    /**
     * @description 修改
     * @author Envy
     * @param song
     * @return
     * @date 2021/12/1 11:51
     */
    public int update(Song song);

    /**
     * @description 删除
     * @author Envy
     * @param id
     * @return
     * @date 2021/12/1 11:52
     */
    public int delete(int id);
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
     * @description 根据歌名模糊查询
     * @author Envy
     * @param name
     * @return
     * @date 2021/12/1 11:54
     */
    public List<Song> likeSongOfName(String name);
    /**
     * @description 根据歌名精确查询
     * @author Envy
     * @param name
     * @return
     * @date 2021/12/1 11:54
     */
    public List<Song> songOfName(String name);
    /**
     * @description 根据歌手id
     * @author Envy
     * @param  singerId
     * @return
     * @date 2021/12/1 15:56
     */
    public List<Song> songOfSingerId(Integer singerId);

}

