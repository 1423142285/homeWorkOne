package com.fh.service;

import com.fh.entity.vo.DataTablesData;
import com.fh.entity.vo.TableSearch;

public interface TempService {
    DataTablesData queryTempList(TableSearch search);
}
