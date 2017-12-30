package com.etcxm.mapper;

import com.etcxm.domain.TDept;
import java.util.List;

public interface TDeptMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TDept record);

    TDept selectByPrimaryKey(Long id);

    List<TDept> selectAll();

    int updateByPrimaryKey(TDept record);
}