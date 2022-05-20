package com.choi.music.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @PackageName: com.choi.music.domain
 * @Description: 歌曲实体类
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/11/30 22:00
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Song implements Serializable {
    /**
     *主键
     */
    private Integer id;
    /**
     * 歌手id
     */
    private Integer singerId;
    /**
     * 歌曲名
     */
    private String name;
    /**
     * 图片
     */
    private String pic;
    /**
     * 发行日期
     */
    private Date createTime;
    /**
     * 上传日期
     */
    private Date updateTime;
    /**
     * 歌词
     */
    private String lyric;
    /**
     * 简介
     */
    private String introduction;
    /**
     * 歌曲地址
     */
    private String url;
    /**
     * MV地址
     */
    private String mvurl;

}
