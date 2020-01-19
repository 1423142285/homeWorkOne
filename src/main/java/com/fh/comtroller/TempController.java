package com.fh.comtroller;

import com.fh.entity.vo.DataTablesData;
import com.fh.entity.vo.TableSearch;
import com.fh.service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("temp")
@CrossOrigin
public class TempController {
    @Autowired
    private TempService tempService;

    //员工列表展示
    @PostMapping("queryTempList")
    public DataTablesData queryTempList(TableSearch search){

        DataTablesData data = tempService.queryTempList(search);

        return data;
    }

}
