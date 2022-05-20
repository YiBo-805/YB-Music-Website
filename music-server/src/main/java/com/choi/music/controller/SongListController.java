package com.choi.music.controller;

import com.alibaba.fastjson.JSONObject;
import com.choi.music.domain.SongList;
import com.choi.music.domain.SongList;
import com.choi.music.service.SongListService;
import com.choi.music.utils.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @PackageName: com.choi.music.dao
 * @Description: 歌单controller
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/12/4 23:13
 */
@RestController
@RequestMapping("/songList")
public class SongListController {
    @Autowired
    private SongListService songListService;

    /**
     * 添加歌单
     */
    @RequestMapping("/add")
    @PostMapping
    public  Object addSongList(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        //标题
        String title = request.getParameter("title").trim();
        //封面
        String pic = request.getParameter("pic").trim();
        //简介
        String introduction = request.getParameter("introduction").trim();
        //风格
        String style = request.getParameter("style").trim();
        //保存到歌单的对象中
        SongList songList = new SongList();
        songList.setTitle(title);
        songList.setPic(pic);
        songList.setIntroduction(introduction);
        songList.setStyle(style);
        boolean flag = songListService.insert(songList);
        if (flag){
            jsonObject.put(Consts.CODE,1);
            jsonObject.put(Consts.MSG,"添加成功");
            return jsonObject;
        }
        jsonObject.put(Consts.CODE,0);
        jsonObject.put(Consts.MSG,"添加失败");
        return jsonObject;
    }
    /**
     * 修改歌单
     */
    @RequestMapping( "/update")
    @PostMapping
    public Object updateSongList(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        //主键
        String id = request.getParameter("id").trim();
        //标题
        String title = request.getParameter("title").trim();
        //简介
        String introduction = request.getParameter("introduction").trim();
        //风格
        String style = request.getParameter("style").trim();
        //保存到歌单的对象中
        SongList songList = new SongList();
        songList.setId(Integer.parseInt(id));
        songList.setTitle(title);
        songList.setIntroduction(introduction);
        songList.setStyle(style);
        boolean flag = songListService.update(songList);
        if(flag){   //保存成功
            jsonObject.put(Consts.CODE,1);
            jsonObject.put(Consts.MSG,"修改成功");
            return jsonObject;
        }
        jsonObject.put(Consts.CODE,0);
        jsonObject.put(Consts.MSG,"修改失败");
        return jsonObject;
    }
    /**
     * 删除歌单
     */
    @RequestMapping("/delete")
    @GetMapping
    public Object deleteSongList(HttpServletRequest request){
        String id = request.getParameter("id").trim();          //主键
        boolean flag = songListService.delete(Integer.parseInt(id));
        return flag;
    }
    /**
     * 根据主键查询整个对象
     */
    @RequestMapping("/selectByPrimaryKey")
    @GetMapping
    public Object selectByPrimaryKey(HttpServletRequest request){
        String id = request.getParameter("id").trim();          //主键
        return songListService.selectByPrimaryKey(Integer.parseInt(id));
    }
    /**
     * 查询全部歌单
     */
    @RequestMapping("/allSongList")
    @GetMapping
    public Object allSongList(HttpServletRequest request){
        return songListService.allSongList();
    }
    /**
     * 根据歌单标题准确查询列表
     */
    @RequestMapping( "/songListOfTitle")
    @GetMapping
    public Object songListOfName(HttpServletRequest request){
        String name = request.getParameter("name").trim();          //歌单名字
        return songListService.songListOfTitle(name);
    }
    /**
     * 根据歌单标题模糊查询列表
     */
    @RequestMapping(value = "/likeTitle")
    @GetMapping
    public Object likeTitle(HttpServletRequest request){
        String title = request.getParameter("title").trim();          //歌单名字
        return songListService.likeTitle("%"+title+"%");
    }
    /**
     * 根据风格模糊查询歌单列表
     */
    @RequestMapping(value = "/likeStyle")
    @GetMapping
    public Object likeStyle(HttpServletRequest request){
        String style = request.getParameter("style").trim();          //歌单风格
        return songListService.likeStyle("%"+style+"%");
    }


    /**
     * 更新歌单图片
     */
    @RequestMapping("/updateSongListPic")
    @PostMapping
    public Object updateSongListPic(@RequestParam("file") MultipartFile avatorFile, @RequestParam("id")int id){
        JSONObject jsonObject = new JSONObject();
        if(avatorFile.isEmpty()){
            jsonObject.put(Consts.CODE,0);
            jsonObject.put(Consts.MSG,"文件上传失败");
            return jsonObject;
        }
        //文件名=当前时间到毫秒+随机UUID+文件类型
        String fileType = avatorFile.getOriginalFilename().substring(avatorFile.getOriginalFilename().lastIndexOf("."));
        String fileName = System.currentTimeMillis()+ UUID.randomUUID().toString()+fileType;
        //文件路径
        String filePath = System.getProperty("user.dir")+System.getProperty("file.separator")+"img"
                +System.getProperty("file.separator")+"songListPic";
        //如果文件路径不存在，新增该路径
        File file1 = new File(filePath);
        if(!file1.exists()){
            file1.mkdir();
        }
        //实际的文件地址
        File dest = new File(filePath+System.getProperty("file.separator")+fileName);
        //存储到数据库里的相对文件地址
        String storeAvatorPath = "/img/songListPic/"+fileName;
        try {
            avatorFile.transferTo(dest);
            SongList songList = new SongList();
            songList.setId(id);
            songList.setPic(storeAvatorPath);
            boolean flag = songListService.update(songList);
            if(flag){
                jsonObject.put(Consts.CODE,1);
                jsonObject.put(Consts.MSG,"上传成功");
                jsonObject.put("pic",storeAvatorPath);
                return jsonObject;
            }
            jsonObject.put(Consts.CODE,0);
            jsonObject.put(Consts.MSG,"上传失败");
            return jsonObject;
        } catch (IOException e) {
            jsonObject.put(Consts.CODE,0);
            jsonObject.put(Consts.MSG,"上传失败"+e.getMessage());
        }finally {
            return jsonObject;
        }
    }
}
