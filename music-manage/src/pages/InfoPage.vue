<template>
    <div>
        <el-row :gutter="20" class="mgb20">
            <el-col :span="6">
                <el-card>
                    <div class="grid-content">
                        <div class="grid-cont-center">
                            <div class="grid-num">{{consumerCount}}</div>
                            <div>用户总数</div>
                        </div>
                    </div>
                </el-card>
            </el-col>
            <el-col :span="6">
                <el-card>
                    <div class="grid-content">
                        <div class="grid-cont-center">
                            <div class="grid-num">{{songCount}}</div>
                            <div>歌曲总数</div>
                        </div>
                    </div>
                </el-card>
            </el-col>
            <el-col :span="6">
                <el-card>
                    <div class="grid-content">
                        <div class="grid-cont-center">
                            <div class="grid-num">{{singerCount}}</div>
                            <div>歌手数量</div>
                        </div>
                    </div>
                </el-card>
            </el-col>
            <el-col :span="6">
                <el-card>
                    <div class="grid-content">
                        <div class="grid-cont-center">
                            <div class="grid-num">{{songListCount}}</div>
                            <div>歌单数量</div>
                        </div>
                    </div>
                </el-card>
            </el-col>
        </el-row>
        <el-row :gutter="20" class="mgb20">
            <el-col :span="12">
                <h3 class="mgb20">用户性别比例</h3>
                <div class="cav-info" style="background-color:white">
                    <ve-pie :data="consumerSex" :theme="options"></ve-pie>
                </div>
            </el-col>
            <el-col :span="12">
                <h3 class="mgb20">歌曲类型分布</h3>
                <div class="cav-info" style="background-color:white">
                    <ve-histogram :data="songStyle" :theme="options3"></ve-histogram>
                </div>
            </el-col>
        </el-row>
        <el-row :gutter="20" class="mgb20">
            <el-col :span="12">
                <h3 class="mgb20">歌手类型比例</h3>
                <div class="cav-info" style="background-color:white">
                    <ve-pie :data="singerSex" :theme="options2"></ve-pie>
                </div>
            </el-col>
            <el-col :span="12">
                <h3 class="mgb20">歌手国籍分布</h3>
                <div class="cav-info" style="background-color:white">
                    <ve-line :data="country" :theme="options1"></ve-line>
                </div>
            </el-col>
        </el-row>
    </div>
</template>
<script>
import {getAllConsumer,allSong,getAllSinger,getAllSongList} from '../api/index';
export default {
    data(){
        return {
            consumerCount: 0,       //用户总数
            songCount: 0,           //歌曲总数
            singerCount: 0,         //歌手数量
            songListCount: 0,        //歌单数量
            consumer: [],            //所有用户
            consumerSex:{           //按性别分类的用户数
                columns: ['性别','总数'],
                rows: [
                    {'性别': '男','总数': 0},
                    {'性别': '女','总数': 0}
                ]
            },
            options: {
                color: ['#8EDDF9','#ffbfbf']
            },
            options2: {
                color: ['#779AD9', '#6CCDDA','#D9AF57', '#7B68EE']
            },
            options1: {
              color: ['#FF9F00'],
              tooltip: {
                trigger: 'axis',
                axisPointer: { // 坐标轴指示器，坐标轴触发有效
                  type: 'line' // 默认为直线，可选为：'line' | 'shadow'
                }
              },
              grid: {
                left: '3%',
                right: '4%',
                bottom: '3%',
                containLabel: true
              }
            },
            options3: {
              color: ['#8EDE99'],
              tooltip: {
                trigger: 'axis',
                axisPointer: { // 坐标轴指示器，坐标轴触发有效
                  type: 'shadow' // 默认为直线，可选为：'line' | 'shadow'
                }
              },
              grid: {
                left: '3%',
                right: '4%',
                bottom: '3%',
                containLabel: true
              }
            },
            songStyle:{           //按歌单风格分类
                columns: ['风格','歌曲总数'],
                rows: [
                    {'风格': '华语','歌曲总数': 0},  
                    {'风格': '欧美','歌曲总数': 0},
                    {'风格': '日韩','歌曲总数': 0},
                    {'风格': '粤语','歌曲总数': 0},
                    {'风格': '流行','歌曲总数': 0},
                    {'风格': '轻音乐','歌曲总数': 0},
                    {'风格': '说唱','歌曲总数': 0},
                    {'风格': '乐器','歌曲总数': 0}
                ]
            },
            singerSex:{           //按性别分类的歌手数
                columns: ['性别','总数'],
                rows: [                    
                    {'性别': '女','总数': 0},
                    {'性别': '男','总数': 0},
                    {'性别': '组合','总数': 0},
                    {'性别': '不明','总数': 0}
                ]
            },
            country:{
                columns: ['国籍','歌手总数'],
                rows: [
                    {'国籍': '中国','歌手总数': 0},
                    {'国籍': '韩国','歌手总数': 0},
                    {'国籍': '日本','歌手总数': 0},
                    {'国籍': '美国','歌手总数': 0},
                    {'国籍': '新加坡','歌手总数': 0},
                    {'国籍': '加拿大','歌手总数': 0},
                    {'国籍': '意大利','歌手总数': 0},
                    {'国籍': '德国','歌手总数': 0},
                    {'国籍': '澳大利亚','歌手总数': 0},
                    {'国籍': '英国','歌手总数': 0}                  
                ]
            }
        }
    },
    created() {

    },
    mounted() {
        this.getConsumer();
        this.getSong();
        this.getSinger();
        this.getSongList();
    },
    methods: {
        getConsumer() {                     //用户总数
            getAllConsumer().then(res => {
                this.consumer = res;
                this.consumerCount = res.length;
                this.consumerSex.rows[0]['总数'] = this.setSex(1,this.consumer);
                this.consumerSex.rows[1]['总数'] = this.setSex(0,this.consumer);
            })
        },  
        setSex(sex,val) {              //根据性别获取用户数
            let count = 0;
            for(let item of val){
                if(sex == item.sex){
                    count++;
                }
            }
            return count;
        },
        getSong() {                      //歌曲总数
            allSong().then(res => {
                this.songCount = res.length;
            })
        },
        getSinger() {                      //歌手数量
            getAllSinger().then(res => {
                this.singerCount = res.length;
                this.singerSex.rows[0]['总数'] = this.setSex(0,res);
                this.singerSex.rows[1]['总数'] = this.setSex(1,res);
                this.singerSex.rows[2]['总数'] = this.setSex(2,res);
                this.singerSex.rows[3]['总数'] = this.setSex(3,res);
                for(let item of res){
                    this.getByCountry(item.location);
                }
            }).catch(err => {
              console.log(err)
            })
        },

        getSongList() {                    //歌单数量
            getAllSongList().then(res => {
                this.songListCount = res.length;
                for(let item of res){
                    this.getByStyle(item.style);
                }
            })
        },  
        getByStyle(style) {              //根据歌单风格获取数量
            for(let item of this.songStyle.rows){
                if(style.includes(item['风格'])){
                    item['歌曲总数']++;
                }
            }
        },
        getByCountry(location) {              //根据国籍获取数量
            for(let item of this.country.rows){
                if(location.includes(item['国籍'])){
                    item['歌手总数']++;
                }
            }
        }
    }
}

</script>

<style scoped>
.grid-content {
    display: flex;
    align-items: center;
    height: 50px;
}

.grid-cont-center {
    flex: 1;
    text-align: center;
    font-size: 14px;
    color: #999;
}

.grid-num {
    font-size: 30px;
    font-weight: bold;
}

 .cav-info {
    border-radius: 6px;
    overflow: hidden;
  }
</style>