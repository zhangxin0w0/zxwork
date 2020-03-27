<template>
  <div id="app">
    <router-view/>
    <Hometag></Hometag>
  </div>
</template>

<script>
import Hometag from '@/components/Hometag.vue';

export default {
  name: 'app',
  created(){
    // 查询登录状态下用户购物车商品数量
    this.getCartSize();
  },
  data(){
    return{
    }
  },
  components: {
    Hometag,
  },
  methods:{
    getCartSize(){
      this.axios.get('/rlg/portal/cart/get_cart_product_count.do')
        .then((response) => {
          if(response.data.status == 200){
            this.$store.commit('getSize', response.data.data)
          }else{
            this.$store.commit('getSize', 0)
          }
        })
    }
  }
};
</script>

<style lang="scss">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

</style>
