package com.etcxm.mapper;

import com.etcxm.domain.TEmployee;
import com.etcxm.query.QueryObject;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TEmployeeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TEmployee record);

    TEmployee selectByPrimaryKey(Long id);

    List<TEmployee> selectAll();

    int updateByPrimaryKey(TEmployee record);
    
    Long queryByPageCount(QueryObject qo);
    List<TEmployee> queryByPageList(QueryObject qo);

	TEmployee queryByLogin(@Param("username")String username, @Param("password")String password);
}