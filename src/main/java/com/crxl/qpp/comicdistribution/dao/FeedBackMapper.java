package com.crxl.qpp.comicdistribution.dao;

import com.crxl.qpp.comicdistribution.entity.FeedBack;

public interface FeedBackMapper {
    int deleteByPrimaryKey(String id);

    int insert(FeedBack record);

    int insertSelective(FeedBack record);

    FeedBack selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(FeedBack record);

    int updateByPrimaryKey(FeedBack record);
}