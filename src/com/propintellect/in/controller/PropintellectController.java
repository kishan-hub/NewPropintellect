package com.propintellect.in.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.propintellect.in.entity.Banner;
import com.propintellect.in.entity.Product;
import com.propintellect.in.file.FileUpload;
import com.propintellect.in.file.FileUploadInDb;
import com.propintellect.in.service.PropintellectService;

@Controller
@RequestMapping("/propintellect")
public class PropintellectController {
	static ModelAndView modelViewObj;
	static FileUpload fileUploadObj;
	//inject the PropintellectService object
    @Autowired
	private PropintellectService propintellectService;
    

	@RequestMapping("/showbanner")
	public String showBanner(Model theModel)
	{
      List<Banner> banner=propintellectService.getBanners();	
     theModel.addAttribute("banners",banner);
		return "banner";
	}

	@RequestMapping(value = {"/addBannerForm", "add-new-banner"}, method = RequestMethod.GET)
	 public ModelAndView showUploadFileForm(ModelMap model) {
		modelViewObj = new ModelAndView("add-new-banner");
			return  modelViewObj;
	 }
	
	@RequestMapping(value = "addBannerDetail", method = RequestMethod.POST)
	public String  saveUploadedFileInDatabase(HttpServletRequest request) throws IllegalStateException, IOException {
		
		String image=request.getParameter("image");
		String caption1=request.getParameter("caption1");
		String caption2=request.getParameter("caption2");
		String caption3=request.getParameter("caption3");
		String caption4=request.getParameter("caption4");
		String typeofprop=request.getParameter("typeofprop");
		String price=request.getParameter("price");
		String sqft=request.getParameter("sqft");
		String proplink=request.getParameter("dlink");
		
		com.propintellect.in.controller.Banner banner=new com.propintellect.in.controller.Banner();
		banner.setImage(image);
		banner.setCaption1(caption1);
        banner.setCaption2(caption2);
        banner.setCaption3(caption3);
        banner.setCaption4(caption4);
        banner.setTypeofprop(typeofprop);
        banner.setPrice(price);
        banner.setSqft(sqft);
        banner.setPropLink(proplink);	
       
        //set the value to entity object
        Banner theBanner=new Banner();
         theBanner.setImage(banner.getImage());
         theBanner.setCaption1(banner.getCaption1());
         theBanner.setCaption2(banner.getCaption2());
         theBanner.setCaption3(banner.getCaption3());
         theBanner.setCaption4(banner.getCaption4());
         theBanner.setTypeofprop(banner.getTypeofprop());
         theBanner.setPrice(banner.getPrice());
         theBanner.setSqft(banner.getSqft());
         theBanner.setPropLink(banner.getPropLink());
         
         //send the object to service layer
         propintellectService.saveBanner(theBanner);

		return "redirect:/propintellect/showbanner";
		}
	
	  @RequestMapping(value = {"/updateBannerdata", "edit-banner1"}, method = RequestMethod.GET)
	  public ModelAndView showUpdateForm(HttpServletRequest request,ModelMap model) {
		modelViewObj = new ModelAndView("edit-banner1");
		
		String id=request.getParameter("bannerId");
        //convert the Id into Int format
    	int theId=Integer.parseInt(id);
    	System.out.println(id);
    	
    	//get the data from database of particular Id
    	
    	 Banner theBanner=propintellectService.getBanner(theId);
    	       int did=theBanner.getId();
    	       String dimage=theBanner.getImage();
    	       String dcaption1=theBanner.getCaption1();
    	       String dcaption2=theBanner.getCaption2();
    	       String dcaption3=theBanner.getCaption3();
    	       String dcaption4=theBanner.getCaption4();
    	       String dtypeofProp=theBanner.getTypeofprop();
    	       String dprice=theBanner.getPrice();
    	       String sqft=theBanner.getSqft();
    	       String dlink=theBanner.getPropLink();
    	       System.out.println(dimage +"  "+ dcaption1 +" "+dcaption2+" "+dcaption3+" "+dcaption4 +"  "+dtypeofProp);
    	       System.out.println(dprice+ "  "+sqft +"  "+dlink);
    	   //send the Banner data to the given form
    	    request.setAttribute("id", did);    
            request.setAttribute("image",dimage);
            request.setAttribute("caption1", dcaption1);
            request.setAttribute("caption2", dcaption2);
            request.setAttribute("caption3", dcaption3);
            request.setAttribute("caption4", dcaption4);
            request.setAttribute("typeofProp", dtypeofProp);
            request.setAttribute("price", dprice);
            request.setAttribute("sqft", sqft);
            request.setAttribute("dlink", dlink);
            return modelViewObj;
	 }
	  
    @RequestMapping(value = "addBannerDetail", method = RequestMethod.GET)
    public String updateUploadedFileInDatabase(HttpServletRequest request) throws IllegalStateException, IOException
    {  
    	String id=request.getParameter("uid");
    	int sid=Integer.parseInt(id);
    	String image=request.getParameter("uimage");
    	String caption1=request.getParameter("ucaption1");
    	String caption2=request.getParameter("ucaption2");
    	String caption3=request.getParameter("ucaption3");
    	String caption4=request.getParameter("ucaption4");
    	String typeofprop=request.getParameter("utypofprop");
    	String price=request.getParameter("uprice");
    	String sqft=request.getParameter("usqft");
    	String propLink=request.getParameter("udlink");
        //convert the Id into Int format
    	
    	//get the data from database of particular Id
    	
    	    Banner theBanner=new Banner();
    	    theBanner.setId(sid);
    	    theBanner.setImage(image);
    	    theBanner.setCaption1(caption1);
    	    theBanner.setCaption1(caption1);
    	    theBanner.setCaption2(caption2);
    	    theBanner.setCaption2(caption2);
    	    theBanner.setCaption3(caption3);
    	    theBanner.setCaption4(caption4);
    	    theBanner.setTypeofprop(typeofprop);
    	    theBanner.setPrice(price);
    	    theBanner.setSqft(sqft);
    	    theBanner.setPropLink(propLink);
    	  propintellectService.saveBanner(theBanner);
        return "redirect:/propintellect/showbanner";
    }
    @RequestMapping(value = "deletebaner", method = RequestMethod.GET)
    public String deleteFileFromDatabase(HttpServletRequest request) throws IllegalStateException,IOException{
    	
    	String id=request.getParameter("id");
    	int theId=Integer.parseInt(id);
    	propintellectService.delete(theId);
    	return "redirect:/propintellect/showbanner";
    }
   
    @RequestMapping("/showproducts")
 	public String showProducts(Model theModel)
 	{
             List<Product> theProduct=propintellectService.list();
      
        	 Iterator<Product> iterator = theProduct.iterator();
        		while (iterator.hasNext()) {
        			System.out.println(iterator.next());
        		}
           
      theModel.addAttribute("product",theProduct);
 		return "products";
 	}
    @RequestMapping(value = {"/showaddproducts", "add-new-products"}, method = RequestMethod.GET)
 	 public ModelAndView showAddNewProducts(ModelMap model) {
 		modelViewObj = new ModelAndView("add-new-products");
 			return  modelViewObj;
    }
 
    
    @RequestMapping( value= {"/addnewproducts","add-new-products"}, method = RequestMethod.POST)
    public String  addNewProducts(HttpServletRequest request, final @RequestParam CommonsMultipartFile [] attachFileObj)
    {
    	
    	//get the value from the form
    
    	String productType=request.getParameter("product_type");

    	String productName=request.getParameter("product_name");
    	
    	String price=request.getParameter("price");
    	
    	String []type=request.getParameterValues("type");
    	
    	String description=request.getParameter("description");
    	
    	if ((attachFileObj != null) && (attachFileObj.length > 0) && (!attachFileObj.equals(""))) {
			for (CommonsMultipartFile aFile : attachFileObj) {
				if(aFile.isEmpty()) {
					continue;
				} else {
					System.out.println("Attachment Name?= " + aFile.getOriginalFilename() + "\n");
					if (!aFile.getOriginalFilename().equals("")) {
						fileUploadObj = new FileUpload();
						fileUploadObj.setImageName(aFile.getOriginalFilename());
						fileUploadObj.setProductType(productType);
						fileUploadObj.setProductName(productName);
						fileUploadObj.setPrice(price);
						fileUploadObj.setSize(type.toString());
						fileUploadObj.setDescription(description);
						fileUploadObj.setProductData(aFile.getBytes());

						// Calling The Db Method To Save The Uploaded File In The Db
						FileUploadInDb.fileSaveInDb(fileUploadObj);
					}
				}
				System.out.println("File Is Successfully Uploaded & Saved In The Database.... Hurrey!\n");
			}
		} else {
			// Do Nothing
		}
    	return  "redirect:/propintellect/showproducts";
    }
    
    
    @RequestMapping(value = {"/editproducts", "edit-products"}, method = RequestMethod.GET)
	 public ModelAndView showEditProducts(HttpServletRequest request,ModelMap model) {
    	
    	Integer pid=Integer.parseInt(request.getParameter("pid"));
    	
    	Product theProduct=propintellectService.getProduct(pid);
    	
    	request.setAttribute("id", pid);
    	request.setAttribute("productName", theProduct.getProductName());
    	request.setAttribute("producttype", theProduct.getItemContent());
    	request.setAttribute("price", theProduct.getItemPrice());
    	request.setAttribute("size", theProduct.getSize());
    	request.setAttribute("description", theProduct.getDescription());
    
		modelViewObj = new ModelAndView("edit-products");
			return  modelViewObj;
   } 
    
    @RequestMapping( value= {"/updateproducts","add-new-products"}, method = RequestMethod.POST)
    public String  updateProducts(HttpServletRequest request, final @RequestParam CommonsMultipartFile [] attachFileObj)
    {
    	
    	//get the value from the form
    	
    	Integer pid=Integer.parseInt(request.getParameter("uid"));
    
    	String productType=request.getParameter("product_type");

    	String productName=request.getParameter("product_name");
    	
    	String price=request.getParameter("price");
    	
    	String []type=request.getParameterValues("type");
    	
    	String description=request.getParameter("description");
    	
    	if ((attachFileObj != null) && (attachFileObj.length > 0) && (!attachFileObj.equals(""))) {
			for (CommonsMultipartFile aFile : attachFileObj) {
				if(aFile.isEmpty()) {
					continue;
				} else {
					System.out.println("Attachment Name?= " + aFile.getOriginalFilename() + "\n");
					if (!aFile.getOriginalFilename().equals("")) {
						fileUploadObj = new FileUpload();
						fileUploadObj.setImageName(aFile.getOriginalFilename());
						fileUploadObj.setProductType(productType);
						fileUploadObj.setProductName(productName);
						fileUploadObj.setPrice(price);
						fileUploadObj.setSize(type.toString());
						fileUploadObj.setDescription(description);
						fileUploadObj.setProductData(aFile.getBytes());

						// Calling The Db Method To Save The Uploaded File In The Db
						//FileUploadInDb.fileUpdateInDb(fileUploadObj,pid);
						propintellectService.fileUpdateInDb(fileUploadObj);
					}
				}
				System.out.println("File Is Successfully Uploaded & Saved In The Database.... Hurrey!\n");
			}
		} else {
			// Do Nothing
		}
    	return  "redirect:/propintellect/showproducts";
    }
//
//	@RequestMapping(value = {"/showindex", "index"}, method = RequestMethod.GET)
//	 public ModelAndView showIndex(ModelMap model) {
//		modelViewObj = new ModelAndView("index");
//			return  modelViewObj;
//	 }
//    
//	@RequestMapping(value = {"/login", "login"}, method = RequestMethod.GET)
//	 public ModelAndView showloginLogin(ModelMap model) {
//		modelViewObj = new ModelAndView("login");
//			return  modelViewObj;
//	}
    
    
}
