package ua.kardach.ishop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.kardach.ishop.entity.Customer;
import ua.kardach.ishop.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repository;
	
	public List<Customer> findAll(){
		return (List<Customer>) repository.findAll();
	}
	
	public Customer findOne(Long id){
		return repository.findOne(id);
	}
	
	public void save(Customer customer) {
		repository.save(customer);
	}
}
