package com.duwencai.zhoukao1.service.impl;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.duwencai.common.utils.PatternUtil;
import com.duwencai.common.utils.StringUtil;
import com.duwencai.zhoukao1.dao.UrlsMapper;
import com.duwencai.zhoukao1.domain.Urls;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class UrlsServiceImplTest {

	@Resource
	UrlsMapper urlsMapper;

	@Test
	public void testInsert() {
		String urls = "http://news.cnstock.com/news,yw-201908-4413224.htm|http://news.cnstock.com/news,yw-201908-5513224.htm|http://news.cnstock.com/news,yw-201907-6613224.htm|http://news.cnstock.com/news,yw-201907-7713224.htm|http://news.cnstock.com/news,yw-201907-8813224.htm|http://news.cnstock.com/news,yw-201906-9913224.htm|http://news.cnstock.com/news,yw-201906-1013224.htm|http://news.cnstock.com/news,yw-201906-1113224.htm|http://news.cnstock.com/news,yw-201906-1213224.htm|http://news.cnstock.com/news,yw-201905-1313224.htm|http://news.cnstock.com/news,yw-201905-1413224.htm|http://news.cnstock.com/news,yw-201905-1513224.htm|http://news.cnstock.com/news,yw-201905-1613224.htm";

		String[] split = StringUtil.split(urls, "\\|");
		for (String url : split) {
			Date date = PatternUtil.getRqFromUrl(url);
			SimpleDateFormat df = new SimpleDateFormat("yyyyMM");
			Urls u = new Urls(url, df.format(date), PatternUtil.getNumberFromUrl(url));
			urlsMapper.insert(u);

		}
 	}

	@Test
	public void testSelects() {
		String urls = "http://news.cnstock.com/news,yw-201908-4413224.htm";
		Integer integer = PatternUtil.getRqFromUrl01(urls, 1);
		System.out.println(integer);

	}

}
