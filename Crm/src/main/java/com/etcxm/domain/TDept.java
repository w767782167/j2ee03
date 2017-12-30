package com.etcxm.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TDept {
    private Long id;
    private String sn;
    private String name;
    private Long managerId;
    private Long parentId;
    private Boolean state;

   
}