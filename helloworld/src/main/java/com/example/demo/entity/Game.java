package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Game {

    @TableId
    private String matchId;
    private String homeScore;
    private String guestScore;
    private String round;
    private String homeId;
    private String guestId;

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public String getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(String homeScore) {
        this.homeScore = homeScore;
    }

    public String getGuestScore() {
        return guestScore;
    }

    public void setGuestScore(String guestScore) {
        this.guestScore = guestScore;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getHomeId() {
        return homeId;
    }

    public void setHomeId(String homeId) {
        this.homeId = homeId;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    @Override
    public String toString() {
        return "Game{" +
                "matchId='" + matchId + '\'' +
                ", homeScore='" + homeScore + '\'' +
                ", guestScore='" + guestScore + '\'' +
                ", round='" + round + '\'' +
                ", homeId='" + homeId + '\'' +
                ", guestId='" + guestId + '\'' +
                '}';
    }
}
