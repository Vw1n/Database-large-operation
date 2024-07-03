<template>
    <div class="main">
        <div class="head">
            <div class="match">
                <div class="home">
                    <div>{{ home_score }}</div>
                    <div class="name">{{ home_team }}</div>
                    <img :src="home_url" />
                </div>
                <div class="colon">:</div>
                <div class="guest">
                    <div>{{ guest_score }}</div>
                    <div class="name">{{ guest_team }}</div>
                    <img :src="guest_url" />
                </div>
            </div>
        </div>
        <div class="body">
            <div v-for="item in event" class="event">
                <div v-if="item.team === 'home'" class="home_event">
                    <div class="time">
                        {{ item.time }}'
                    </div>
                    <img src="../assets/icons/match_event/goal.png">
                    <div class="role">
                        {{ item.role }}
                    </div>
                    <img src="../assets/icons/number/number_0.png">
                </div>
                <div v-if="item.team === 'guest'" class="guest_event">
                    <div class="time">
                        {{ item.time }}'
                    </div>
                    <img src="../assets/icons/match_event/goal.png">
                    <div class="role">
                        {{ item.role }}
                    </div>
                    <img src="../assets/icons/number/number_0.png">
                </div>
            </div>
        </div>
        <div class="foot">

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
            home_team: "工程物理学院",
            home_url: icon_gw,
            home_score: 3,
            guest_team: "大数据与互联网学院",
            guest_url: icon_dsj,
            guest_score: 4,
            event: [
                {
                    "id": "1",
                    "event": "进球",
                    "event_logo": "/icons/match_event/goal.png",
                    "number_logo": "/icons/number/number_42.png",
                    "role": "赵俊烨",
                    "assist": " ",
                    "assist_number": " ",
                    "team": "home",
                    "time": "4"
                },
                {
                    "id": "2",
                    "event": "进球",
                    "event_logo": "/icons/match_event/goal.png",
                    "number_logo": "/icons/number/number_11.png",
                    "role": "王嘉扬",
                    "assist": "",
                    "assist_number": " ",
                    "team": "guest",
                    "time": "10"
                },
                {
                    "id": "3",
                    "event": "进球",
                    "event_logo": "/icons/match_event/goal.png",
                    "number_logo": "/icons/number/number_10.png",
                    "role": "谢子腾",
                    "assist": "",
                    "assist_number": " ",
                    "team": "home",
                    "time": "12"
                },
                {
                    "id": "4",
                    "event": "进球",
                    "event_logo": "/icons/match_event/goal.png",
                    "number_logo": "/icons/number/number_17.png",
                    "role": "黄睿",
                    "assist": "张嘉聪",
                    "assist_number": "/icons/number/number_7.png",
                    "team": "home",
                    "time": "14"
                },
                {
                    "id": "5",
                    "event": "进球",
                    "event_logo": "/icons/match_event/goal.png",
                    "number_logo": "/icons/number/number_11.png",
                    "role": "王嘉扬",
                    "assist": "王子恒",
                    "assist_number": "/icons/number/number_10.png",
                    "team": "guest",
                    "time": "17"
                },
                {
                    "id": "6",
                    "event": "进球",
                    "event_logo": "/icons/match_event/goal.png",
                    "number_logo": "/icons/number/number_11.png",
                    "role": "李成锐",
                    "assist": "",
                    "assist_number": " ",
                    "team": "home",
                    "time": "22"
                },
                {
                    "id": "7",
                    "event": "进球",
                    "event_logo": "/icons/match_event/goal.png",
                    "number_logo": "/icons/number/number_9.png",
                    "role": "卢嘉辉",
                    "assist": "王子恒",
                    "assist_number": "/icons/number/number_10.png",
                    "team": "guest",
                    "time": "60"
                }
            ],
        }
    }
}
</script>

<style scoped>
.main {
    display: flex;
    flex-wrap: wrap;
    width: 100%;
}

.head {
    width: 100%;
}

.match {
    display: flex;
    width: 100%;
    font-size: 20px;
    padding: 10px;
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

.body {
    padding: 0 10%;
    width: 80%;
}

.home_event {
    width: 50%;
    display: flex;
    flex-direction: row-reverse;
    margin-top: 100px;
    justify-content: space-around;
    border-right: 5px greenyellow solid;
}

.home_event img {
    height: 40px;
    width: 40px;
}

.guest_event {
    width: 50%;
    display: flex;
    flex-direction: row;
    margin-left: 50%;
    margin-top: 100px;
    justify-content: space-around;
    border-left: 5px blue solid;
}

.guest_event img {
    height: 40px;
    width: 40px;
}

.role {
    width: 100px;
    padding: 10px;
}

.time {
    padding: 10px;
}
</style>