package com.choi.music.service.impl;

import com.choi.music.dao.SongListMapper;
import com.choi.music.domain.SongList;
import com.choi.music.service.SongListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName: com.choi.music.service.impl
 * @Description: TODO
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/12/4 23:09
 */
@Service
public class SongListServiceImpl implements SongListService {
    @Autowired
    private SongListMapper songListMapper;
    /**
     * @param songList
     * @return
     * @description 增加
     * @author Envy
     * @date 2021/12/4 23:09
     */
    @Override
    public boolean insert(SongList songList) {
        return songListMapper.insert(songList)>0;
    }

    /**
     * @param songList
     * @return
     * @description 修改
     * @author Envy
     * @date 2021/12/4 23:08
     */
    @Override
    public boolean update(SongList songList) {
        return songListMapper.update(songList)>0;
    }

    /**
     * @param id
     * @return
     * @description 删除
     * @author Envy
     * @date 2021/12/4 23:08
     */
    @Override
    public boolean delete(Integer id) {
        return songListMapper.delete(id)>0;
    }

    /**
     * @param id
     * @return
     * @description 根据主键查询整个对象
     * @author Envy
     * @date 2021/12/4 23:08
     */
    @Override
    public SongList selectByPrimaryKey(Integer id) {
        return songListMapper.selectByPrimaryKey(id);
    }

    /**
     * @description: 查询所有歌单
     * @author Envy
     * @date 23:08 2021/12/4
     * @version 1.0
     */
    @Override
    public List<SongList> allSongList() {
        return songListMapper.allSongList();
    }

    /**
     * @param title
     * @return
     * @description 根据标题精确查询歌单列表
     * @author Envy
     * @date 2021/12/4 23:08
     */
    @Override
    public List<SongList> songListOfTitle(String title) {
        return songListMapper.songListOfTitle(title);
    }

    /**
     * @param title
     * @return
     * @description 根据标题模糊查询歌单列表
     * @author Envy
     * @date 2021/12/4 23:08
     */
    @Override
    public List<SongList> likeTitle(String title) {
        return songListMapper.likeTitle(title);
    }

    /**
     * @param style
     * @return
     * @description 根据风格模糊查询歌单列表
     * @author Envy
     * @date 2021/12/4 23:08
     */
    @Override
    public List<SongList> likeStyle(String style) {
        return songListMapper.likeStyle(style);
    }
}
