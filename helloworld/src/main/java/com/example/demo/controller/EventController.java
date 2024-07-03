package com.example.demo.controller;

import com.example.demo.entity.Event;
import com.example.demo.mapper.EventMapper;
import com.example.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EventController {
    @Autowired
    private EventMapper eventMapper;

    // 添加
    @PostMapping("/event/add")
    public Result save(@RequestBody Event event){
        System.out.println(event);
        int i = eventMapper.insert(event);
        if(i>0){
            return Result.ok();
        }else{
            return Result.error();
        }
    }

    // 删除
    @DeleteMapping("/event/delete")
    public Result delete(@RequestParam String eventId){
        System.out.println(eventId);
        int i = eventMapper.deleteById(eventId);
        if(i>0){
            return Result.ok();
        }else{
            return Result.error();
        }
    }

    // 编辑
    @PostMapping("/event/edit")
    public Result edit(@RequestBody Event event){
        System.out.println(event);
        int i = eventMapper.updateById(event);
        if(i>0){
            return Result.ok();
        }else{
            return Result.error();
        }
    }
    // 返回所有
    @GetMapping("/event")
    public Result query(){
        List<Event> event = eventMapper.selectList(null);
        System.out.println(event);
        System.out.println("深圳");
        System.out.println("深圳");
        return Result.ok().data("items", event);
    }
}
