package com.xxx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xxx.model.Examination;

public interface ExaminationMapper {
	//删除多个
	int deleteByIds(@Param("ids") List<Integer> ids);
    //删除单个
	int deleteByPrimaryKey(Integer id);
    //插入
    int insert(Examination record);
    //查询单个
    Examination selectByPrimaryKey(Integer id);
    //查询多个
    List<Examination> selectAll();
    //更新
    int updateByPrimaryKey(Examination record);
}