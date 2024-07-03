package com.example.demo.controller;

import com.example.demo.entity.Teamm;
import com.example.demo.mapper.TeamMapper;
import com.example.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TeamContoller {

    @Autowired
    private TeamMapper teamMapper;

    // 添加事件
    @PostMapping(value="/team/add")
    public Result save(@RequestBody Teamm teamm){
        System.out.println(teamm);
        int i = teamMapper.insert(teamm);
        if(i>0){
            return Result.ok();
        }else{
            return Result.error();
        }
    }

    // 删除事件
    @DeleteMapping("/team/delete")
    public Result delete(@RequestParam int teamId){
        System.out.println(teamId);
        int i = teamMapper.deleteById(teamId);
        if(i>0){
            return Result.ok();
        }else{
            return Result.error();
        }
    }

    // 编辑事件
    @PostMapping("/team/edit")
    public Result edit(@RequestBody Teamm teamm){
        System.out.println(teamm);
        int i = teamMapper.updateById(teamm);
        if(i>0){
            return Result.ok();
        }else{
            return Result.error();
        }
    }
    // 返回所有事件
    @GetMapping("/team")
    public Result query(){
        List<Teamm> teamm = teamMapper.selectList(null);
        System.out.println(teamm);
        return Result.ok().data("items", teamm);
    }
}
