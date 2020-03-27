<template>
  <div class="gd">
    <div class="home-top"></div>
      <van-nav-bar
        title="商品详情"
        fixed
        @click-left="onClickLeft"
        @click-right="onClickRight"
      >
        <van-icon name="arrow-left" color="black"  slot="left"/>
        <van-icon name="ellipsis" color="black"  slot="right"/>
      </van-nav-bar>

      <van-swipe class="goods-swipe" :autoplay="3000">
        <van-swipe-item v-for="(thumb,key) in gimges" :key="key">
        <img :src="thumb" @click="getImg">
        </van-swipe-item>
      </van-swipe>
      <van-cell-group>
        <van-cell>
          <div class="goods-title">{{ goods.subtitle }}</div>
          <div class="goods-price">{{ formatPrice(goods.price) }}</div>
        </van-cell>
        <van-cell class="goods-express">
          <van-col span="10">运费：0</van-col>
          <van-col span="14">剩余：{{ goods.stock }}</van-col>
        </van-cell>
        <van-cell :value="goods.detail" />
      </van-cell-group>
      <van-goods-action>
        <van-goods-action-icon icon="chat-o" @click="sorry">
        客服
        </van-goods-action-icon>
        <van-goods-action-icon icon="cart-o" :info="cartSize" @click="onClickCart">
        购物车
        </van-goods-action-icon>
        <van-goods-action-button type="warning" @click="sorry">
        加入购物车
        </van-goods-action-button>
        <van-goods-action-button type="danger" to="/cart">
        立即购买
        </van-goods-action-button>
      </van-goods-action>
    <div class="home-bot"></div>
  </div>
</template>

<script>
import { ImagePreview } from 'vant';

export default {
  name: 'gooddetail',
  created() {
    //根据商品ID查询商品数据
    this.getProduct();
  },
  data() {
    return {
      gimges:[
        'https://img.yzcdn.cn/public_files/2017/10/24/e5a5a02309a41f9f5def56684808d9ae.jpeg',
        'https://img.yzcdn.cn/public_files/2017/10/24/1791ba14088f9c2be8c610d0a6cc0f93.jpeg'
      ],
      goods: ''
    };
  },
  computed:{
    cartSize(){
      return this.$store.state.cartSize;
    },
  },
  methods: {
    getImg(){
      ImagePreview({
        images:this.gimges,
        startPosition: 1,
        closeable: true
      });
    },
    getProduct(){
      var pid = this.$route.query.pid;
      var params = new URLSearchParams();
      params.append('productId', pid);

      this.axios.post('/rlg/portal/product/detail.do',params)
        .then((response) => {
          this.goods = response.data.data
        })
        .catch((error) => {
          console.log(error);
        });
    },
    onClickLeft() {
      this.$router.go(-1)
    },
    onClickRight() {

    },
    formatPrice() {
      // 这里会有一个错误，但不影响程序运行
      return '¥' + this.goods.price ;
    },
    onClickCart() {
      this.$router.push('/cart');
    },
    sorry() {
      this.$toast('客服正忙~');
    }
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="less">
 .home-top{
    height: 2.875rem;
  }
  .home-bot{
    height: 3.125rem;
  }
  .gd .van-goods-action{
    bottom: 3.75rem;
  }
  .goods {
  padding-bottom: 50px;
  &-swipe {
  img {
  width: 100%;
  display: block;
  }
  }
  &-title {
  font-size: 16px;
  }
  &-price {
  color: #f44;
  }
  &-express {
  color: #999;
  font-size: 12px;
  padding: 5px 15px;
  }
  &-cell-group {
  margin: 15px 0;
  .van-cell__value {
  color: #999;
  }
  }
  &-tag {
  margin-left: 5px;
  }
  }
</style>
