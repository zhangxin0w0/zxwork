<template>
  <div class="hg">
    <van-grid :gutter="10" :column-num="num">
      <van-grid-item
        v-for="(value,key) in grids"
        :key="key"
        :icon="value.icon"
        :text="value.text"
      />
    </van-grid>
  </div>
</template>

<script>
export default {
  name: 'homegrid',
  props: {
    grids: Array,
    num:Number
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">

</style>
