package com.capg.product.repo;
import java.util.List;
import com.capg.product.bean.Client;


public interface IProductRepo {

	public Client addProduct(Client product);
	public Client updateProduct(Client product);
	public Client deleteProduct(String prodId);
	public List<Client> getAllProduct();
	public Client findProduct(String prodId);
	
}
