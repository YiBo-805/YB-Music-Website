<template>
    <div class="header">
        <!-- 折叠图片 -->
        <div class="collapse-btn" @click="collapseChange">
            <i class="el-icon-s-unfold"></i>
        </div>
        <div class="logo">音乐网站后台管理</div>
        <div class="header-right">
            <div class="btn-fullscreen" @click="handleFullScreen">
                <el-tooltip :content="fullscreen?`取消全屏`:`全屏`" placement="bottom">
                    <i class="el-icon-rank"></i>
                </el-tooltip>
            </div>
            <div class="user-avator">
                <img src="../assets/img/user.png"/>
            </div>
            <el-dropdown class="user-name" trigger="click" @command="handleCommand">
                <span class="el-dropdown-link">
                    {{userName}}                    
                    <i class="el-icon-caret-bottom"></i>
                </span>
                <el-dropdown-menu slot="dropdown">
                    <el-dropdown-item command="logout">退出登录</el-dropdown-item>
                </el-dropdown-menu>
            </el-dropdown>
        </div>
    </div>
</template>

<script>
import bus from "../assets/js/bus";
export default {
    data(){
        return{
            collapse: false,
            fullscreen:false
        }
    },
    computed:{
        userName(){
            return localStorage.getItem('userName');
        }
    },
    methods:{
        //侧边栏折叠
        collapseChange(){
            this.collapse = !this.collapse;
            bus.$emit('collapse',this.collapse);
        },
        //全屏事件
        handleFullScreen(){
            if(this.fullscreen){
                if(document.exitFullscreen){
                   document.exitFullscreen();
                }else if(document.webkitCancelFullScreen){      //safari 、Chrome
                    document.webkitCancelFullScreen();
                }else if (document.mozCancelFullScreen){        //firefox
                    document.mozCancelFullScreen();
                }else if(document.msExitFullScreen){            //ie
                    document.msExitFullScreen();
                }               
            }else{
                let element = document.documentElement;
                if(element.requestFullscreen){
                    element.requestFullscreen();
                }else if(element.webkitRequestFullScreen){      //safari 、Chrome
                    element.webkitRequestFullScreen();
                }else if(element.mozRequestFullScreen){         //firefox
                    element.mozRequestFullScreen();
                }else if (element.msRequestFullScreen){         //ie
                    element.msRequestFullScreen();
                }
            }
            this.fullscreen = !this.fullscreen;
        },
       
        // 用户名下拉菜单选择事件
        handleCommand(command){
            if(command == "logout"){
                localStorage.removeItem('userName');
                this.$router.push("/");
            }
        }
    }
}
</script>

<style scoped>
.header{
    position: absolute;
    z-index: 100;
    background-color: #1A1B1C;
    box-sizing: border-box;
    width: 100%;
    height: 70px;
    font-size: 22px;
    color: #B0B3B2;
    box-shadow: 0px 0px 8px 2px rgba(0, 0, 0, 0.3);
}

.collapse-btn{
    float: left;
    padding: 0 21px;
    cursor: pointer;
    line-height: 70px;
}

.header .logo{
    float: left;
    width: 250px;
    font-family: 26px;
    line-height: 70px;
}

.header-right{
    float: right;
    padding-right: 50px;
    display:flex;
    height: 70px;
    align-items: center;
}

.btn-fullscreen{
    transform: rotate(45deg);
    margin-right: 5px;
    font-size: 24px;
}

.user-avator{
    margin-left: 15px;
}

.user-avator img{
    display: block;
    width: 40px;
    height: 40px;
    border-radius: 50%;
}

.user-name{
    margin-left: 10px;
}

.el-dropdown-link{
    color: #B0B3B2;
    cursor: pointer;
}

.el-dropdown-menu__item {
  text-align: center;
}
</style>