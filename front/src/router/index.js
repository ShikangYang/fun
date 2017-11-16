/**
 * Created by Administrator on 2017/11/8.
 */
import Vue from 'vue'
import VueRouter from 'vue-router'

import login from '../site/Login.vue'
import home from '../site/Home.vue'
import register from '../site/Register.vue'

//开启debug模式
const routes = [
    {
        path: '/',
        name: 'home',
        component: home
    },
    {
        path: "/login",
        component: login,
        name: login
    },
    {
        path: "/register",
        component: register,
        name: register
    }

]

var router =  new VueRouter({
    routes
})
Vue.use(VueRouter)
export default router;


