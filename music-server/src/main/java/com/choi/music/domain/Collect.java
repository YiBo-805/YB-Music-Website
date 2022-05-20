package com.choi.music.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: 收藏
 * @author Envy
 * @date 15:11 2021/12/6
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Collect implements Serializable {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 收藏类型（0歌曲1歌单）
     */
    private Byte type;
    /**
     * 歌曲id
     */
    private Integer songId;
    /**
     * 歌单id
     */
    private Integer songListId;
    /**
     * 收藏时间
     */
    private Date createTime;


}
