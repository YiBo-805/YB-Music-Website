<template>
    <div class="search-song-Lists">
       <content-list :contentList="albumDatas"></content-list>
    </div>
</template>
<script>
import ContentList from '../ContentList';
import {getSongListOfLikeTitle} from '../../api/index';
import {mixin} from "../../mixins";

export default {
    name: 'search-song-lists',
    mixins: [mixin],
    components: {
        ContentList
    },
    data(){
        return{
            albumDatas: []
        }
    },
    mounted(){
        this.getSearchList();
    },
    methods:{
        getSearchList(){
            if (!this.$route.query.keywords) return
          getSongListOfLikeTitle(this.$route.query.keywords)
        .then(res => {
          if (!res.length) {
            this.notify('暂无该歌曲内容', 'warning')
          } else {
            this.albumDatas = res
          }
        })
        }
    }
}
</script>

<style lang="scss" scoped>
@import '../../assets/css/search-song-lists.scss';
</style>