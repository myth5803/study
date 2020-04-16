package com.example.study.service;

import com.example.study.model.Dept;
import com.example.study.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptService {

    @Autowired
    DeptRepository deptRepository;

    public Dept save(final Dept dept) {
        return deptRepository.save(dept);
    }
}
