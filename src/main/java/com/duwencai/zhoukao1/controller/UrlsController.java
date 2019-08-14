package com.duwencai.zhoukao1.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.duwencai.zhoukao1.domain.Urls;
import com.duwencai.zhoukao1.service.UrlsService;
import com.duwencai.zhoukao1.util.Pages;
import com.duwencai.zhoukao1.vo.UrlsVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class UrlsController {

	@Resource
	private UrlsService urlsService;
	@RequestMapping(value="selects")
	public String selects(/*@RequestParam(defaultValue="")String url,@RequestParam(defaultValue="1")int pageNum ,*/UrlsVO urlsVO,Model model) {
		 /*PageHelper.startPage(pageNum, 6); */
		List<Urls> urls = urlsService.selects(urlsVO);
		/* PageInfo<Urls> info = new PageInfo<Urls>(urls);
		Pages.page(pageNum, info, model, "&url="+url+""); */
		model.addAttribute("urls", urls);
		model.addAttribute("urlsVO", urlsVO);
		
		return "list";
	}
}
