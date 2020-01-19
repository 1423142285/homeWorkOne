package com.fh.comtroller;

import com.fh.service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("temp")
@CrossOrigin
public class TempController {
    @Autowired
    private TempService tempService;



}
