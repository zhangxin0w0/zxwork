<template>
  <div class="login">
   <div class="home-top"></div>
   <Homenav :bol="blo" :right="right" :bol2="blo2" :title="title" :url="url"/>
   <van-form @submit="onSubmit">
     <van-field
       v-model="username"
       name="用户名"
       label="用户名"
       placeholder="用户名"
       :rules="[{ required: true, message: '请填写用户名' }]"
     />
     <van-field
       v-model="password"
       type="password"
       name="密码"
       label="密码"
       placeholder="密码"
       :rules="[{ required: true, message: '请填写密码' }]"
     />
     <div style="margin: 16px;">
       <van-button round block type="info" native-type="submit">
         登录
       </van-button>
     </div>
   </van-form>
   <div class="home-bot"></div>
  </div>
</template>

<script>
import Homenav from '@/components/Homenav.vue';

export default {
  data() {
    return {
      blo:true,
      blo2:true,
      right:'注册',
      title:'登录',
      url:'/about',
      username: '',
      password: '',
    };
  },
  components:{
    Homenav
  },
  methods: {
    onSubmit() {
      var params = new URLSearchParams();
      params.append('username', this.username);
      params.append('password', this.password);

      this.axios.post('/rlg/portal/user/login.do',params)
        .then((response) => {
          sessionStorage.setItem("key", response.data.data);

          this.$store.commit('getUser',response.data.data);
          this.getCartSize();
          this.$router.push("/");
        })
        .catch((error) => {
          console.log(error);
        });
    },
    getCartSize(){
      this.axios.get('/rlg/portal/cart/get_cart_product_count.do')
        .then((response) => {
          this.$store.commit('getSize', response.data.data)
        })
    }
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
