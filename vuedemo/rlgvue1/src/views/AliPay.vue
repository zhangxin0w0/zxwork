<template>
  <div class="alipay">
    <van-image
      width="100"
      height="100"
      :src="payimg"
    />
  </div>
</template>

<script>
export default {
  name: 'alipay',
  created() {
    //组件加载就启动定时器
    this.timer = setInterval(this.getStatus,2000);
  },
  data(){
    return{
      payimg:'/img/qr-1544404043826.png',
      bol:false,
      timer:''
    }
  },
  watch:{
    //监听器监听bol变化，为true时清空定时器，停止发送请求
    bol(){
      clearInterval(this.timer)
    }
  },
  methods:{
    //发送请求查询订单状态
    getStatus(){
      let data={"orderNo":1544404043826}
      var params = new URLSearchParams();
      params.append('orderNo', 1544404043826);

      this.axios.post('/rlg/portal/ali/query_order_pay_status.do',params)
        .then((response) => {
          //返回值赋值给bol,引起bol变化
          this.bol = response.data.data;
          if(response.data.data){
              this.$toast("支付成功");
          }

        })
        .catch((error) => {
          console.log(error);
        });
    }
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">

</style>
