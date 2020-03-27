<template>
  <div class="category">
    <div class="home-top"></div>
    <Homenav :bol="blo" :bol2="blo2" :title="title"></Homenav>
    <van-search
      v-model="value"
      shape="round"
      background="#4fc08d"
      placeholder="请输入搜索关键词"
    />
    <van-row>
      <van-col span="4">
        <van-sidebar v-model="activeKey">
          <van-sidebar-item :title="c.cname" v-for="(c,key) in clist" :key="key" />
        </van-sidebar>
      </van-col>
      <van-col span="20">
        <HomeGrid :grids="grids" :num="num"></HomeGrid>
      </van-col>
    </van-row>
    <div class="home-bot"></div>
  </div>
</template>

<script>
import Homenav from '@/components/Homenav.vue';
import HomeGrid from '@/components/HomeGrid.vue';

export default {
  name: 'category',
  data(){
    return{
      activeKey: 0,
      blo:true,
      blo2:false,
      title:'商品分类',
      pid:0,
      clist:'',
      value:'',
      num:3,
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
  created() {
    var params = new URLSearchParams();
    params.append('pid', this.pid);

    this.axios.post('/rlg/portal/product/basecategory.do',params)
      .then((response) => {
        this.clist = response.data.data
      })
      .catch((error) => {
        console.log(error);
      });
  },
  components:{
    Homenav,
    HomeGrid
  },
  methods:{
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
</style>
