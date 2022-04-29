<template>
  <div>{{ param }}</div>
</template>

<script>
import {useRoute} from 'vue-router';

export default {
  name: 'Params',
  setup() {
    let param = null

    const route = useRoute()
    if (route.params.objectParam) {
      param = JSON.parse(route.params.objectParam)
    }

    return {
      param
    }
  }
};
</script>

<style scoped>

</style>