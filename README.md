# Vue + SpringBoot 音乐网站  前后端分离

## 简单介绍
开发环境：Vue2.x, VScode, idea, maven3.6.1

参考开源地址：https://github.com/Yin-Hongwei/music-website

在项目基础上增加了MV功能，修改了项目中的部分bug，仅供学习交流。

## 项目预览
### 前台预览
![image](https://user-images.githubusercontent.com/79205996/169451513-5ad7bdaa-62fd-4b62-91af-5bed1a316464.png)


**SpringBoot + MyBatis**

### 后台预览

**Vue +  ElementUI**



## 项目使用说明

1.  
系统前台访问地址：http://localhost:8081

系统后台访问地址：http://localhost:8080

账号和对应密码：
管理员： admin    1

![输入图片说明](ReadMeResource/1638780017(1).jpg)

用户：  root     123456

![输入图片说明](ReadMeResource/image.png)



#### 项目预览

![1638780576(1)](ReadMeResource/1638780576(1).jpg)

![image-20211206165137364](ReadMeResource/1638780681(1).jpg)

![image-20211206165154807](ReadMeResource/1638780706(1).jpg)

![image-20211206165215924](ReadMeResource/image-20211206165215924.png)

![1638780604(1)](ReadMeResource/1638780604(1).jpg)

![1638780624(1)](ReadMeResource/1638780637(1).jpg)

![1638780651(1)](ReadMeResource/1638780651(1).jpg)

## 项目功能

- 音乐播放
- MV播放
- 用户登录注册
- 用户信息编辑、头像修改
- 歌曲、歌单搜索
- 歌单打分
- 歌单、歌曲评论
- 歌单列表、歌手列表分页显示
- 歌词同步显示
- 音乐收藏、下载、拖动控制、音量控制
- 后台对用户、歌曲、歌手、歌单信息的管理

## 下载运行

------



### 1、下载项目到本地

```
https://gitee.com/juice999/music-web.git
```

### 2、下载静态资源

去【链接: https://pan.baidu.com/s/1Qv0ohAIPeTthPK_CDwpfWg 提取码: gwa4 】下载网站依赖的歌曲及图片

![1638781152(1)](ReadMeResource/1638781152(1).jpg)

创建数据库 将 `sql` 文件夹中的 `music.sql` 文件导入数据库。

### 3、启动项目

- **启动客户端**：进入 music-client 目录，运行下面命令

```
npm install // 安装依赖

npm run dev // 启动前台项目
```

- **启动管理端**：进入 music-manage 目录，运行下面命令

```
npm install // 安装依赖

npm run dev // 启动后台管理项目
```

- 启动后台

```
将music-serve导入idea
打开pom.xml下载相关依赖
在application.yaml中结合自己环境进行配置
```

