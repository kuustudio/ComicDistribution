package com.crxl.qpp.comicdistribution.dao;

import com.crxl.qpp.comicdistribution.entity.CartoonType;

public interface CartoonTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(CartoonType record);

    int insertSelective(CartoonType record);

    CartoonType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CartoonType record);

    int updateByPrimaryKey(CartoonType record);
}