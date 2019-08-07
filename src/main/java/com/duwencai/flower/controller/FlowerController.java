package com.duwencai.flower.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.duwencai.flower.domain.Flower;
import com.duwencai.flower.service.FlowerService;
import com.duwencai.flower.utils.Pages;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
 
@Controller
public class FlowerController {

	@Autowired
	private FlowerService service;
	
	@RequestMapping("list")
	public String getFlowerList(@RequestParam(defaultValue="1")int pageNum, Model model,@RequestParam(defaultValue="")String fname) {
		PageHelper.startPage(pageNum, 3);
		List<Flower> list = service.getFlowerList(fname);
		PageInfo info = new PageInfo(list);
		Pages.page(pageNum, info, model, "&fname="+fname+"");
		model.addAttribute("list", list);
		model.addAttribute("fname", fname);
		return "list";
	}
	@ResponseBody
	@RequestMapping("del")
	public boolean del(Integer fid) {
		try {
			service.deleteFlower(fid);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	//去添加
	@RequestMapping("toAdd")
	public String toAdd() {
		return "add";
	}
	
	//查询对象
	@ResponseBody
	@RequestMapping("getTypeList")
	public Object getTypeList() {
		List list = service.getTypeList();
		return list;
	}
	
	@RequestMapping("add")
	@ResponseBody
	public boolean add(Flower flower) {
		try {
			service.addFlower(flower);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	@RequestMapping("toUpdate")
	public String toUpdate(Integer fid,Model model) {
		List typeList = service.getTypeList();
		model.addAttribute("typeList", typeList);
		model.addAttribute("fid", fid);
		return "update";
	}
	
	@RequestMapping("toDetailed")
	public String toDetailed(Integer fid,Model model) {
		List typeList = service.getTypeList();
		model.addAttribute("typeList", typeList);
		model.addAttribute("fid", fid);
		return "update2";
	}
	
	@ResponseBody
	@RequestMapping("getFlowerById")
	public Object getFlowerById(Integer fid) {
		Flower flower = service.getFlowerById(fid);
		return flower;
	}
	
	@RequestMapping("update")
	@ResponseBody
	public boolean update(Flower flower) {
		try {
			service.updateFlower(flower);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
}
