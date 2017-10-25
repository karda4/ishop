package ua.kardach.ishop.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.Data;

/**
 * 
 * @author Yura Kardach
 */
@Entity(name="orders")
@Data
public class Order implements Serializable {

	@Id
	@SequenceGenerator(name = "orders_id_seq", sequenceName = "orders_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orders_id_seq")
	private Long id;
	@ManyToOne
	private Customer customer;
	@OneToMany
	private List<OrderItem> orderItems; 
}
