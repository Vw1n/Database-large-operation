import request from '@/utils/request'

export function getList(params) {
  return request({
    url: '/event',
    method: 'get',
    params
  })
}

export function deletelist(eventId) {
  return request({
    url: '/event/delete',
    method: 'delete',
    params: { eventId }
  })
}

export function addlist(data) {
  return request({
    url: '/event/add',
    method: 'post',
    data
  })
}
export function editlist(data) {
  return request({
    url: '/event/edit',
    method: 'post',
    data
  })
}
