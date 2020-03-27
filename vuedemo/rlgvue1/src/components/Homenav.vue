<template>
  <div class="hn">
    <van-nav-bar
      :left-arrow="bol"
      fixed
      @click-left="onClickLeft"
      @click-right="onClickRight"
    >
    <!-- 左侧自定义 -->
     <van-icon :name="left" color="black" v-if="!bol" slot="left"/>

     <!-- 右侧自定义+路由链接 -->
     <router-link :to="url" v-if="bol2" slot="right">{{right}}</router-link>

     <!-- 标题自定义 -->
     <van-search
      class="hn-search"
      v-if="!bol"
      shape="round"
      :readonly="bol2"
      placeholder="请输入搜索关键词"
      @click="toSearch"
      slot="title"/>

     <span v-if="bol" slot="title">{{title}}</span>

    </van-nav-bar>
  </div>
</template>

<script>
import { Toast } from 'vant';

export default {
  name: 'Homenav',
  props: {
    // 是否显示搜索框，false为显示，true为不显示
    bol: Boolean,
    // 是否显示右侧功能键，true为显示，false为不显示
    bol2: Boolean,
    // 左侧功能键内容
    left:String,
    // 标题内容
    title:String,
    // 右侧内容
    right:String,
    //  右侧链接地址
    url:String
  },
  methods: {
    toSearch(){
      if(this.bol2){
        this.$router.push('/about')
      }
    },
    onClickLeft() {
      if(this.bol){
        this.$router.go(-1)
      }else{
        this.$router.push('/category')
      }
    },
    onClickRight() {
      if(this.right === '注册'){
        this.$router.push('/category')
      }
    }
  },

};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
  .hn-search{
    padding-top: 0.3125rem;
    padding-bottom: 0.3125rem;
  }
</style>
