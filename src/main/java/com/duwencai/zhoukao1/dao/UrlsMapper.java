package com.duwencai.zhoukao1.dao;

import java.util.List;

import com.duwencai.zhoukao1.domain.Urls;
import com.duwencai.zhoukao1.vo.UrlsVO;

public interface UrlsMapper {
	/**
	 * 
	 * @Title: insert 
	 * @Description: TODO
	 * @param urls
	 * @return
	 * @return: int
	 */
	int insert(Urls urls);

	/**
	 * 
	 * @Title: selects 
	 * @Description: TODO 模糊查询 排序
	 * @param urls
	 * @return
	 * @return: List<Urls>
	 */
	List<Urls> selects(UrlsVO urlsVO  );
}
