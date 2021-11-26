<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <h3>Dynamic Components</h3>
    <ul>
      <li
        class="tab"
        v-for="tab in tabs"
        :key="tab"
        @click="currentTab = tab">
        {{ tab }}
      </li>
    </ul>
    <h4>components 활용</h4>
    <component :is="currentTab"></component>
    <h4>computed  활용</h4>
    <component :is="componentLoader"></component>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  data() {
    return {
      tabs: [
        'VueRouter',
        'Vuex',
        'VueDevtools',
        'VueLoader',
        'AwesomeVue',
      ],
      currentTab: 'VueRouter'
    }
  },
  computed: {
    componentLoader() {
      const tab = this.currentTab
      // console.log(this.currentTab)
      return () => import(`@/components/${tab}`)
      // return () => import(`@/components/${this.currentTab}`)
    }
  },
  components: {
    VueRouter: () => import('@/components/VueRouter'),
    Vuex: () => import('@/components/Vuex'),
    VueDevtools: () => import('@/components/VueDevtools'),
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
.tab {
  padding: 6px 10px;
  border-top-left-radius: 3px;
  border-top-right-radius: 3px;
  border: 1px solid #ccc;
  cursor: pointer;
  background: #f0f0f0;
  margin-bottom: -1px;
  margin-right: -1px;
}
</style>
