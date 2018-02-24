package com.crxl.qpp.comicdistribution.dao;

import com.crxl.qpp.comicdistribution.entity.CartoonTask;

public interface CartoonTaskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CartoonTask record);

    int insertSelective(CartoonTask record);

    CartoonTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CartoonTask record);

    int updateByPrimaryKey(CartoonTask record);
}