import Data from './Data.js';

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

multiSorting(Data, {
  postId: 'desc',
  name: 'asc'
})

document.querySelector('#result').innerHTML = JSON.stringify(Data, null, 2)