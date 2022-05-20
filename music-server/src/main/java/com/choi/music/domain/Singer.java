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
public class Singer implements Serializable {
    /**
     *主键
     */
    private Integer id;
    /**
     * 名字
     */
    private String name;
    /**
     * 性别
     */
    private Byte sex;
    /**
     * 图片
     */
    private String pic;
    /**
     * 生日
     */
    private Date birth;
    /**
     * 地区
     */
    private String location;
    /**
     * 简介
     */
    private String introduction;

}
