package ua.kardach.ishop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.kardach.ishop.entity.Customer;
import ua.kardach.ishop.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;

	@RequestMapping("/customer")
	public List<Customer> findAll() {
		return service.findAll();
	}

	@RequestMapping("/customer/{id}")
	public Customer findOne(@PathVariable Long id) {
		return service.findOne(id);
	}

}
