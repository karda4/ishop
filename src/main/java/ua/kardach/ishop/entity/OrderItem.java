package ua.kardach.ishop.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 * 
 * @author Yura Kardach
 */
@Entity
public class OrderItem implements Serializable {

	@Id
	@SequenceGenerator(name = "order_item_id_seq", sequenceName = "order_item_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_item_id_seq")
	private Long id;
	@OneToOne
	private Order order;
	@OneToOne
	private Product product;
	private int amount;
	private int totalPrice;
}
