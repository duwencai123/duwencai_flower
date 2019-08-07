package com.duwencai.flower.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duwencai.flower.dao.FlowerMapper;
import com.duwencai.flower.domain.Flower;
import com.duwencai.flower.service.FlowerService;
 

@Service
public class FlowerServiceImpl implements FlowerService {

	@Autowired
	private FlowerMapper mapper;
	@Override
	public List<Flower> getFlowerList(String fname) {
		// TODO Auto-generated method stub
		return mapper.getFlowerList(fname);
	}

	@Override
	public List getTypeList() {
		// TODO Auto-generated method stub
		return mapper.getTypeList();
	}

	@Override
	public void deleteFlower(Integer fid) {
		// TODO Auto-generated method stub
		mapper.deleteFlower(fid);
	}

	@Override
	public void addFlower(Flower flower) {
		// TODO Auto-generated method stub
		mapper.addFlower(flower);
	}

	@Override
	public void updateFlower(Flower flower) {
		// TODO Auto-generated method stub
		mapper.updateFlower(flower);
	}

	@Override
	public Flower getFlowerById(Integer fid) {
		// TODO Auto-generated method stub
		return mapper.getFlowerById(fid);
	}

}
