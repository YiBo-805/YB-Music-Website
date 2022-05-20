# Vue + SpringBoot 音乐网站  前后端分离

## 简单介绍
开发环境：Vue2.x, VScode, idea, maven3.6.1

参考开源地址：https://github.com/Yin-Hongwei/music-website

在项目基础上增加了MV功能，修改了项目中的部分bug，仅供学习交流。

## 项目预览

### 前台预览

1.首页：

![image](https://user-images.githubusercontent.com/79205996/169451513-5ad7bdaa-62fd-4b62-91af-5bed1a316464.png)

2.歌单：

![image](https://user-images.githubusercontent.com/79205996/169451802-474d2038-7e08-4708-888a-aec9b97b3a6e.png)

![image](https://user-images.githubusercontent.com/79205996/169451923-dedde162-8536-4b56-b327-ba0ba8d8f03e.png)

3.歌手：

![image](https://user-images.githubusercontent.com/79205996/169451990-f784875c-3a93-4d03-8d38-756247482a52.png)

![image](https://user-images.githubusercontent.com/79205996/169452063-c73bad5d-c873-43f5-bbff-e36cfc83baf5.png)

4.歌词：

![image](https://user-images.githubusercontent.com/79205996/169452479-217937cc-21e6-437d-93a1-5abd9ff6cc80.png)

5.登录与注册：

![image](https://user-images.githubusercontent.com/79205996/169452131-5342c322-8ff2-4636-937c-43a08250cec2.png)

![image](https://user-images.githubusercontent.com/79205996/169452158-48c6b71e-cbd2-4005-b027-e22117b31c03.png)


### 后台预览

1.登录界面：

![Uploading image.png…]()

2.系统首页：

![image](https://user-images.githubusercontent.com/79205996/169452596-c614c021-797f-4cc1-a1f7-f2321f85a3e4.png)

3.用户管理：

![image](https://user-images.githubusercontent.com/79205996/169452659-44c26a72-6471-461d-81b2-230646bae1c4.png)

4.歌手管理：

![image](https://user-images.githubusercontent.com/79205996/169452714-6ff0905c-0533-44a6-b3ca-17c1cd52be4a.png)

5.歌单管理：

![image](https://user-images.githubusercontent.com/79205996/169452764-bfff9c73-a6ce-4c02-91a8-3bd07dc8033c.png)


## 项目说明

### 项目功能

1.  
系统前台访问地址：http://localhost:8081

系统后台访问地址：http://localhost:8080

账号和对应密码：
管理员： admin    1

![输入图片说明](ReadMeResource/1638780017(1).jpg)

用户：  root     123456

![输入图片说明](ReadMeResource/image.png)



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

