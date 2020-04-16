package com.example.study.controller;

import com.example.study.service.BsnsRptDeptService;
import com.example.study.service.BsnsRptSectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BsnsRptController {

    @Autowired
    BsnsRptSectService bsnsRptSectService;

    @Autowired
    BsnsRptDeptService bsnsRptDeptService;


}
