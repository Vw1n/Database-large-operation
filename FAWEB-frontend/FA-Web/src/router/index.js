import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/team',
      name: 'team',
      component: () => import('../views/Team.vue')
    },
    {
      path: '/match',
      name: 'match',
      component: () => import('../views/Match.vue')
    },
    {
      path: '/data',
      name: 'data',
      component: () => import('../views/Data.vue')
    },
    {
      path: '/detail',
      name: 'detail',
      component: () => import('../views/Detail.vue')
    }
  ]
})

export default router
