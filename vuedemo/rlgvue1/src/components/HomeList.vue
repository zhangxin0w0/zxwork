<template>
  <div class="hl">
    <van-list
      v-model="loading"
      :finished="finished"
      finished-text="我是有底线的>_>"
      @load="onLoad"
    >
      <van-cell v-for="(item,key) in list" :key="key">
        <van-card
          :num="item.stock"
          :price="item.price"
          origin-price="99.00"
          :desc="item.detail"
          :title="item.name"
          tag="热卖"
          thumb="https://img.yzcdn.cn/vant/ipad.jpeg"
          slot="default"
        >
          <div slot="tags">
            <van-tag plain type="danger">包邮</van-tag>
            <van-tag plain type="danger">7天无理由退换</van-tag>
          </div>
          <div slot="footer">
            <van-button
            round
            color="linear-gradient(to right,#ffd01e,#ff8917)"
            size="small"
            @click="onClickLeftButton(item.id)">加入购物车</van-button>
            <van-button
            round
            color="linear-gradient(to right,#ff6034,#ee0a24)"
            size="small"
            @click="onClickRightButton(item.id)">立即购买</van-button>
          </div>
        </van-card>
        <!-- 我想装一下，稍后研究 -->
        <!-- <transition name="van-slide-up">
          <div v-show="true">Slide Up</div>
        </transition> -->

      </van-cell>

    </van-list>
  </div>
</template>

<script>
export default {
  data() {
    return {
      list: [],
      loading: false,
      finished: false
    };
  },
  methods: {
    onLoad() {
      // 异步更新数据
      var params = new URLSearchParams();
      params.append('type', 'isNew');

      this.axios.post('/rlg/portal/product/showproduct.do',params)
        .then((response) => {
          var plist = response.data.data;
          for(var i = 0;i<plist.length;i++){
            console.log(plist[i])
            this.list.push(plist[i]);
          }
        })
        .catch((error) => {
          console.log(error);
        });
    },
    onClickLeftButton(pid) {
      var params = new URLSearchParams();
      params.append('productId', pid);
      
      this.axios.post('/rlg/portal/cart/add.do',params)
        .then((response) => {
          this.$toast.success('加入成功');
          this.getCartSize();
        })
        .catch((error) => {
          console.log(error);
        });
    },
    onClickRightButton(pid) {
      // 把当前商品的商品ID传参过去
      this.$router.push({
        path:'/gooddetail',
        query:{
          pid:pid
        }
      })
    },
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
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">

</style>
