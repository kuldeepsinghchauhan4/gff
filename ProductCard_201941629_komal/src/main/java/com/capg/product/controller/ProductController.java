package com.capg.product.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.capg.product.bean.Client;
import com.capg.product.exception.EmptyProductList;
import com.capg.product.exception.InvalidProductId;
import com.capg.product.service.IProductService;



@RestController
public class ProductController {
	
	@Autowired
	IProductService service;
	
	public IProductService getService() {
		return service;
	}

	public void setService(IProductService service) {
		this.service = service;
	}
	@RequestMapping(value="/addProduct",consumes="application/json",
			produces="application/json",method=RequestMethod.POST)
	public Client addProduct(@RequestBody Client product )
	{
		product=service.addProduct(product);
		return product;

	}
	
	@RequestMapping(value="/updateProduct/{prodId}",
			produces="application/json",method=RequestMethod.PUT)
	public Client updateProduct(@PathVariable String prodId,@RequestBody Client product )
	{
		 product=service.updateProduct(product);
		return product;

	}
	
	
	
	@RequestMapping(value="/deleteProduct/{prodId}",
			produces="application/json",method=RequestMethod.DELETE)
	public Client deleteProduct(@PathVariable String prodId )
	{
		Client product=service.deleteProduct(prodId);
		return product;

	}
	
	@RequestMapping(value="/getAllProduct"
			,produces="application/json",method=RequestMethod.GET)
	public List<Client> getAllProduct() 
	{
		List<Client> list=service.getAllProduct();
		return list;

	}
	@RequestMapping(value="/findProduct/{prodId}",produces="application/json")
	public Client findProduct(@PathVariable String prodId)
	{
		Client product=service.findProduct(prodId);
		return product;
	}

	@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="ProductId is not Present")
	@ExceptionHandler({InvalidProductId.class})
	public void handleIdException()
	{
		
	}
	@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="Product List is Empty")
	@ExceptionHandler({EmptyProductList.class})
	public void handleListException()
	{
		
	}
}


