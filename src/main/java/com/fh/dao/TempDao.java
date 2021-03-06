package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.entity.po.Temp;
import com.fh.entity.vo.TableSearch;
import com.fh.entity.vo.TempSer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TempDao extends BaseMapper<Temp> {
    long queryCount();

    List<TempSer> queryTempList(TableSearch search);

    List<Temp> queryTempName(@Param("name") String name, @Param("deptId") Integer deptId);
}
