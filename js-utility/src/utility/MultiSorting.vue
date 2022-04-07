<script setup>
import Data from '@/support/data'

const multiSorting = (data, columns) => {

  const comparer = (a, b) => {
    return compareMultiple(a, b, Object.entries(columns))
  }

  const compareMultiple = (a, b, columnsEntries) => {
    let index = -1
    const length = columnsEntries.length
    while (++index < length) {
      const [column, order] = columnsEntries[index]
      let result = compareAscending(a[column], b[column])
      if (result) {
        return result * (order === 'desc' ? -1 : 1)
      }
    }
  }

  const compareAscending = (prev, next) => {
    if (prev > next) return 1
    if (prev < next) return -1
    return 0
  }

  data.sort(comparer)
}

// 정렬 전 데이터
const before = Data().post
// 정렬 후 데이터
const after = Data().post

multiSorting(after, { postId: 'desc', name: 'asc' })
</script>

<template>
  <div class="panel">
    <div class="line" v-for="item in before" :key="item.id">
      {{ item }}
    </div>
  </div>
  <div class="panel">
    <div class="line" v-for="item in after" :key="item.id">
      {{ item }}
    </div>
  </div>
</template>

<style scoped>
.panel {
  overflow: scroll;
  overflow-x: hidden;
  width: 50vw;
  padding: 15px;
  border: antiquewhite solid 1px;
}

.line {
  margin-bottom: 10px;
}
</style>