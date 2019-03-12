package com.capg.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.capg.product.bean.Client;
import com.capg.product.exception.EmptyProductList;
import com.capg.product.exception.InvalidProductId;
import com.capg.product.repo.IProductRepo;


@Transactional
@Service("service")
public class ProductServiceImpl implements IProductService{
	@Autowired
	IProductRepo repo;	
	public IProductRepo getRepo() {
		return repo;
	}
	public void setRepo(IProductRepo repo) {
		this.repo = repo;
	}
	
	public Client addProduct(Client product) 
	{
		return repo.addProduct(product);
		
	}
	
	public Client updateProduct(Client product) {
		return repo.updateProduct(product);
		
	}
	
	public Client deleteProduct(String prodId) {
		return repo.deleteProduct(prodId);
	}
	
	public List<Client> getAllProduct() {
		if(repo.getAllProduct().size()==0)
		{
			throw new EmptyProductList("Product List is Empty");
		}
		return repo.getAllProduct();
	}

	public Client findProduct(String prodId) {
		if(repo.findProduct(prodId)==null)
		{
			throw new InvalidProductId("ProductId is not Present");
		}
		return repo.findProduct(prodId);
				
	}
}
