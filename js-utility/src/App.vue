<script setup>
import Data from '@/support/data'

const multiSorting = (data, columns) => {

  const comparer = (a, b) => {
    return compareMultiple(a, b, Object.entries(columns))
  }

  const compareMultiple = (a, b, columnEntries) => {
    let index = -1
    const length = columnEntries.length
    while (++index < length) {
      const [criteria, order] = columnEntries[index]
      let result = compareAscending(a[criteria], b[criteria])
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

  // data.sort(comparer)

  let mappedData = data.map((value, index) => {
    const obj = { index: index }
    Object.keys(columns).forEach(criteria => {
      obj[criteria] = value[criteria]
    })
    return obj
  })

  return mappedData.sort(comparer).map(value => {
    return data[value.index]
  })
}

// 정렬 전 데이터
const before = Data().post
// 정렬 후 데이터
const after = multiSorting(before, { postId: 'desc', name: 'asc' })
</script>

<template>
  <div class="content">
    <div class="line" v-for="item in before" :key="item.id">
      {{ item }}
    </div>
  </div>
  <div class="content">
    <div class="line" v-for="item in after" :key="item.id">
      {{ item }}
    </div>
  </div>
</template>

<style>
body {
  margin: 0;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: darkgray;
  background-color: #2c3e50;
  height: 100vh;
  width: 100vw;
  display: flex;
  flex-direction: row;
}

.content {
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
