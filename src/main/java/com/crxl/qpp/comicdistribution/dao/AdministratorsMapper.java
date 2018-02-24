package com.crxl.qpp.comicdistribution.dao;

import com.crxl.qpp.comicdistribution.entity.Administrators;

public interface AdministratorsMapper {
    int deleteByPrimaryKey(String id);

    int insert(Administrators record);

    int insertSelective(Administrators record);

    Administrators selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Administrators record);

    int updateByPrimaryKey(Administrators record);
}