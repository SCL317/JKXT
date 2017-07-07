package com.xxx.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.xxx.model.Examination;
import com.xxx.service.IexaminationService;

@Controller()
@RequestMapping("/examination")
public class examinationController {
	
	@Autowired
	public IexaminationService iexaminationService;
	
	//添加试题
	@RequestMapping(value="/add",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView addExam(HttpServletRequest request,HttpServletResponse response,Examination examination){
		System.out.println("addExam....");
		iexaminationService.add(examination);
		return toHomePage();
	}
	
	//删除单个试题
	@RequestMapping(value="/delete/{id}",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView deleteExamOne(HttpServletRequest request,HttpServletResponse response,@PathVariable Integer id){
		System.out.println("deleteExamOne....");
		List<Integer> ids =new ArrayList<Integer>();
		ids.add(id);
		iexaminationService.delete(ids);
		return toHomePage();
	}
	
	//删除多个试题
		@RequestMapping(value="/delete",method={RequestMethod.GET,RequestMethod.POST})
		public ModelAndView deleteExam(HttpServletRequest request,HttpServletResponse response){
			String[] ids =request.getParameterValues("ids");
			if (null !=ids) {
				List<Integer> list =new ArrayList<Integer>();
				for (int i = 0;i<ids.length;i++) {
					list.add(Integer.parseInt(ids[i]));
					iexaminationService.delete(list);
				}
			}
			return toHomePage();
		}
	
	//更新试题
	@RequestMapping(value="/update",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView updateExam(HttpServletRequest request,HttpServletResponse response,Examination examination){
		iexaminationService.update(examination);
		return toHomePage();

	}
	
	//查询试题
	@RequestMapping(value="/selectAll",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView selectExam(HttpServletRequest request,HttpServletResponse response,Integer id){
		iexaminationService.selectAll();
		return toHomePage();
	}
	
	//查询试题
		@RequestMapping(value="/selectOne/{id}",method={RequestMethod.GET,RequestMethod.POST})
		public ModelAndView selectExamOne(HttpServletRequest request,HttpServletResponse response,@PathVariable Integer id){
			Examination examination = iexaminationService.selectOne(id);
			ModelAndView mv = new ModelAndView();
			mv.addObject("examlist", examination);
			mv.setViewName("updateExam");
			return mv;
		}
	
	private ModelAndView toHomePage() {
		ModelAndView modelAndView =new ModelAndView();
		List<Examination> list=iexaminationService.selectAll();
		modelAndView.addObject("list",list);
		modelAndView.setViewName("ExamHome");
	    return modelAndView;
		
	}

}
