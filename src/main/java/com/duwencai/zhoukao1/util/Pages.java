package com.duwencai.zhoukao1.util;

import org.springframework.ui.Model;

import com.github.pagehelper.PageInfo;

public class Pages {

	public static void page(int pageNum, PageInfo info, Model model,String url) {
		//如果當前頁<=1  上一页就是1
		if(pageNum<=1){
			info.setPrePage(1);
		}
		
		//如果当前页>=最后一页  尾页=总页数
		if(pageNum>=info.getPages()){
			info.setNextPage(info.getPages());
		}
		
		
		String fenye = "当前是" + pageNum + "/" + info.getPages() + "页--共" + 
						info.getTotal() + "条数据&nbsp;&nbsp;  <a href='selects?pageNum=1"+url+"'><input type='button' value='首页'/></a>&nbsp;&nbsp;"
						+ "<a href='selects?pageNum="+info.getPrePage()+""+url+"'><input type='button' value='上一页'/></a>&nbsp;&nbsp;"
						+ "<a href='selects?pageNum="+info.getNextPage()+""+url+"'><input type='button' value='下一页'/></a>&nbsp;&nbsp;"
						+ "<a href='selects?pageNum="+info.getPages()+""+url+"'><input type='button' value='尾页'/></a>";

		model.addAttribute("fenye", fenye);

	}

}
