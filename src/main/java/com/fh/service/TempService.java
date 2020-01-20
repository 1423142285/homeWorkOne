package com.fh.service;

import com.fh.entity.po.Dept;
import com.fh.entity.po.Job;
import com.fh.entity.po.Leader;
import com.fh.entity.po.Temp;
import com.fh.entity.vo.DataTablesData;
import com.fh.entity.vo.TableSearch;

import java.util.List;

public interface TempService {
    DataTablesData queryTempList(TableSearch search);

    List<Job> queryJobList();

    List<Dept> queryDeptList();

    List<Leader> queryLeaderList();

    void addTemp(Temp temp);

    List<Temp> queryTempName(String name, Integer deptId);
}
