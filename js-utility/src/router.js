import {createWebHistory, createRouter} from "vue-router";

const routes = [
  {
    path: "/",
    name: "Post List",
    component: app,
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;