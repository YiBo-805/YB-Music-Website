package com.choi.music.service.impl;

import com.choi.music.dao.ListSongMapper;
import com.choi.music.domain.ListSong;
import com.choi.music.service.ListSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName: com.choi.music.service.impl
 * @Description: TODO
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/12/5 23:20
 */
@Service
public class ListSongServiceImpl implements ListSongService {
    @Autowired
    private ListSongMapper listSongMapper;
    /**
     * 增加
     *
     * @param listSong
     */
    @Override
    public boolean insert(ListSong listSong) {
        return listSongMapper.insert(listSong)>0;
    }

    /**
     * 修改
     *
     * @param listSong
     */
    @Override
    public boolean update(ListSong listSong) {
        return listSongMapper.update(listSong)>0;
    }

    /**
     * 删除
     *
     * @param id
     */
    @Override
    public boolean delete(Integer id) {
        return listSongMapper.delete(id)>0;
    }

    /**
     * 根据歌曲id和歌单id删除
     *
     * @param songId
     * @param songListId
     */
    @Override
    public boolean deleteBySongIdAndSongListId(Integer songId, Integer songListId) {
        return listSongMapper.deleteBySongIdAndSongListId(songId,songListId)>0;
    }

    /**
     * 根据主键查询整个对象
     *
     * @param id
     */
    @Override
    public ListSong selectByPrimaryKey(Integer id) {
        return listSongMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询所有歌单里面的歌曲
     */
    @Override
    public List<ListSong> allListSong() {
        return listSongMapper.allListSong();
    }

    /**
     * 根据歌单id查询所有的歌曲
     *
     * @param songListId
     */
    @Override
    public List<ListSong> listSongOfSongListId(Integer songListId) {
        return listSongMapper.listSongOfSongListId(songListId);
    }
}
