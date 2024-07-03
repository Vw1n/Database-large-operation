import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

/* Layout */
import Layout from '@/layout'

export const constantRoutes = [
  {
    path: '/login',
    component: () => import('@/views/login/index'),
    hidden: true
  },

  {
    path: '/404',
    component: () => import('@/views/404'),
    hidden: true
  },

  {
    path: '/',
    component: Layout,
    redirect: '/dashboard',
    children: [{
      path: 'dashboard',
      name: '首页',
      component: () => import('@/views/dashboard/index'),
      meta: { title: '首页', icon: 'dashboard' }
    }]
  },
  {
    path: '/example',
    component: Layout,
    redirect: '/example/table',
    name: 'Example',
    meta: { title: '数据管理', icon: 'el-icon-s-help' },
    children: [
      {
        path: 'event',
        name: 'Table',
        component: () => import('@/views/event/index'),
        meta: { title: '事件管理', icon: 'table' }
      },
      {
        path: 'match',
        name: 'Match',
        component: () => import('@/views/match/index'),
        meta: { title: '比赛管理', icon: 'table' }
      },
      {
        path: 'team',
        name: 'Team',
        component: () => import('@/views/team/index'),
        meta: { title: '球队管理', icon: 'table' }
      },
      {
        path: 'player',
        name: 'Player',
        component: () => import('@/views/player/index'),
        meta: { title: '球员管理', icon: 'table' }
      }
    ]
  },
  {
    path: 'external-link',
    component: Layout,
    children: [
      {
        path: '/',
        meta: { title: 'External Link', icon: 'link' }
      }
    ]
  },

  // 404 page must be placed at the end !!!
  { path: '*', redirect: '/404', hidden: true }
]

const createRouter = () => new Router({
  scrollBehavior: () => ({ y: 0 }),
  routes: constantRoutes
})

const router = createRouter()
export function resetRouter() {
  const newRouter = createRouter()
  router.matcher = newRouter.matcher
}
export default router
