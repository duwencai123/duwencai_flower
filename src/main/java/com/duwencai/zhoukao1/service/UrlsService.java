package com.duwencai.zhoukao1.service;

import java.util.List;

import com.duwencai.zhoukao1.domain.Urls;
import com.duwencai.zhoukao1.vo.UrlsVO;
/**
 * 
 * @ClassName: UrlsService 
 * @Description: TODO 链接service
 * @author:lq 
 * @date: 2019年8月11日 上午11:08:47
 */
public interface UrlsService {
	
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
