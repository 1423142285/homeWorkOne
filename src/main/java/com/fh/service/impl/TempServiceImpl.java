package com.fh.service.impl;

import com.fh.dao.TempDao;
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
}
