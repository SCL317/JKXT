package com.xxx.service;

import java.util.List;

import com.xxx.model.Examination;

public interface Iexamination {
	
	boolean delete(Integer id);
	
	boolean add(Examination examination);
	
	boolean update(Examination examination);
	
	List<Examination> select(Integer id);
	
}
