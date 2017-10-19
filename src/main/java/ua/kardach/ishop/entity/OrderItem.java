package ua.kardach.ishop.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * 
 * @author Yura Kardach
 */
@Entity
public class OrderItem implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@OneToOne
	private Order order;
	@OneToOne
	private Product product;
	private int amount;
	private int totalPrice;
}
