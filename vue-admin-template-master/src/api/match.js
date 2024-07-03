import request from '@/utils/request'

export function getList(params) {
  return request({
    url: '/game',
    method: 'get',
    params
  })
}

export function deletelist(matchId) {
  return request({
    url: '/game/delete',
    method: 'delete',
    params: { matchtId }
  })
}

export function addlist(data) {
  return request({
    url: '/game/add',
    method: 'post',
    data
  })
}
export function editlist(data) {
  return request({
    url: '/game/edit',
    method: 'post',
    data
  })
}
