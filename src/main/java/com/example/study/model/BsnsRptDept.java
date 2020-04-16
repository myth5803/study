package com.example.study.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class BsnsRptDept {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deptId;

    private Integer sectId;

    @Column(length = 4)
    private String deptCd;

    @Column(length = 100)
    private String viewNm;

    @Column(length = 6)
    private String insertEmpCd;

    @Temporal(TemporalType.TIMESTAMP)
    private Date insertDt;
}
