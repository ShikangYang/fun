/**
 * Created by gubaoer on 17/4/18.
 */

import Vue from 'vue'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-default/index.css'
import App from './App.vue'
import lang from 'element-ui/lib/locale/lang/en'
import locale from 'element-ui/lib/locale'
// import router from './router'
// more grace import third package !
import moment from 'moment'
import axios from 'axios'
import curvejs from 'curvejs'

Object.defineProperty(Vue.prototype, '$moment', { value: moment });
Object.defineProperty(Vue.prototype, '$axios', { value: axios });
Object.defineProperty(Vue.prototype, '$curvejs', { value: curvejs });

Vue.use(ElementUI);

locale.use(lang);



// eslint-disable-next-line no-new

const app = new Vue({
    el: '#app',
    render: h => h(App)
});

