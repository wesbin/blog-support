<template>
  <component :is="componentLoader"></component>
</template>

<script>
export default {
  name: 'ComponentLoader',
  props: {
    tab: {
      type: String,
      required: true
    }
  },
  computed: {
    componentLoader() {
      console.log('componentLoader')
      const tab = this.tab;
      return () => import(`@/components/${tab}`)
    }
  },
};
</script>

<style scoped>

</style>