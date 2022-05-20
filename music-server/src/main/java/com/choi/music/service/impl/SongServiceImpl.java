package com.choi.music.service.impl;

import com.choi.music.dao.SongMapper;
import com.choi.music.domain.Song;
import com.choi.music.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName: com.choi.music.service.impl
 * @Description: 歌曲service实现类
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/11/30 22:43
 */
@Service
public class SongServiceImpl implements SongService {
    @Autowired
    private SongMapper songMapper;

    /**
     * @param song
     * @return
     * @description 增加
     * @author Envy
     * @date 2021/12/1 11:50
     */
    @Override
    public boolean insert(Song song) {
        return songMapper.insert(song)>0;
    }

    /**
     * @param song
     * @return
     * @description 修改
     * @author Envy
     * @date 2021/12/1 11:51
     */
    @Override
    public boolean update(Song song) {
        return songMapper.update(song)>0;
    }

    /**
     * @param id
     * @return
     * @description 删除
     * @author Envy
     * @date 2021/12/1 11:52
     */
    @Override
    public boolean delete(int id) {
        return songMapper.delete(id)>0;
    }

    /**
     * @param id
     * @return
     * @description 根据主键查询歌曲
     * @author Envy
     * @date 2021/12/1 11:53
     */
    @Override
    public Song selectByPrimaryKey(Integer id) {
        return songMapper.selectByPrimaryKey(id);
    }

    /**
     * @return
     * @description 查询所有歌曲
     * @author Envy
     * @date 2021/12/1 11:53
     */
    @Override
    public List<Song> allSong() {
        return songMapper.allSong();
    }

    /**
     * @param name
     * @return
     * @description 根据歌名精确查询
     * @author Envy
     * @date 2021/12/2 23:47
     */
    @Override
    public List<Song> SongOfName(String name) {
        return songMapper.songOfName(name);
    }

    /**
     * @param name
     * @return
     * @description 根据歌名模糊查询
     * @author Envy
     * @date 2021/12/1 11:54
     */
    @Override
    public List<Song> likeSongOfName(String name) {
        return songMapper.likeSongOfName("%"+name+"%");
    }

    /**
     * @param singerId
     * @return
     * @description 根据歌手id查询
     * @author Envy
     * @date 2021/12/2 23:48
     */
    @Override
    public List<Song> songOfSingerId(Integer singerId) {
        return songMapper.songOfSingerId(singerId);
    }
}
