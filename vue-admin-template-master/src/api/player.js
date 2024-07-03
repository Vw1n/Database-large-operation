import request from '@/utils/request'

export function getList(params) {
  return request({
    url: '/player',
    method: 'get',
    params
  })
}

export function deletelist(playerId) {
  return request({
    url: '/player/delete',
    method: 'delete',
    params: { playerId }
  })
}

export function addlist(data) {
  return request({
    url: '/player/add',
    method: 'post',
    data
  })
}
export function editlist(data) {
  return request({
    url: '/player/edit',
    method: 'post',
    data
  })
}
