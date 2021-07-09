package com.propintellect.in.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;
import com.propintellect.in.service.PropintellectService;


@Controller
@RequestMapping("/propintellect/showBannerForm")
public class BannerController {
//	
//	@RequestMapping("/processBannerForm")
//	public String processBannerForm(@ModelAttribute("banner") Banner theBanner,HttpServletRequest request)
//	{
//		   com.propintellect.in.entity.Banner banner=new com.propintellect.in.entity.Banner();
//		   banner.setId(theBanner.getId());
//		   banner.setCode(theBanner.getCode());
//		   banner.setImage(theBanner.getImage());
//		   banner.setCaption1(theBanner.getCaption1());
//		   banner.setCaption2(theBanner.getCaption2());
//		   banner.setCaption3(theBanner.getCaption3());
//		   banner.setCaption4(theBanner.getCaption4());
//		   System.out.println(theBanner.getCaption4());
//		   banner.setTypeofprop(theBanner.getTypeofprop());
//		   banner.setPrice(theBanner.getPrice());
//		   banner.setSqft(theBanner.getSqft());
//		   banner.setPropLink(theBanner.getPropLink());
//		   
//		   propintellectService.saveBanner(banner);
//		 
////		   
////		   if(!banner.getImage().getOriginalFilename().equals(""))
////		   {
////			   FileUploadUtility.uploadFile(request,banner.getImage(),banner.getCode());
////		   }
//		  return "redirect:/propintellect/showbanner";
//	}
	
//	@GetMapping("showFormForUpdate")
//	public String showFormForUpdate(@RequestParam("bannerId") int theId,Model theModel)
//	{
//		//get the Banner from our service
//		Banner theBanner=propintellectService.getBanner(theId);
//		//set the customer Attribute to prepollute the form
//		theModel.addAttribute("banner",theBanner);
//		//send over to our form 
//		return "add-new-banner";
//	}
}
