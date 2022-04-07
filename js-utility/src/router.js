import { createWebHistory, createRouter } from "vue-router";

const routes = [
  {
    path: "/Nav",
    name: "Nav",
    component: () => import('@/Nav'),
  },
  {
    path: "/MultiSorting",
    name: "MultiSorting",
    component: () => import('@/utility/MultiSorting')
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;