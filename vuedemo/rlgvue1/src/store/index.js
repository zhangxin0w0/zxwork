import Vue from 'vue';
import Vuex from 'vuex';

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    user:'',
    cartSize:0
  },
  mutations: {
    getUser(state,payload){
      state.user=payload
    },
    getSize(state,size){
      state.cartSize=size
    }
  },
  actions: {
  },
  modules: {
  },
});
