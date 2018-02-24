package com.crxl.qpp.comicdistribution.dao;

import com.crxl.qpp.comicdistribution.entity.CartoonSetComment;

public interface CartoonSetCommentMapper {
    int deleteByPrimaryKey(String id);

    int insert(CartoonSetComment record);

    int insertSelective(CartoonSetComment record);

    CartoonSetComment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CartoonSetComment record);

    int updateByPrimaryKey(CartoonSetComment record);
}