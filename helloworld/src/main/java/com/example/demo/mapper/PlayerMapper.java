package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Player;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PlayerMapper extends BaseMapper<Player> {
}
