package com.propintellect.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.propintellect.in.entity.Banner;
import com.propintellect.in.service.PropintellectService;


@Controller
@RequestMapping("/student")
public class HomeController {
  
	@Autowired
	private PropintellectService propintellectService;
	
	@RequestMapping("/banner")
	public String addBannerList(Model theModel)
	{
		List<Banner> banner=propintellectService.getBanners();
		
		 theModel.addAttribute("banners", banner);
		return "banner";
	}

	@RequestMapping("/deletebanner")
   public String deleteBanner(@RequestParam("id") int theId ,Model theModel)
   {
		//get the banner from our service
		//Banner theBanner=serviceDAO.getBanner(theId);
		
		// theModel.addAttribute("banner",theBanner);
		return null;
   }
	
	@RequestMapping("/addbanner")
	public String addNewBanner(Model theModel)
	{
		 
		return "add-new-banner";
	}
	
	@RequestMapping("/featuredproperty")
	public String addfeaturedProperty(Model theModel)
	{
		return "featured-property";
	}
	
	@RequestMapping("/addfeaturedproperty")
	public String addNewFeaturedProperty(Model theModel)
	{
		return "add-new-featured-property";
	}
	
	@RequestMapping("/propertyforsale")
	public String addPropertyForSale(Model theModel)
	{
		return "property-for-sale";
	}
	@RequestMapping("/addpropertyforsale")
	public String addNewPropertyForSale(Model theModel)
	{
		return "add-new-property-for-sale";
	}
	
	@RequestMapping("/featuredlocation")
	public String addFeaturedLocation(Model theModel)
	{
		return "featured-location";
	}
	@RequestMapping("/editbanner")
	public String editBanner(Model theModel)
	{
		return "edit-banner";
	}
}