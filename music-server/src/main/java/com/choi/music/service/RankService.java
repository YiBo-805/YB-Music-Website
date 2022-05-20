package com.choi.music.service;

import com.choi.music.domain.Rank;

/**
 * @PackageName: com.choi.music.service
 * @Description: 评价service接口
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/12/6 16:08
 */

public interface RankService {
    /**
     *增加
     */
    public boolean insert(Rank rank);

    /**
     * 查总分
     */
    public int selectScoreSum(Integer songListId);

    /**
     * 查总评分人数
     */
    public int selectRankNum(Integer songListId);

    /**
     * 计算平均分
     */
    public int rankOfSongListId(Integer songListId);
}
