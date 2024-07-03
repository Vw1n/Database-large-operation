package com.example.demo.controller;

import com.example.demo.entity.Player;
import com.example.demo.mapper.PlayerMapper;
import com.example.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PlayerController {

    @Autowired
    private PlayerMapper playerMapper;

    // 添加事件
    @PostMapping("/player/add")
    public Result save(@RequestBody Player player){
        System.out.println(player);
        int i = playerMapper.insert(player);
        if(i>0){
            return Result.ok();
        }else{
            return Result.error();
        }
    }

    // 删除事件
    @DeleteMapping("/player/delete")
    public Result delete(@RequestParam int playerId){
        System.out.println(playerId);
        int i = playerMapper.deleteById(playerId);
        if(i>0){
            return Result.ok();
        }else{
            return Result.error();
        }
    }

    // 编辑事件
    @PostMapping("/player/edit")
    public Result edit(@RequestBody Player player){
        System.out.println(player);
        int i = playerMapper.updateById(player);
        if(i>0){
            return Result.ok();
        }else{
            return Result.error();
        }
    }
    // 返回所有事件
    @GetMapping("/player")
    public Result query(){
        List<Player> player = playerMapper.selectList(null);
        System.out.println(player);
        return Result.ok().data("items", player);
    }
}
