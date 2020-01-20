package com.fh.service.impl;

import com.fh.dao.DeptDao;
import com.fh.dao.JobDao;
import com.fh.dao.LeaderDao;
import com.fh.dao.TempDao;
import com.fh.entity.po.Dept;
import com.fh.entity.po.Job;
import com.fh.entity.po.Leader;
import com.fh.entity.po.Temp;
import com.fh.entity.vo.DataTablesData;
import com.fh.entity.vo.TableSearch;
import com.fh.entity.vo.TempSer;
import com.fh.service.TempService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TempServiceImpl implements TempService {
    @Resource
    private TempDao tempDao;
    @Resource
    private JobDao jobDao;
    @Resource
    private DeptDao deptDao;
    @Resource
    private LeaderDao leaderDao;

    @Override
    public DataTablesData queryTempList(TableSearch search) {
        long count = tempDao.queryCount();
        List<TempSer> list = tempDao.queryTempList(search);
        DataTablesData data = new DataTablesData();
        data.setData(list);
        data.setDraw(search.getDraw());
        data.setRecordsFiltered((int)count);
        data.setRecordsTotal((int)count);
        return data;
    }

    @Override
    public List<Job> queryJobList() {
        return jobDao.selectList(null);
    }

    @Override
    public List<Dept> queryDeptList() {
        return deptDao.selectList(null);
    }

    @Override
    public List<Leader> queryLeaderList() {
        return leaderDao.selectList(null);
    }

    @Override
    public void addTemp(Temp temp) {
        tempDao.insert(temp);
    }

    @Override
    public List<Temp> queryTempName(String name, Integer deptId) {
        return tempDao.queryTempName(name,deptId);
    }
}
