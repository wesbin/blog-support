<template>
  <button @click="routerPush">ROUTER PUSH</button>
</template>

<script>
import {useRouter} from 'vue-router';

export default {
  name: 'Home',
  setup() {
    const router = useRouter()

    const routerPush = () => {
      router.push({
        name: 'params',
        params: {
          objectParam: JSON.stringify({
            stringify: 'JSON.stringfy',
            parse: 'JSON.parse',
            GOOD: 'So GOOD!!!'
          })
        }
      })
    }

    return {
      routerPush
    }
  }
};
</script>

<style scoped>

</style>