package com.fh.service.impl;

import com.fh.dao.TempDao;
import com.fh.service.TempService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TempServiceImpl implements TempService {
    @Resource
    private TempDao tempDao;
}
