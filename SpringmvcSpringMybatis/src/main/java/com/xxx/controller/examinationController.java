package com.xxx.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xxx.model.Examination;
import com.xxx.service.Iexamination;

@Controller()
@RequestMapping("/examination")
public class examinationController {
	
	@Autowired
	public Iexamination iexamination;
	
	//添加试题
	@RequestMapping(value="/add",method={RequestMethod.GET,RequestMethod.POST})
	public String addExam(HttpServletRequest request,HttpServletResponse response,Examination examination){
		System.out.println("addExam....");
		iexamination.add(examination);
		return "";
	}
	
	//删除试题
	@RequestMapping(value="/delete",method={RequestMethod.GET,RequestMethod.POST})
	public String deleteExam(HttpServletRequest request,HttpServletResponse response,Integer id){
		iexamination.delete(id);
		return "";
	}
	
	//更新试题
	@RequestMapping(value="/update",method={RequestMethod.GET,RequestMethod.POST})
	public String updateExam(HttpServletRequest request,HttpServletResponse response,Examination examination){
		iexamination.update(examination);
		return "";
	}
	
	//查询试题
	@RequestMapping(value="/select",method={RequestMethod.GET,RequestMethod.POST})
	public String selectExam(HttpServletRequest request,HttpServletResponse response,Integer id){
		iexamination.select(id);
		return "";
	}

}
