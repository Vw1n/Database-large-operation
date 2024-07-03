<template>

    <div class="main">
        <div class="time">2024-3-16 星期六</div>
        <RouterLink class="match" v-for="item in match1" to="/detail">
            <div class="home">
                <div>{{ item.home_score }}</div>
                <div class="name">{{ item.home_team }}</div>
                <img :src="item.home_url" />
            </div>
            <div class="colon">:</div>
            <div class="guest">
                <div>{{ item.guest_score }}</div>
                <div class="name">{{ item.guest_team }}</div>
                <img :src="item.guest_url" />
            </div>
        </RouterLink>
        <div class="time">2024-3-17 星期日</div>
        <div class="match" v-for="item in match2">
            <div class="home">
                <div>{{ item.home_score }}</div>
                <div class="name">{{ item.home_team }}</div>
                <img :src="item.home_url" />
            </div>
            <div class="colon">:</div>
            <div class="guest">
                <div>{{ item.guest_score }}</div>
                <div class="name">{{ item.guest_team }}</div>
                <img :src="item.guest_url" />
            </div>
        </div>
        <div class="time">2024-3-23 星期六</div>
        <div class="match" v-for="item in match3">
            <div class="home">
                <div>{{ item.home_score }}</div>
                <div class="name">{{ item.home_team }}</div>
                <img :src="item.home_url" />
            </div>
            <div class="colon">:</div>
            <div class="guest">
                <div>{{ item.guest_score }}</div>
                <div class="name">{{ item.guest_team }}</div>
                <img :src="item.guest_url" />
            </div>
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
import icon_ld from '../assets/icons/team_logo/dark/ld.png';
export default {
    data() {
        return {
            match1: [
                {
                    home_team: "中德智能制造学院",
                    home_url: icon_zd,
                    home_score: 2,
                    guest_team: "商学院",
                    guest_url: icon_sxy,
                    guest_score: 0,
                },
                {
                    home_team: "工程物理学院",
                    home_url: icon_gw,
                    home_score: 3,
                    guest_team: "大数据与互联网学院",
                    guest_url: icon_dsj,
                    guest_score: 4,
                },
                {
                    home_team: "四院联队",
                    home_url: icon_zd,
                    home_score: 1,
                    guest_team: "药学院",
                    guest_url: icon_yxy,
                    guest_score: 6,
                }
            ],
            match2: [
                {
                    home_team: "集成电路与光电芯片学院",
                    home_url: icon_jc,
                    home_score: 1,
                    guest_team: "城市交通与物流学院",
                    guest_url: icon_jt,
                    guest_score: 1,
                },
                {
                    home_team: "创意设计学院",
                    home_url: icon_cs,
                    home_score: 0,
                    guest_team: "大数据与互联网学院",
                    guest_url: icon_dsj,
                    guest_score: 4,
                },
                {
                    home_team: "四院联队",
                    home_url: icon_ld,
                    home_score: 1,
                    guest_team: "健康与环境工程学院",
                    guest_url: icon_jk,
                    guest_score: 9,
                }
            ],
            match3: [
                {
                    home_team: "城市交通与物流学院",
                    home_url: icon_jt,
                    home_score: 1,
                    guest_team: "中德智能制造学院",
                    guest_url: icon_zd,
                    guest_score: 1,
                },
                {
                    home_team: "新材料与新能源学院",
                    home_url: icon_xny,
                    home_score: 1,
                    guest_team: "大数据与互联网学院",
                    guest_url: icon_dsj,
                    guest_score: 1,
                },
                {
                    home_team: "商学院",
                    home_url: icon_sxy,
                    home_score: 1,
                    guest_team: "集成电路与光电芯片学院",
                    guest_url: icon_jc,
                    guest_score: 9,
                }
            ]
        }
    }
}
</script>

<style scoped>
.a {
    width: 100%;
}

.main {
    display: flex;
    flex-wrap: wrap;
    width: 100%;
}

.time {
    margin-top: 10px;
    padding-top: 8px;
    width: 100%;
    height: 30px;
    text-align: center;
    font-size: 20px;
    background-color: rgb(243, 246, 252);
}

.match {
    display: flex;
    width: 100%;
    font-size: 20px;
    padding: 10px;
    text-decoration: none;
    /* 去除默认的下划线 */
    outline: none;
    /* 去除旧版浏览器的点击后的外虚线框 */
    color: black;
    /* 去除默认的颜色和点击后变化的颜色 */
}

.match img {
    height: 100px;
    width: 100px;
}

.match .colon {
    padding-top: 38px;
}

.home {
    display: flex;
    flex-direction: row-reverse;
    width: 50%;
}

.home div {
    padding: 40px;
}

.name {
    text-align: center;
    width: 200px;
}

.guest {
    display: flex;
    flex-direction: row;
    width: 50%;
}

.guest div {
    padding: 40px;
}
</style>