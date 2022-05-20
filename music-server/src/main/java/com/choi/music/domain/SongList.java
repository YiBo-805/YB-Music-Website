package com.choi.music.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @PackageName: com.choi.music.domain
 * @Description: 歌手实体类
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/11/30 22:00
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SongList implements Serializable {
    /**
     *主键
     */
    private Integer id;
    /**
     * 标题
     */
    private String title;
    /**
     * 图片
     */
    private String pic;
    /**
     * 简介
     */
    private String introduction;
    /**
     * 风格
     */
    private String style;

}
