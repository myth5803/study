package com.example.study.repository;

import com.example.study.model.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepository extends JpaRepository<Dept, String> {
}
