package com.crxl.qpp.comicdistribution.dao;

import com.crxl.qpp.comicdistribution.entity.CartoonComment;

public interface CartoonCommentMapper {
    int deleteByPrimaryKey(String id);

    int insert(CartoonComment record);

    int insertSelective(CartoonComment record);

    CartoonComment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CartoonComment record);

    int updateByPrimaryKey(CartoonComment record);
}