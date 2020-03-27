import Vue from 'vue';
import Vant from 'vant';
import 'vant/lib/index.css';
import App from './App.vue';
import router from './router';
import store from './store';

import axios from 'axios';
import VueAxios from 'vue-axios';

import { Lazyload } from 'vant';
import { Toast } from 'vant';
import { ImagePreview } from 'vant';

Vue.use(ImagePreview);
Vue.use(Lazyload);
Vue.use(Toast);
Vue.use(Vant);

Vue.use(VueAxios, axios);
Vue.config.productionTip = false;
// axios.defaults.withCredentials=true;

new Vue({
  router,
  store,
  render: (h) => h(App),
}).$mount('#app');
