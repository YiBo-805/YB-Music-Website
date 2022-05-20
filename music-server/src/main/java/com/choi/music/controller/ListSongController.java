package com.choi.music.controller;

import com.alibaba.fastjson.JSONObject;
import com.choi.music.domain.ListSong;
import com.choi.music.service.ListSongService;
import com.choi.music.utils.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @PackageName: com.choi.music.controller
 * @Description: 歌单歌曲controller
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/12/5 23:26
 */
@RestController
@RequestMapping("/listSong")
public class ListSongController {
    @Autowired
    private ListSongService listSongService;


    /**
     * 给歌单添加歌曲
     */
    @RequestMapping(value = "/add")
    @PostMapping
    public Object addListSong(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        //获取前端传来的参数
        String songId = request.getParameter("songId").trim();  //歌曲id
        String songListId = request.getParameter("songListId").trim(); //歌单id
        ListSong listSong = new ListSong();
        listSong.setSongId(Integer.parseInt(songId));
        listSong.setSongListId(Integer.parseInt(songListId));
        boolean flag = listSongService.insert(listSong);
        if(flag){
            jsonObject.put(Consts.CODE,1);
            jsonObject.put(Consts.MSG,"保存成功");
            return jsonObject;
        }
        jsonObject.put(Consts.CODE,0);
        jsonObject.put(Consts.MSG,"保存失败");
        return jsonObject;

    }

    /**
     * 根据歌单id查询歌曲
     */
    @RequestMapping(value = "/detail")
    @GetMapping
    public Object detail(HttpServletRequest request){
        String songListId = request.getParameter("songListId");
        return listSongService.listSongOfSongListId(Integer.parseInt(songListId));
    }

    /**
     * 删除歌单里的歌曲
     */
    @RequestMapping(value = "/delete")
    @GetMapping
    public Object delete(HttpServletRequest request){
        String songId = request.getParameter("songId").trim();                 //歌曲id
        String songListId = request.getParameter("songListId").trim();        //歌单id
        boolean flag = listSongService.deleteBySongIdAndSongListId(Integer.parseInt(songId),Integer.parseInt(songListId));
        return flag;
    }
}
