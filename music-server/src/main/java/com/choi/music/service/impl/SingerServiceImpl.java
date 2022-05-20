package com.choi.music.service.impl;

import com.choi.music.dao.AdminMapper;
import com.choi.music.dao.SingerMapper;
import com.choi.music.domain.Singer;
import com.choi.music.service.AdminService;
import com.choi.music.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName: com.choi.music.service.impl
 * @Description: 歌手service实现类
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/11/30 22:43
 */
@Service
public class SingerServiceImpl implements SingerService {
    @Autowired
    private SingerMapper singerMapper;
    /**
     * @param singer
     * @return
     * @description 增加
     * @author Envy
     * @date 2021/12/1 11:50
     */
    @Override
    public boolean insert(Singer singer) {
        return singerMapper.insert(singer) > 0;
    }

    /**
     * @param singer
     * @return
     * @description 修改
     * @author Envy
     * @date 2021/12/1 11:51
     */
    @Override
    public boolean update(Singer singer) {
        return singerMapper.update(singer) > 0;
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
        return singerMapper.delete(id) > 0;
    }

    /**
     * @param id
     * @return
     * @description 根据主键查询歌手
     * @author Envy
     * @date 2021/12/1 11:53
     */
    @Override
    public Singer selectByPrimaryKey(Integer id) {
        return singerMapper.selectByPrimaryKey(id);
    }

    /**
     * @return
     * @description 查询所有歌手
     * @author Envy
     * @date 2021/12/1 11:53
     */
    @Override
    public List<Singer> allSinger() {
        return singerMapper.allSinger();
    }

    /**
     * @param name
     * @return
     * @description 根据歌手名模糊查询
     * @author Envy
     * @date 2021/12/1 11:54
     */
    @Override
    public List<Singer> singerOfName(String name) {
        return singerMapper.singerOfName(name);
    }

    /**
     * @param sex
     * @return
     * @description 根据性别查询
     * @author Envy
     * @date 2021/12/1 15:56
     */
    @Override
    public List<Singer> singerOfSex(Integer sex) {
        return singerMapper.singerOfSex(sex);
    }
}
