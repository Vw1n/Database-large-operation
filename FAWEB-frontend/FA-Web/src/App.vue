<script setup>
import { RouterLink, RouterView } from 'vue-router'
import HelloWorld from './components/HelloWorld.vue'
</script>

<template>
  <div class="globalheader">
    <div class="logo">
      SZTUFA
    </div>
    <div class="tabber">
      <nav>
        <RouterLink to="/data">
          <div>数据</div>
        </RouterLink>
        <RouterLink to="/match">
          <div>比赛</div>
        </RouterLink>
        <RouterLink to="/team">
          <div>球队</div>
        </RouterLink>
        <RouterLink to="/">
          <div>主页</div>
        </RouterLink>
      </nav>
    </div>
  </div>
  <RouterView />
</template>

<style scoped>
.globalheader {
  width: 100%;
  height: 72px;
  display: flex;
  background-color: #4D628E;
}

.logo {
  width: 50%;
  text-align: center;
  font-weight: bold;
  font-size: 40px;
  height: 72px;
  color: #fff;
  padding: 13px;
}

.tabber {
  display: flex;
  height: 72px;
  width: 50%;
  padding: 25px;
}

nav {
  display: flex;
  justify-content: space-around;
}

a {
  font-weight: bold;
  font-size: larger;
  display: flex;
  width: 100px;
  height: 72px;
  text-decoration: none;
  /* 去除默认的下划线 */
  outline: none;
  /* 去除旧版浏览器的点击后的外虚线框 */
  color: #fff;
  /* 去除默认的颜色和点击后变化的颜色 */
}

</style>
