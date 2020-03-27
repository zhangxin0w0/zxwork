import Vue from 'vue';
import VueRouter from 'vue-router';
import Home from '../views/Home.vue';
import Login from '../views/Login.vue';
import Category from '../views/Category.vue';
import Cart from '../views/Cart.vue';
import Own from '../views/Own.vue';
import GoodDetail from '../views/GoodDetail.vue';
import Address from '../views/Address.vue';
import AliPay from '../views/AliPay.vue';

Vue.use(VueRouter);

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home,
  },
  {
    path: '/login',
    name: 'Login',
    component: Login,
  },
  {
    path: '/category',
    name: 'Category',
    component: Category,
  },
  {
    path: '/cart',
    name: 'Cart',
    component: Cart,
  },
  {
    path: '/own',
    name: 'Own',
    component: Own,
  },
  {
    path: '/gooddetail',
    name: 'GoodDetail',
    component: GoodDetail,
  },
  {
    path: '/address',
    name: 'Address',
    component: Address,
  },
  {
    path: '/pay',
    name: 'AliPay',
    component: AliPay,
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue'),
  },
];

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes,
});

export default router;
