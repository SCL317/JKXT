package com.xxx.dao;

import java.util.List;

import com.xxx.model.Examination;

public interface ExaminationMapper {
    
	int deleteByPrimaryKey(Integer id);

    int insert(Examination record);

    Examination selectByPrimaryKey(Integer id);

    List<Examination> selectAll();

    int updateByPrimaryKey(Examination record);
}