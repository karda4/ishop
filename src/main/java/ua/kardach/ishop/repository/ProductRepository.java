package ua.kardach.ishop.repository;

import org.springframework.data.repository.CrudRepository;

import ua.kardach.ishop.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
