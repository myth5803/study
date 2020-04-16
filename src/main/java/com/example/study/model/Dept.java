package com.example.study.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Dept {
    @Id
    @Column(length = 4)
    private String deptCd;

    @Column(length =100)
    private String deptNm;

    @Column(length = 4)
    private String sectCd;

    @Column(length =100)
    private String sectNm;

    @Column(length = 4)
    private String coCd;

    @Column(length = 8)
    private String toDt;
}
