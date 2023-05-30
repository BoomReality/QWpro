package com.apex.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    private Integer   id;
    private String    userName;
    private String    name;
    private short     gender;
    private String    image;
    private short     job;
    private LocalDate entryDate;
    private int deptId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
