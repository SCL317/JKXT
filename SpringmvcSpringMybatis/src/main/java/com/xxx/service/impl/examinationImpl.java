package com.xxx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxx.dao.ExaminationMapper;
import com.xxx.model.Examination;
import com.xxx.service.Iexamination;

@Service
public class examinationImpl implements Iexamination {
	//注入dao层
	@Autowired
	public ExaminationMapper examinationMapper;

	@Override
	public boolean delete(Integer id) {
	
		return false;
	}

	@Override
	public boolean add(Examination examination) {
		examinationMapper.insert(examination);
		return true;
	}

	@Override
	public boolean update(Examination examination) {
		
		return false;
	}

	@Override
	public List<Examination> select(Integer id) {
		
		return null ;
	}
	
	
	
	
}
