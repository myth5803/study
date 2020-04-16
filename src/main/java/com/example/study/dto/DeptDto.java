package com.example.study.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class DeptDto {

    @Size(min = 4, max = 4, message = "부서코드 길이를 확인하세요.")
    @JsonProperty("dept")
    private String deptCd;

    @NotBlank(message = "부서명을 입력하세요.")
    @Size(max = 6, message = "부서명을 길이를 확인하세요.")
    @JsonProperty("deptName")
    private String deptNm;

    @Size(min = 4, max = 4, message = "부문코드 길이를 확인하세요.")
    @JsonProperty("sect")
    private String sectCd;

    @NotBlank(message = "부문명을 입력하세요.")
    @Size(max = 100, message = "부문명을 길이를 확인하세요.")
    @JsonProperty("sectName")
    private String sectNm;

    @Size(min = 4, max = 4, message = "회사코드 길이를 확인하세요.")
    @JsonProperty("co")
    private String coCd;


}
