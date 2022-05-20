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

![image](https://user-images.githubusercontent.com/79205996/169454927-c9914e34-1424-4407-8b7f-5ebd47b4e9c0.png)

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

- 音乐播放
- MV播放
- 用户登录注册
- 用户个人信息设置（包括修改头像）
- 歌曲、歌单搜索
- 歌单打分
- 歌单、歌曲评论
- 歌词同步显示
- 音乐收藏、下载、拖动控制、音量控制
- 后台对用户、歌曲、歌手、歌单信息的管理 

### 项目所用技术

#### 后端
SpringBoot + MyBatis

#### 前端
Vue + ElementUI + Axios

### 项目运行介绍

#### 1、下载项目到本地

```bash
git clone https://github.com/YiBo-805/YB-Music-Website.git
```

#### 2、下载网站中的资源：

去【链接: https://pan.baidu.com/s/1NcLK9G87Ei2DHMbE4bb7-A?pwd=tazh 提取码:  tazh 】下载网站依赖的部分歌曲及图片

注：不提供网站中所有的静态资源，以上是可参考的静态资源。

资源放置位置：

![image](https://user-images.githubusercontent.com/79205996/169477413-151d20fa-0460-4801-96f3-4d6eb9becc91.png)

![image](https://user-images.githubusercontent.com/79205996/169477495-d6ab2374-b245-4572-9a16-edaf733ef90e.png)

#### 3、项目环境搭建前工作：

1）创建数据库，将文件夹中的sql文件导入数据库中

2）修改用户名和密码  修改 music-web/music-server/src/main/resources/application.yaml文件中数据库的username 和 password

#### 4、后台环境搭建：

1）下载maven3.6.1 

【链接: https://pan.baidu.com/s/1Fjyrn-sNsYToPm4WLJH2Ng?pwd=zgx7 提取码:  zgx7 】

2）在idea中配置maven

#### 5、启动项目：

- **启动管理端**：使用idea打开 music-server 文件夹，在idea中运行下面命令启动服务器

```js
mvn spring-boot:run // 前提装了 maven
```

- **启动客户端**：使用VSCode打开 music-client 文件，运行下面命令

```
npm install // 安装依赖

npm run dev // 启动前台项目
```

- **启动管理端**：使用VSCode打开 music-manage 目录，运行下面命令

```
npm install // 安装依赖

npm run dev // 启动后台管理项目
```


