package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.entity.po.Temp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TempDao extends BaseMapper<Temp> {
}
