package com.duwencai.zhoukao1.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.duwencai.zhoukao1.dao.UrlsMapper;
import com.duwencai.zhoukao1.domain.Urls;
import com.duwencai.zhoukao1.service.UrlsService;
import com.duwencai.zhoukao1.vo.UrlsVO;

@Service
public class UrlsServiceImpl implements UrlsService {

	@Resource
	private UrlsMapper urlsMapper;
	@Override
	public int insert(Urls urls) {
		// TODO Auto-generated method stub
		return urlsMapper.insert(urls);
	}

	@Override
	public List<Urls> selects(UrlsVO urlsVO) {
		// TODO Auto-generated method stub
		return urlsMapper.selects(urlsVO);
	}

}
