<template>
  <div class="ht">
    <van-tabbar route active-color="#F4381F">
      <van-tabbar-item replace to="/" icon="home-o">
        主页
      </van-tabbar-item>
      <van-tabbar-item replace to="/category" icon="apps-o">
        分类
      </van-tabbar-item>
      <van-tabbar-item replace to="/cart" :info="cartSize" icon="shopping-cart-o">
        购物车
      </van-tabbar-item>
      <!-- 没有登录时，进入登录页面 -->
      <van-tabbar-item replace v-if="bol" to="/own" icon="user-circle-o">
        个人中心
      </van-tabbar-item>
      <!-- 登录状态，进入个人中心 -->
      <van-tabbar-item replace v-else to="/login" icon="user-circle-o">
        未登录
      </van-tabbar-item>
    </van-tabbar>
  </div>
</template>

<script>
export default {
  name: 'Hometag',
  data(){
    return {
      active: 0,
    }
  },
  computed:{
    cartSize(){
      return this.$store.state.cartSize;
    },
    // 判断用户登录状态
    bol(){
      if(this.$store.state.user === ''){
        if(sessionStorage.getItem("key") === null){
          return false;
        }else{
          return true;
        }
      }else{
        return true;
      }
    }
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">

</style>
