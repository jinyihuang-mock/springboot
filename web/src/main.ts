import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import Antd from 'ant-design-vue';
import 'ant-design-vue/dist/antd.css';

// import { createApp } from 'vue';
// import Antd from 'ant-design-vue';
// import App from './App';
// import 'ant-design-vue/dist/antd.css';

const app = createApp(App);

// app.use(Antd).mount('#app');

createApp(App).use(store).use(Antd).use(router).mount('#app')
