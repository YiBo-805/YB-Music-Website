package com.choi.music.controller;

import com.alibaba.fastjson.JSONObject;
import com.choi.music.domain.Singer;
import com.choi.music.service.AdminService;
import com.choi.music.service.SingerService;
import com.choi.music.utils.Consts;
import javafx.scene.input.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @PackageName: com.choi.music.controller
 * @Description: 歌手控制类
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/11/30 22:49
 */
@RestController
@RequestMapping("/singer")
public class SingerController {
    @Autowired
    private SingerService singerService;

    /**
     * 添加歌手
     */
    @RequestMapping("/add")
    @PostMapping
    public  Object addSinger(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        //姓名
        String name = request.getParameter("name").trim();
        //性别
        String sex = request.getParameter("sex").trim();
        //头像
        String pic = request.getParameter("pic").trim();
        //生日
        String birth = request.getParameter("birth").trim();
        //地区
        String location = request.getParameter("location").trim();
        //简介
        String introduction = request.getParameter("introduction").trim();
        //生日 转换为Date格式
        DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate = new Date();
        try {
            birthDate = dateformat.parse(birth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //保存到歌手的对象中
        Singer singer = new Singer();
        singer.setName(name);
        singer.setSex(new Byte(sex));
        singer.setPic(pic);
        singer.setBirth(birthDate);
        singer.setLocation(location);
        singer.setIntroduction(introduction);
        boolean flag = singerService.insert(singer);
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
     * 修改歌手
     */
    @RequestMapping( "/update")
    @PostMapping
    public Object updateSinger(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        String id = request.getParameter("id").trim();          //主键
        String name = request.getParameter("name").trim();      //姓名
        String sex = request.getParameter("sex").trim();        //性别
        String birth = request.getParameter("birth").trim();    //生日
        String location = request.getParameter("location").trim();//地区
        String introduction = request.getParameter("introduction").trim();//简介
        //把生日转换成Date格式
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate = new Date();
        try {
            birthDate = dateFormat.parse(birth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //保存到歌手的对象中
        Singer singer = new Singer();
        singer.setId(Integer.parseInt(id));
        singer.setName(name);
        singer.setSex(new Byte(sex));
        singer.setBirth(birthDate);
        singer.setLocation(location);
        singer.setIntroduction(introduction);
        boolean flag = singerService.update(singer);
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
     * 删除歌手
     */
    @RequestMapping("/delete")
    @GetMapping
    public Object deleteSinger(HttpServletRequest request){
        String id = request.getParameter("id").trim();          //主键
        boolean flag = singerService.delete(Integer.parseInt(id));
        return flag;
    }
    /**
     * 根据主键查询整个对象
     */
    @RequestMapping("/selectByPrimaryKey")
    @GetMapping
    public Object selectByPrimaryKey(HttpServletRequest request){
        String id = request.getParameter("id").trim();          //主键
        return singerService.selectByPrimaryKey(Integer.parseInt(id));
    }
    /**
     * 查询全部歌手
     */
    @RequestMapping("/allSinger")
    @GetMapping
    public Object allSinger(HttpServletRequest request){
        return singerService.allSinger();
    }
    /**
     * 根据歌手名字模糊查询列表
     */
    @RequestMapping( "/singerOfName")
    @GetMapping
    public Object singerOfName(HttpServletRequest request){
        String name = request.getParameter("name").trim();          //歌手名字
        return singerService.singerOfName("%"+name+"%");
    }
    /**
     * 根据性别查询
     */
    @RequestMapping("/singerOfSex")
    @GetMapping
    public Object singerOfSex(HttpServletRequest request){
        String sex = request.getParameter("sex").trim();          //性别
        return singerService.singerOfSex(Integer.parseInt(sex));
    }

    /**
     * 更新歌手图片
     */
    @RequestMapping("/updateSingerPic")
    @PostMapping
    public Object updateSingerPic(@RequestParam("file") MultipartFile avatorFile, @RequestParam("id")int id){
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
                +System.getProperty("file.separator")+"singerPic";
        //如果文件路径不存在，新增该路径
        File file1 = new File(filePath);
        if(!file1.exists()){
            file1.mkdir();
        }
        //实际的文件地址
        File dest = new File(filePath+System.getProperty("file.separator")+fileName);
        //存储到数据库里的相对文件地址
        String storeAvatorPath = "/img/singerPic/"+fileName;
        try {
            avatorFile.transferTo(dest);
            Singer singer = new Singer();
            singer.setId(id);
            singer.setPic(storeAvatorPath);
            boolean flag = singerService.update(singer);
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
