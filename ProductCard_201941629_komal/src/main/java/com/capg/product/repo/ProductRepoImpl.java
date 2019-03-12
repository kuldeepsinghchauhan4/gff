package com.capg.product.repo;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.capg.product.bean.Client;

@Transactional
@Repository("repo")
public class ProductRepoImpl implements IProductRepo {

	@PersistenceContext
	EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public Client addProduct(Client product) {
		
		entityManager.persist(product);
		return product;
	}
	
	public Client updateProduct(Client product) {
	
		if(product==null)
			return null;
		entityManager.merge(product);
		return product;
		
	}
	
	public Client deleteProduct(String prodId) {
		Client product= entityManager.find(Client.class, prodId);
		if(product==null)
			return null;
		entityManager.remove(product);
		return product;
	}
	
	public List<Client> getAllProduct() {
		TypedQuery<Client> query=entityManager.createQuery("select product from Product product ", Client.class);
		List<Client> list= query.getResultList();
		return list;
	}
	public Client  findProduct(String prodId){
		Client product= entityManager.find(Client.class, prodId);
		if(product==null)
			return null;
		product.setProdId(prodId);
		return product;
	}
}
