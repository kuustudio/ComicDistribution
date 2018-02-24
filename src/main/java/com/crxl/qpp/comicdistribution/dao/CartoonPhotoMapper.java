package com.crxl.qpp.comicdistribution.dao;

import com.crxl.qpp.comicdistribution.entity.CartoonPhoto;

public interface CartoonPhotoMapper {
    int deleteByPrimaryKey(String id);

    int insert(CartoonPhoto record);

    int insertSelective(CartoonPhoto record);

    CartoonPhoto selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CartoonPhoto record);

    int updateByPrimaryKey(CartoonPhoto record);
}