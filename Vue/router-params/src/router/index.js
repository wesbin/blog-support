import {createRouter, createWebHistory} from 'vue-router';

const routes = [
  {
    path: '/home',
    name: 'home',
    component: () => import('@/components/Home')
  },
  {
    path: '/params',
    name: 'params',
    component: () => import('@/components/Params')
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router