package com.xxx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxx.dao.ExaminationMapper;
import com.xxx.model.Examination;
import com.xxx.service.IexaminationService;

@Service
public class examinationServiceImpl implements IexaminationService {
	//注入dao层
	@Autowired
	public ExaminationMapper examinationMapper;

	@Override
	public boolean add(Examination examination) {
		examinationMapper.insert(examination);
		return true;
	}

	@Override
	public boolean update(Examination examination) {
		examinationMapper.updateByPrimaryKey(examination);
		return true;
	}

	@Override
	public List<Examination> selectAll() {
		List<Examination> list= examinationMapper.selectAll();
		return list;
	}

	@Override
	public boolean delete(List<Integer> ids) {
		examinationMapper.deleteByIds(ids);
		return true;
	}

	@Override
	public Examination selectOne(Integer id) {
		examinationMapper.selectByPrimaryKey(id);
		return null;
	}

	
}
