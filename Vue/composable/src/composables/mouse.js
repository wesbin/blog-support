import {useEventListener} from '@/composables/event';

export function useMouse() {
  const x = ref(0)
  const y = ref(0)

  function update(event) {
    x.value = event.pageX
    y.value = event.pageY
  }

  useEventListener(window, 'mousemove', update)

  // onMounted(() => window.addEventListener('mousemove', update))
  // onUnmounted(() => window.addEventListener('mousemove', update))

  return { x, y }
}