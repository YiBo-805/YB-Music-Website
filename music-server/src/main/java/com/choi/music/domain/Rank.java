package com.choi.music.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description: 评价
 * @author Envy
 * @date 15:11 2021/12/6
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rank implements Serializable {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 歌单id
     */
    private Integer songListId;
    /**
     * 用户id
     */
    private Integer consumerId;
    /**
     * 评分
     */
    private Integer score;


}
