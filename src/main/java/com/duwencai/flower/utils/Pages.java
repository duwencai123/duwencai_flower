package com.duwencai.flower.utils;

import org.springframework.ui.Model;

import com.github.pagehelper.PageInfo;

public class Pages {

	public static void page(int pageNum, PageInfo info, Model model,String url) {
		 
		if(pageNum<=1){
			info.setPrePage(1);
		}
		
		 
		if(pageNum>=info.getPages()){
			info.setNextPage(info.getPages());
		}
		
		
		String fenye = "当前是" + pageNum + "/" + info.getPages() + "页--共" + 
						info.getTotal() + "条数据&nbsp;&nbsp;  <a href='list?pageNum=1"+url+"'><input type='button' value='首页'/></a>&nbsp;&nbsp;"
						+ "<a href='list?pageNum="+info.getPrePage()+""+url+"'><input type='button' value='上一页'/></a>&nbsp;&nbsp;"
						+ "<a href='list?pageNum="+info.getNextPage()+""+url+"'><input type='button' value='下一页'/></a>&nbsp;&nbsp;"
						+ "<a href='list?pageNum="+info.getPages()+""+url+"'><input type='button' value='尾页'/></a>";

		model.addAttribute("fenye", fenye);

	}

}
