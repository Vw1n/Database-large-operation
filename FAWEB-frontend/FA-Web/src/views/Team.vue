import { RouterLink, RouterView } from 'vue-router'

<template>
    <div class="main">
        <div v-for="item in  teams " class="team" >
            <img :src=" item.url " />
            <div class="text">{{ item.name }}</div>
        </div>
    </div>
</template>

<script>
import icon_cs from '../assets/icons/team_logo/dark/cs.png';
import icon_dsj from '../assets/icons/team_logo/dark/dsj.png';
import icon_gw from '../assets/icons/team_logo/dark/gw.png';
import icon_jk from '../assets/icons/team_logo/dark/jk.png';
import icon_jl from '../assets/icons/team_logo/dark/jl.png';
import icon_jt from '../assets/icons/team_logo/dark/jt.png';
import icon_sxy from '../assets/icons/team_logo/dark/sxy.png';
import icon_wgy from '../assets/icons/team_logo/dark/wgy.png';
import icon_xny from '../assets/icons/team_logo/dark/xny.png';
import icon_yxy from '../assets/icons/team_logo/dark/yxy.png';
import icon_zd from '../assets/icons/team_logo/dark/zd.png';
import icon_jc from '../assets/icons/team_logo/dark/jc.png';
import icon_zb from '../assets/icons/team_logo/dark/zb.png';
export default {
    data() {
        return {
            teams: [
                {
                    id: '1',
                    name: "中德智能智造学院",
                    url: icon_zd
                },
                {
                    id: '2',
                    name: "大数据与互联网学院",
                    url: icon_dsj
                },
                {
                    id: '3',
                    name: "新材料与新能源学院",
                    url: icon_xny
                },
                {
                    id: '4',
                    name: "城市交通与物流学院",
                    url: icon_jt
                },
                {
                    id: '5',
                    name: "健康与环境工程学院",
                    url: icon_jk
                },
                {
                    id: '6',
                    name: "工程物理学院",
                    url: icon_gw
                },
                {
                    id: '8',
                    name: "药学院",
                    url: icon_yxy
                },
                {
                    id: '9',
                    name: "未来技术学院",
                    url: icon_jl
                },
                {
                    id: '10',
                    name: "创意设计学院",
                    url: icon_cs
                },
                {
                    id: '11',
                    name: "商学院",
                    url: icon_sxy
                },
                {
                    id: '12',
                    name: "外国语学院",
                    url: icon_wgy
                },
                {
                    id: '13',
                    name: "集成电路与光电芯片学院",
                    url: icon_jc
                },
            ]
        }
    }
}
</script>
<style scoped>
.main {
    margin-top: 80px;
    display: flex;
    flex-wrap: wrap;
    width: 100%;
    height: 100%;
}

.team {
    display: flex;
    flex-direction: column;
    width: 25%;
    height: 200px;
}

.team .text {
    font-family: 微软雅黑;
    text-align: center;
    width: 100%;
    font-size: 20px;
}

.team img {
    margin-left: auto;
    margin-right: auto;
    width: 100px;
    height: 100px;
}
</style>