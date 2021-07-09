package com.propintellect.in.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.propintellect.in.entity.Banner;

public class PropintellectDAOimpl implements PropintellectDAO{
	
	//inject the SessionFactory object
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Banner> getBanners() {
		// TODO Auto-generated method stubsessionFactory
		//create the hibernate session object
		Session session=sessionFactory.getCurrentSession();
		
		//get the Details from the database
		Query<Banner> theBanner=session.createQuery("from Banner",Banner.class);
		
		List<Banner> banner=theBanner.getResultList();
		
		return banner;
	}
	

}
