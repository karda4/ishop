package ua.kardach.ishop.service;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import ua.kardach.ishop.entity.Customer;
import ua.kardach.ishop.repository.CustomerRepository;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {
	
	@Mock
	private CustomerRepository repository;
	@InjectMocks
	private CustomerService service;
	
	@Before
	public void init() {
		//service = new CustomerService();
	}
	
	@Test
	public void testFindAll() {
		Customer customer = new Customer();
		customer.setLogin("yura");
		Customer customer2 = new Customer();
		customer2.setLogin("john");
		List<Customer> list = new ArrayList<>(Arrays.asList(customer, customer2));
		
		when(repository.findAll()).thenReturn(list);
		
		List<Customer> customers = service.findAll();
		Assert.assertNotNull(customers);
		Assert.assertFalse(customers.isEmpty());
		Assert.assertEquals(2, customers.size());
	}
}
