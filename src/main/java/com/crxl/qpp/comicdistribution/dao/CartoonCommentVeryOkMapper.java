package com.crxl.qpp.comicdistribution.dao;

import com.crxl.qpp.comicdistribution.entity.CartoonCommentVeryOk;

public interface CartoonCommentVeryOkMapper {
    int deleteByPrimaryKey(String id);

    int insert(CartoonCommentVeryOk record);

    int insertSelective(CartoonCommentVeryOk record);

    CartoonCommentVeryOk selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CartoonCommentVeryOk record);

    int updateByPrimaryKey(CartoonCommentVeryOk record);
}