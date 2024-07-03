const Mock = require('mockjs')

const data = Mock.mock({
  'items': [
    {
        "eventId": 1,
        "matchId": 202401,
        "team": "home",
        "number": 9,
        "time": 5
    },
    {
        "eventId": 2,
        "matchId": 202401,
        "team": "home",
        "number": 3,
        "time": 9
    }
]
})

module.exports = [
  {
    url: '/vue-admin-template/table/list',
    type: 'get',
    response: config => {
      const items = data.items
      return {
        code: 20000,
        data: {
          total: items.length,
          items: items
        }
      }
    }
  }
]
