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
    <component :is="currentTab"></component>
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
        'vue-router',
        'vuex',
        'vue-devtools',
        'vue-loader',
        'awesome-vue',
      ],
      currentTab: 'vue-router'
    }
  },
  components: {
    'vue-router': () => import('@/components/vue-router'),
    vuex: () => import('@/components/vuex'),
    'vue-devtools': () => import('@/components/vue-devtools'),
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
