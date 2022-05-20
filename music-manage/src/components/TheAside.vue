<template>
    <div class="sidebar">
        <el-menu
            class="sidebar-el-menu"
            :default-active="onRoutes"
            :collapse="collapse"
            background-color="#242526"
            text-color="#B0B3B2"
            active-text-color="#ffffff"
            unique-opened
            router
         >
            <template v-for="item in items">
                <template>
                    <el-menu-item :index="item.index" :key="item.index">
                        <i :class="item.icon"></i>
                        <span slot="title">{{item.title}}</span>
                    </el-menu-item>
                </template>
            </template>
            
        </el-menu>
    </div>
</template>

<script>
import bus from "../assets/js/bus"
export default {
    data(){
        return{
            collapse: false,
            items:[
                {
                    icon: 'el-icon-s-home',
                    index: 'Info',
                    title: '系统首页'
                },
                {
                    icon: 'el-icon-user',
                    index: 'Consumer',
                    title: '用户管理'
                },
                {
                    icon: 'el-icon-headset',
                    index: 'Singer',
                    title: '歌手管理'
                },
                {
                    icon: 'el-icon-document',
                    index: 'SongList',
                    title: '歌单管理'
                },
                
            ]
        }
    },
    computed:{
        onRoutes(){
            return this.$route.path.replace('/','');
        }
    },
    created(){
        //通过Bus进行组件间的通信，来折叠侧边栏
        bus.$on('collapse',msg =>{
            this.collapse = msg
        })
    }
}
</script>

<style scoped>
.sidebar {
    display: block;
    position: absolute;
    left: 0;
    top: 70px;
    bottom: 0;
    background-color: #334256;
    overflow-y: scroll;
}

.sidebar::-webkit-scrollbar{
    width: 0;
}

.sidebar-el-menu:not(.el-menu--collapse){
    width: 150px;
}

.sidebar >ul {
    height: 100%;
}
</style>