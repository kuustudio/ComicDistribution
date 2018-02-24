package com.crxl.qpp.comicdistribution.dao;

import com.crxl.qpp.comicdistribution.entity.commentVeryOk;

public interface commentVeryOkMapper {
    int deleteByPrimaryKey(String id);

    int insert(commentVeryOk record);

    int insertSelective(commentVeryOk record);

    commentVeryOk selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(commentVeryOk record);

    int updateByPrimaryKey(commentVeryOk record);
}