<template>
    <div class="main">
        <div class="group">
            <div class="head">
                <div>A组</div>
                <div>积分</div>
                <div>胜</div>
                <div>负</div>
                <div>进</div>
                <div>失</div>
                <div>净胜球</div>
            </div>
            <div v-for="(item, index) in group_A" class="graph" :key="index" :class="getClassName(index)">
                <div class="data" v-if="index == 0 || index == 1" style="background-color: #d1edc4;">
                    <div>{{ item.team }}</div>
                    <div>{{ item.score }}</div>
                    <div>{{ item.win }}</div>
                    <div>{{ item.lose }}</div>
                    <div>{{ item.in }}</div>
                    <div>{{ item.out }}</div>
                    <div>{{ item.goal }}</div>
                </div>
                <div class="data" v-else style="background-color: #f0f9eb;">
                    <div>{{ item.team }}</div>
                    <div>{{ item.score }}</div>
                    <div>{{ item.win }}</div>
                    <div>{{ item.lose }}</div>
                    <div>{{ item.in }}</div>
                    <div>{{ item.out }}</div>
                    <div>{{ item.goal }}</div>
                </div>
            </div>
        </div>
        <div class="group">
            <div class="head">
                <div>B组</div>
                <div>积分</div>
                <div>胜</div>
                <div>负</div>
                <div>进</div>
                <div>失</div>
                <div>净胜球</div>
            </div>
            <div v-for="(item, index) in group_B" class="graph" :key="index" :class="getClassName(index)">
                <div class="data" v-if="index == 0 || index == 1" style="background-color: #d1edc4;">
                    <div>{{ item.team }}</div>
                    <div>{{ item.score }}</div>
                    <div>{{ item.win }}</div>
                    <div>{{ item.lose }}</div>
                    <div>{{ item.in }}</div>
                    <div>{{ item.out }}</div>
                    <div>{{ item.goal }}</div>
                </div>
                <div class="data" v-else style="background-color: #f0f9eb;">
                    <div>{{ item.team }}</div>
                    <div>{{ item.score }}</div>
                    <div>{{ item.win }}</div>
                    <div>{{ item.lose }}</div>
                    <div>{{ item.in }}</div>
                    <div>{{ item.out }}</div>
                    <div>{{ item.goal }}</div>
                </div>
            </div>
        </div>
        <div class="group">
            <div class="head">
                <div>C组</div>
                <div>积分</div>
                <div>胜</div>
                <div>负</div>
                <div>进</div>
                <div>失</div>
                <div>净胜球</div>
            </div>
            <div v-for="(item, index) in group_C" class="graph" :key="index" :class="getClassName(index)">
                <div class="data" v-if="index == 0 || index == 1" style="background-color: #d1edc4;">
                    <div>{{ item.team }}</div>
                    <div>{{ item.score }}</div>
                    <div>{{ item.win }}</div>
                    <div>{{ item.lose }}</div>
                    <div>{{ item.in }}</div>
                    <div>{{ item.out }}</div>
                    <div>{{ item.goal }}</div>
                </div>
                <div class="data" v-else style="background-color: #f0f9eb;">
                    <div>{{ item.team }}</div>
                    <div>{{ item.score }}</div>
                    <div>{{ item.win }}</div>
                    <div>{{ item.lose }}</div>
                    <div>{{ item.in }}</div>
                    <div>{{ item.out }}</div>
                    <div>{{ item.goal }}</div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            group_A: [
                {
                    team: "中德智能制造学院",
                    score: 6,
                    win: 2,
                    lose: 1,
                    in: 6,
                    out: 1,
                    goal: 5
                },
                {
                    team: "集成电路与光电芯片学院",
                    score: 5,
                    win: 2,
                    lose: 1,
                    in: 2,
                    out: 4,
                    goal: -2
                },
                {
                    team: "城市交通与物流学院",
                    score: 5,
                    win: 2,
                    lose: 1,
                    in: 4,
                    out: 2,
                    goal: 2
                },
                {
                    team: "商学院",
                    score: 0,
                    win: 0,
                    lose: 3,
                    in: 1,
                    out: 5,
                    goal: -4
                }
            ],
            group_B: [
                {
                    team: "大数据与互联网学院",
                    score: 6,
                    win: 2,
                    lose: 1,
                    in: 8,
                    out: 3,
                    goal: 5
                },
                {
                    team: "工程物理学院",
                    score: 6,
                    win: 2,
                    lose: 1,
                    in: 16,
                    out: 6,
                    goal: 10
                },
                {
                    team: "新材料与新能源学院",
                    score: 5,
                    win: 2,
                    lose: 1,
                    in: 5,
                    out: 2,
                    goal: 3
                },
                {
                    team: "创意设计学院",
                    score: 0,
                    win: 0,
                    lose: 3,
                    in: 1,
                    out: 19,
                    goal: -18
                }
            ],
            group_C: [
                {
                    team: "健康与环境工程学院",
                    score: 6,
                    win: 2,
                    lose: 1,
                    in: 6,
                    out: 1,
                    goal: 5
                },
                {
                    team: "集成电路与光电芯片学院",
                    score: 6,
                    win: 2,
                    lose: 0,
                    in: 13,
                    out: 0,
                    goal: 13
                },
                {
                    team: "药学院",
                    score: 3,
                    win: 1,
                    lose: 1,
                    in: 6,
                    out: 4,
                    goal: 2
                },
                {
                    team: "四院联队",
                    score: 0,
                    win: 0,
                    lose: 2,
                    in: 1,
                    out: 15,
                    goal: -14
                }
            ]
        }
    },
    methods: {
        getClassName(index) {
            return index === 0 ? 'first-item' : '';
        }
    }
}
</script>

<style scoped>
.main {
    margin-top: 20px;
    width: 90%;
    margin-left: 5%;
}

.group {
    margin-top: 10px;
}

.head {
    display: flex;
    background-color: #529b2e;
    color: white;
    justify-content: space-around;
}

.data {
    display: flex;
    justify-content: space-around;
}

.data div {
    padding: 30px;
    text-align: center;
    width: 300px;
}

.head div {
    padding: 30px;
    text-align: center;
    width: 300px;
}

</style>