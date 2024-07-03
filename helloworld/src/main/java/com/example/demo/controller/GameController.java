package com.example.demo.controller;

import com.example.demo.entity.Game;
import com.example.demo.mapper.GameMapper;
import com.example.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class GameController {
    @Autowired
    private GameMapper gameMapper;

    // 添加
    @PostMapping("/game/add")
    public Result save(@RequestBody Game game){
        System.out.println(game);
        int i = gameMapper.insert(game);
        if(i>0){
            return Result.ok();
        }else{
            return Result.error();
        }
    }

    // 删除
    @DeleteMapping("/game/delete")
    public Result delete(@RequestParam int matchId){
        System.out.println(matchId);
        int i = gameMapper.deleteById(matchId);
        if(i>0){
            return Result.ok();
        }else{
            return Result.error();
        }
    }

    // 编辑
    @PostMapping("/game/edit")
    public Result edit(@RequestBody Game game){
        System.out.println(game);
        int i = gameMapper.updateById(game);
        if(i>0){
            return Result.ok();
        }else{
            return Result.ok();
        }
    }
    // 返回所有
    @GetMapping("/game")
    public Result query(){
        List<Game> games = gameMapper.selectList(null);
        System.out.println(games);
        return Result.ok().data("items", games);
    }
}
