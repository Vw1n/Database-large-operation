<template>
  <div class="main">
    <el-button plain @click="dialogFormVisible1 = true">
      添加数据
    </el-button>

    <el-dialog title="添加" :visible.sync="dialogFormVisible1">
      <el-form :model="form">
        <el-form-item label="matchId" :label-width="formLabelWidth">
          <el-input v-model="form.matchId" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="homeScore" :label-width="formLabelWidth">
          <el-input v-model="form.homeScore" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="guestScore" :label-width="formLabelWidth">
          <el-input v-model="form.guestScore" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="round" :label-width="formLabelWidth">
          <el-input v-model="form.round" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="homeId" :label-width="formLabelWidth">
          <el-input v-model="form.homeId" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="guestId" :label-width="formLabelWidth">
          <el-input v-model="form.guestId" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible1 = false">取 消</el-button>
        <el-button type="primary" @click="dialogFormVisible1 = false; addDate(form);">确 定</el-button>
      </div>
    </el-dialog>
    
    <el-dialog title="编辑" :visible.sync="dialogFormVisible2">
      <el-form :model="form">
        <el-form-item label="matchId" :label-width="formLabelWidth">
          <el-input v-model="form.matchId" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="homeScore" :label-width="formLabelWidth">
          <el-input v-model="form.homeScore" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="guestScore" :label-width="formLabelWidth">
          <el-input v-model="form.guestScore" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="round" :label-width="formLabelWidth">
          <el-input v-model="form.round" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="homeId" :label-width="formLabelWidth">
          <el-input v-model="form.homeId" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="guestId" :label-width="formLabelWidth">
          <el-input v-model="form.guestId" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible2 = false">取 消</el-button>
        <el-button type="primary" @click="dialogFormVisible2 = false; editDate(form);">确 定</el-button>
      </div>
    </el-dialog>

    <el-table :data="list" style="width: 100%">
      <el-table-column label="matchId" width="180">
        <template #default="scope">
          <div style="display: flex; align-items: center">
            <span style="margin-left: 10px">{{ scope.row.matchId }}</span>
          </div>
        </template>
      </el-table-column>
      <el-table-column label="homeScore" width="180">
        <template #default="scope">
          <div style="display: flex; align-items: center">
            <span style="margin-left: 10px">{{ scope.row.homeScore }}</span>
          </div>
        </template>
      </el-table-column>
      <el-table-column label="guestScore" width="180">
        <template #default="scope">
          <div style="display: flex; align-items: center">
            <span style="margin-left: 10px">{{ scope.row.guestScore }}</span>
          </div>
        </template>
      </el-table-column>
      <el-table-column label="round" width="180">
        <template #default="scope">
          <div style="display: flex; align-items: center">
            <span style="margin-left: 10px">{{ scope.row.round }}</span>
          </div>
        </template>
      </el-table-column>
      <el-table-column label="homeId" width="180">
        <template #default="scope">
          <div style="display: flex; align-items: center">
            <span style="margin-left: 10px">{{ scope.row.homeId }}</span>
          </div>
        </template>
      </el-table-column>
      <el-table-column label="guestId" width="180">
        <template #default="scope">
          <div style="display: flex; align-items: center">
            <span style="margin-left: 10px">{{ scope.row.guestId }}</span>
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

import { getList, deletelist, addlist, editlist } from '@/api/match'

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
        matchId: '',
        homeScore: '',
        guestScore: '',
        round: '',
        homeId: '',
        guestId: ''
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