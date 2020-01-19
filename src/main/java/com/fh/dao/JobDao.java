package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.entity.po.Job;
import com.fh.entity.po.Temp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JobDao extends BaseMapper<Job> {
}
