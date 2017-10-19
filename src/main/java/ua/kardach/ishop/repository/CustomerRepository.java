package ua.kardach.ishop.repository;

import org.springframework.data.repository.CrudRepository;

import ua.kardach.ishop.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
