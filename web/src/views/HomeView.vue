<template>
  <a-layout >
    <a-layout-content style="padding: 0 50px">
      <a-layout style="padding: 24px 0; background: #fff">
        <router-view/>
        <a-layout-sider width="200" style="background: #fff">
          <a-menu
              mode="inline"
              style="height: 100%"
          >
            <a-sub-menu key="sub1">
              <template #title>
                <span>
                  <user-outlined />
                  subnav 1111111
                </span>
              </template>
              <a-menu-item key="1">option1</a-menu-item>
              <a-menu-item key="2">option2</a-menu-item>
              <a-menu-item key="3">option3</a-menu-item>
              <a-menu-item key="4">option4</a-menu-item>
            </a-sub-menu>
            <a-sub-menu key="sub2">
              <template #title>
                <span>
                  <laptop-outlined />
                  subnav 2
                </span>
              </template>
              <a-menu-item key="5">option5</a-menu-item>
              <a-menu-item key="6">option6</a-menu-item>
              <a-menu-item key="7">option7</a-menu-item>
              <a-menu-item key="8">option8</a-menu-item>
            </a-sub-menu>
            <a-sub-menu key="sub3">
              <template #title>
                <span>
                  <notification-outlined />
                  subnav 3
                </span>
              </template>
              <a-menu-item key="9">option9</a-menu-item>
              <a-menu-item key="10">option10</a-menu-item>
              <a-menu-item key="11">option11</a-menu-item>
              <a-menu-item key="12">option12</a-menu-item>
            </a-sub-menu>
          </a-menu>
        </a-layout-sider>

      </a-layout>
    </a-layout-content>
    <a-layout-content :style="{background:'#fff',padding:'24px',margin:0,minHeight:'280px'}" >
<!--      <pre>{{ebooks}}</pre>-->
      <pre>{{ebooks2}}</pre>

    </a-layout-content>
  </a-layout>
</template>

<script lang="ts">
import { defineComponent ,onMounted,ref,reactive,toRef} from 'vue';
import HelloWorld from '@/components/HelloWorld.vue'; // @ is an alias to /src
import axios from "axios";

export default defineComponent({
  name: 'HomeView',
  setup(){
    console.log("setup");
    const ebooks= ref();
    const ebooks2= reactive({books:[]});
    onMounted( ()=> {
      console.log("mounted")
      axios.get("http://localhost:8880/ebook/list?name=spring").then((response)=>{
        const data=response.data;
         ebooks.value = data.content;
         ebooks2.books=data.content;
        console.log(response);
      });
    });
    return{
      ebooks,
      ebooks2: toRef(ebooks2,"books")
    }
  },
  components: {

  },
});
</script>
