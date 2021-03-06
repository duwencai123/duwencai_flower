package com.duwencai.flower.service;

import java.util.List;

import com.duwencai.flower.domain.Flower;
 

public interface FlowerService {
	
	/**
	 * 
	 * @Title: getFlowerList 
	 * @Description: TODO
	 * @param fname
	 * @return
	 * @return: List<Flower>
	 */
	List<Flower> getFlowerList(String fname);
	/**
	 * 
	 * @Title: getTypeList 
	 * @Description: TODO
	 * @return
	 * @return: List
	 */
	List getTypeList();
	/**
	 * 
	 * @Title: deleteFlower 
	 * @Description: TODO
	 * @param fid
	 * @return: void
	 */
	void deleteFlower(Integer fid);
	
	/**
	 * 
	 * @Title: addFlower 
	 * @Description: TODO
	 * @param flower
	 * @return: void
	 */
	void addFlower(Flower flower);
	/**
	 * 
	 * @Title: updateFlower 
	 * @Description: TODO
	 * @param flower
	 * @return: void
	 */
	void updateFlower(Flower flower);
	/**
	 * 
	 * @Title: getFlowerById 
	 * @Description: TODO
	 * @param fid
	 * @return
	 * @return: Flower
	 */
	Flower getFlowerById(Integer fid);


}
