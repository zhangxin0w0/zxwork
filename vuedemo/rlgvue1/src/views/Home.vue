<template>
  <div class="home">
    <div class="home-top"></div>
    <Homenav :bol="blo" :bol2="blo2" :left="left" :right="right" :title="title" :url="url"/>
    <RlgSwipe :images="images"></RlgSwipe>
    <HomeGrid :grids="grids" :num="num"></HomeGrid>
    <van-notice-bar :text="text" left-icon="volume-o" />
    <HomeList></HomeList>
    <div class="home-bot"></div>
  </div>
</template>

<script>
// @ is an alias to /src
import Homenav from '@/components/Homenav.vue';
import RlgSwipe from '@/components/RlgSwipe.vue';
import HomeGrid from '@/components/HomeGrid.vue';
import HomeList from '@/components/HomeList.vue';

export default {
  name: 'Home',
  data:function(){
    return{
      blo:false,
      blo2:true,
      left:'wap-nav',
      right:'登录',
      title:'seach',
      url:'/login',
      text:'是什么东西，吸引了无数人的关注？点击立即获取，免费大礼包！',
      num:5,
      images: [
        'https://img.yzcdn.cn/vant/apple-1.jpg',
        'https://img.yzcdn.cn/vant/apple-2.jpg',
      ],
      grids:[
        {icon:'photo-o',text:'标签1',to:''},
        {icon:'photo-o',text:'标签2',to:''},
        {icon:'photo-o',text:'标签3',to:''},
        {icon:'photo-o',text:'标签4',to:''},
        {icon:'photo-o',text:'标签5',to:''},
        {icon:'photo-o',text:'标签1',to:''},
        {icon:'photo-o',text:'标签2',to:''},
        {icon:'photo-o',text:'标签3',to:''},
        {icon:'photo-o',text:'标签4',to:''},
        {icon:'photo-o',text:'标签5',to:''}
      ]
    }
  },
  components: {
    Homenav,
    RlgSwipe,
    HomeGrid,
    HomeList
  },
};
</script>

<style scoped lang="scss">
  .home-top{
    height: 2.875rem;
  }
  .home-bot{
    height: 3.125rem;
  }
</style>
