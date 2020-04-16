package com.example.study.controller;

import com.example.study.dto.DeptDto;
import com.example.study.model.Dept;
import com.example.study.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class DeptController extends RootController {

    @Autowired
    DeptService deptService;

    @PostMapping("/dept")
    private ResponseEntity<DeptDto> saveDept(@Valid @RequestBody DeptDto deptDto) {

        Dept request = modelMapper.map(deptDto, Dept.class);

        Dept saveDept = deptService.save(request);

        DeptDto response = modelMapper.map(saveDept, DeptDto.class);

        return ResponseEntity.ok(response);

    }

}
