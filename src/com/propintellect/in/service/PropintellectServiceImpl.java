package com.propintellect.in.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.propintellect.in.dao.PropintellectDAO;
import com.propintellect.in.entity.Banner;

@Service
public class PropintellectServiceImpl implements PropintellectService{
	
	//inject the DAO layer here
	private PropintellectDAO propintellectDAO;

	@Override
	@Transactional
	public List<Banner> getBanners() {
		// TODO Auto-generated method stub
		return propintellectDAO.getBanners();
	}

}
