package com.choi.music.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @PackageName: com.choi.music.domain
 * @Description: 歌单歌曲实体类
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/12/5 18:50
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ListSong implements Serializable {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 歌曲Id
     */
    private Integer songId;
    /**
     * 歌单Id
     */
    private Integer songListId;
}
