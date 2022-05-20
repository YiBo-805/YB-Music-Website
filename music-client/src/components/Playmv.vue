<template>
    <video controls autoplay >
	 <source :src="this.$store.state.configure.HOST+this.$route.params.mvurl" />
     您的浏览器不支持 HTML5 video 标签。
    </video>
</template>

import {mapGetters} from "vuex";
