<template>
  <div class="address">
    <van-address-edit
      :area-list="areaList"
      show-postal
      show-delete
      show-set-default
      show-search-result
      :search-result="searchResult"
      :area-columns-placeholder="['请选择', '请选择', '请选择']"
      @save="onSave"
      @delete="onDelete"
      @change-detail="onChangeDetail"
    />
  </div>
</template>

<script>
import { Toast } from 'vant'
import areaList from '../assets/areaList.js';

export default {
  data() {
    return {
      areaList,
      searchResult: []
    }
  },
  created(){
    // this.getAreaLiat();
  },
  methods: {
    getAreaLiat(){
      this.axios.get('/static/area-list.json')
        .then((response) => {
          console.log(response)
          this.areaList = response;
        })
    },
    onSave() {
      Toast('save');
    },
    onDelete() {
      Toast('delete');
    },
    onChangeDetail(val) {
      if (val) {
        this.searchResult = [{
          name: '黄龙万科中心',
          address: '杭州市西湖区'
        }];
      } else {
        this.searchResult = [];
      }
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">

</style>
