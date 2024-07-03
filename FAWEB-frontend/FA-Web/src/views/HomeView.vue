<template>
  <div class="swiper">
    <el-carousel :interval="4000" type="card" height="800px">
      <el-carousel-item v-for="item in  swiperList " :key="item">
        <img :src="item.url">
      </el-carousel-item>
    </el-carousel>
  </div>
</template>

<style scoped>
.swiper {
  margin-top: 40px;
}
img{
  height: 800px;
  width: auto;
}
</style>

<script>
import p1 from '../assets/1.jpg';
import p2 from '../assets/2.jpg';
import p3 from '../assets/3.jpg';
export default {
  data() {
    return {
      swiperList: [
        {
          id: 1,
          url: p1
        },
        {
          id: 2,
          url: p2
        },
        {
          id: 3,
          url: p3
        }
      ]
    }
  }
}
</script>