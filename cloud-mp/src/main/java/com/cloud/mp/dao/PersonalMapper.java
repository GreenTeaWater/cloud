package com.cloud.mp.dao;

import org.springframework.stereotype.Repository;

import com.cloud.mp.common.model.Personal;

@Repository
public interface PersonalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Personal record);

    int insertSelective(Personal record);

    Personal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Personal record);

    int updateByPrimaryKey(Personal record);
}