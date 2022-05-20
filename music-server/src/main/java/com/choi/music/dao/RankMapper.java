package com.choi.music.dao;

import com.choi.music.domain.Rank;
import org.springframework.stereotype.Repository;

/**
 * @PackageName: com.choi.music.dao
 * @Description: 评价dao
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/12/6 16:04
 */
@Repository
public interface RankMapper {
    /**
     *增加
     */
    public int insert(Rank rank);

    /**
     * 查总分
     */
    public int selectScoreSum(Integer songListId);

    /**
     * 查总评分人数
     */
    public int selectRankNum(Integer songListId);
}
