<template>
  <div class="main">
    <el-button plain @click="dialogFormVisible1 = true">
      添加数据
    </el-button>

    <el-dialog title="添加" :visible.sync="dialogFormVisible1">
      <el-form :model="form">
        <el-form-item label="eventId" :label-width="formLabelWidth">
          <el-input v-model="form.eventId" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="event" :label-width="formLabelWidth">
          <el-input v-model="form.event" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="time" :label-width="formLabelWidth">
          <el-input v-model="form.time" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="playerId" :label-width="formLabelWidth">
          <el-input v-model="form.playerId" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="matchId" :label-width="formLabelWidth">
          <el-input v-model="form.matchId" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible1 = false">取 消</el-button>
        <el-button type="primary" @click="dialogFormVisible1 = false; addDate(form);">确 定</el-button>
      </div>
    </el-dialog>
    
    <el-dialog title="编辑" :visible.sync="dialogFormVisible2">
      <el-form :model="form">
        <el-form-item label="eventId" :label-width="formLabelWidth">
          <el-input v-model="form.eventId" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="event" :label-width="formLabelWidth">
          <el-input v-model="form.event" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="time" :label-width="formLabelWidth">
          <el-input v-model="form.time" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="playerId" :label-width="formLabelWidth">
          <el-input v-model="form.playerId" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="matchId" :label-width="formLabelWidth">
          <el-input v-model="form.matchId" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible2 = false">取 消</el-button>
        <el-button type="primary" @click="dialogFormVisible2 = false; editDate(form);">确 定</el-button>
      </div>
    </el-dialog>

    <el-table :data="list" style="width: 100%">
      <el-table-column label="eventId" width="180">
        <template #default="scope">
          <div style="display: flex; align-items: center">
            <span style="margin-left: 10px">{{ scope.row.eventId }}</span>
          </div>
        </template>
      </el-table-column>
      <el-table-column label="event" width="180">
        <template #default="scope">
          <div style="display: flex; align-items: center">
            <span style="margin-left: 10px">{{ scope.row.event }}</span>
          </div>
        </template>
      </el-table-column>
      <el-table-column label="time" width="180">
        <template #default="scope">
          <div style="display: flex; align-items: center">
            <span style="margin-left: 10px">{{ scope.row.time }}</span>
          </div>
        </template>
      </el-table-column>
      <el-table-column label="playerId" width="180">
        <template #default="scope">
          <div style="display: flex; align-items: center">
            <span style="margin-left: 10px">{{ scope.row.playerId }}</span>
          </div>
        </template>
      </el-table-column>
      <el-table-column label="matchId" width="180">
        <template #default="scope">
          <div style="display: flex; align-items: center">
            <span style="margin-left: 10px">{{ scope.row.matchId }}</span>
          </div>
        </template>
      </el-table-column>
      <el-table-column label="Operations">
        <template #default="scope">
          <el-button size="small" @click="dialogFormVisible2 = true">
            Edit
          </el-button>
          <el-button size="small" type="danger" @click="handleDelete(scope.row.eventId)">
            Delete
          </el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>

import { getList, deletelist, addlist, editlist } from '@/api/event'

export default {
  inject: ['reload'],
  filters: {
    statusFilter(status) {
      const statusMap = {
        published: 'success',
        draft: 'gray',
        deleted: 'danger'
      }
      return statusMap[status]
    }
  },
  data() {
    return {
      list: null,
      listLoading: true,
      dialogFormVisible1: false,
      dialogFormVisible2: false,
      form: {
        eventId: '',
        event: '',
        time: '',
        playerId: '',
        matchId: ''
      },
      formLabelWidth: '120px'
    }
  },
  created() {
    this.fetchData()
  },
  methods: {
    fetchData() {
      this.listLoading = true
      getList().then(response => {
        this.list = response.data.items
        this.listLoading = false
      })
    },
    handleDelete(params) {
      console.log(params);
      deletelist(params).then(response => {
        if (response.code === 20000) {
          this.reload();
        }
      })
      
    },
    addDate(form) {
      addlist(form).then(response => {
        if (response.code === 20000) {
          this.reload();
          eventId = '';
          event =  '';
          time = '';
          playerId =  '';
          matchId = '';
        }
      })
    },
    editDate(form) {
      editlist(form).then(response => {
        if (response.code === 20000) {
          this.reload();
          eventId = '';
          event =  '';
          time = '';
          playerId =  '';
          matchId = '';
        }
      })
    },
  }
}
</script>

<style scoped>
.main {
  margin-top: 15px;
  margin-left: 50px;
}
</style>
@/api/table@/api/table