package com.choi.music.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: 评论
 * @author Envy
 * @date 15:12 2021/12/6
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment implements Serializable {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 评论类型（0歌曲1歌单）
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
     * 评论内容
     */
    private String content;
    /**
     * 评论时间
     */
    private Date createTime;
    /**
     * 评论点赞数
     */
    private Integer up;


}
