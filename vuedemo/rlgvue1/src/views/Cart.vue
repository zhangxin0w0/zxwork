<template>
  <div class="cart">
    <div class="home-top"></div>
      <Homenav :bol="blo" :bol2="blo2" :title="title" />
      <!-- 登录状态 -->
      <div  class="tl">
        <van-checkbox-group class="card-goods" v-model="checkedGoods">
          <van-checkbox
          class="card-goods__item"
          v-for="item in goods"
          :key="item.id"
          :name="item.id"
          >
          <van-card
          :title="item.title"
          :desc="item.desc"
          :num="item.num"
          :price="formatPrice(item.price)"
          :thumb="item.thumb"
          />
          </van-checkbox>
        </van-checkbox-group>
        <van-submit-bar
        :price="totalPrice"
        :disabled="!checkedGoods.length"
        :button-text="submitBarText"
        @submit="onSubmit"
        >
        <van-checkbox v-model="checked" @click="toChecked">全选</van-checkbox>
        </van-submit-bar>
      </div>
      <!-- 未登录状态 -->
      <div class="clogin" >
        <van-button round size="large" type="primary" to="/login">请登录</van-button>
      </div>
    <div class="home-bot"></div>
  </div>
</template>

<script>
import Homenav from '@/components/Homenav.vue';

export default {
  name: 'cart',
  data(){
    return{
      blo:true,
      blo2:false,
      checked:true,
      title:'购物车',
      checkedGoods: ['1', '2', '3'],
      goods: [{
        id: '1',
        title: '进口香蕉',
        desc: '约250g，2根',
        price: 200,
        num: 1,
        thumb: 'https://img.yzcdn.cn/public_files/2017/10/24/2f9a36046449dafb8608e99990b3c205.jpeg'
        }, {
        id: '2',
        title: '陕西蜜梨',
        desc: '约600g',
        price: 690,
        num: 1,
        thumb: 'https://img.yzcdn.cn/public_files/2017/10/24/f6aabd6ac5521195e01e8e89ee9fc63f.jpeg'
        }, {
        id: '3',
        title: '美国伽力果',
        desc: '约680g/3个',
        price: 2680,
        num: 1,
        thumb: 'https://img.yzcdn.cn/public_files/2017/10/24/320454216bbe9e25c7651e1fa51b31fd.jpeg'
      }]
    }
  },
  props: {
    msg: String,
  },
  components:{
    Homenav
  },
  computed: {
    submitBarText() {
      const count = this.checkedGoods.length;
      return '结算' + (count ? `(${count})` : '');
    },
    totalPrice() {
      return this.goods.reduce((total, item) => total + (this.checkedGoods.indexOf(item.id) !== -1 ? item.price : 0), 0);
    },
    toLogin(){
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
  },
  methods: {
    formatPrice(price) {
      return (price / 100).toFixed(2);
    },
    onSubmit() {
      this.$router.push("/pay");
    },
    toChecked(){
      if(this.checked === false){
        for(var i = 0;i<this.goods.length;i++){
          this.checkedGoods.push(this.goods[i].id);
        };
        this.checked = true;
        console.log(this.checkedGoods);
      }else{
        this.checkedGoods=[];
        this.checked = false;
      }
    }
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
  .home-top{
    height: 2.875rem;
  }
  .home-bot{
    height: 3.125rem;
  }
  .clogin{
    height: 18.75rem;
    display: flex;
    align-items: center;
  }
  .tl .van-submit-bar{
    bottom: 3.75rem;
  }
</style>
