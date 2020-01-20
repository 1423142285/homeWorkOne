package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.entity.po.Leader;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LeaderDao extends BaseMapper<Leader> {
}
