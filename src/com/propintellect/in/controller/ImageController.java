package com.propintellect.in.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.propintellect.in.entity.Product;
import com.propintellect.in.service.PropintellectService;



@Controller
@RequestMapping("/myImage")
public class ImageController {
  @Autowired
 private PropintellectService propintellectService;
@RequestMapping(value = "/imageDisplay", method = RequestMethod.GET)
  public void showImage(@RequestParam("pid") Integer pid, HttpServletResponse response,HttpServletRequest request) 
          throws ServletException, IOException{

    
    //Item item = itemService.get(itemId);
	Product product=propintellectService.getProduct(pid);
    response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
    response.getOutputStream().write(product.getProductData());


    response.getOutputStream().close();
}
}
