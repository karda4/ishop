package ua.kardach.ishop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.kardach.ishop.entity.Product;
import ua.kardach.ishop.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return (List<Product>) repository.findAll();
	}
	
	public Product findOne(Long id){
		return repository.findOne(id);
	}
	
	public void save(Product product) {
		repository.save(product);
	}
}
