package com.fh.comtroller;

import com.fh.entity.po.Dept;
import com.fh.entity.po.Job;
import com.fh.entity.po.Leader;
import com.fh.entity.po.Temp;
import com.fh.entity.vo.DataTablesData;
import com.fh.entity.vo.TableSearch;
import com.fh.service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    //加载岗位信息
    @PostMapping("queryJobList")
    public Map queryJobList(){
        Map map = new HashMap();
        try {
            List<Job> list = tempService.queryJobList();
            map.put("data",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

    //加载部门信息
    @PostMapping("queryDeptList")
    public Map queryDeptList(){
        Map map = new HashMap();
        try {
            List<Dept> list = tempService.queryDeptList();
            map.put("data",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

    //加载领导信息
    @PostMapping("queryLeaderList")
    public Map queryLeaderList(){
        Map map = new HashMap();
        try {
            List<Leader> list = tempService.queryLeaderList();
            map.put("data",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

    //验证员工不存在
    @PostMapping("queryTempName")
    public Map queryTempName(String name,Integer deptId){
        Map map = new HashMap();
        try {
            List<Temp> list = tempService.queryTempName(name,deptId);
            if(list.size()>0){
                map.put("code",202);
            }else {
                map.put("code",200);
            }
        }catch (Exception e){
            e.printStackTrace();;
            map.put("code",201);
        }
        return map;
    }

    //新增员工信息
    @PostMapping("addTemp")
    public Map addTemp(Temp temp){
        Map map = new HashMap();
        try {
            tempService.addTemp(temp);
            map.put("code",200);
        }catch (Exception e){
            e.printStackTrace();;
            map.put("code",201);
            map.put("remark",e.getMessage());
        }
        return map;
    }
}
