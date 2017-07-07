package com.xxx.service;

import java.util.List;

import com.xxx.model.Examination;

public interface IexaminationService {
	

	//删除
	boolean delete(List<Integer> ids);
	//增加
	boolean add(Examination examination);
	//更新
	boolean update(Examination examination);
	//获取全部
	List<Examination> selectAll();
	
	// 使用id去获取
	Examination selectOne(Integer id);
	
	
}
