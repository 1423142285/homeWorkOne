package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.entity.po.Dept;
import com.fh.entity.po.Job;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptDao extends BaseMapper<Dept> {
}
