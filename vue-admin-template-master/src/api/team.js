import request from '@/utils/request'

export function getList(params) {
  return request({
    url: '/team',
    method: 'get',
    params
  })
}

export function deletelist(teamId) {
  return request({
    url: '/team/delete',
    method: 'delete',
    params: { teamId }
  })
}

export function addlist(data) {
  return request({
    url: '/team/add',
    method: 'post',
    data
  })
}
export function editlist(data) {
  return request({
    url: '/team/edit',
    method: 'post',
    data
  })
}
