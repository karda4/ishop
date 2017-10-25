package ua.kardach.ishop.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.Data;

/**
 * 
 * @author Yura Kardach
 */
@Entity
@Data
public class Product implements Serializable {

	@Id
	@SequenceGenerator(name = "product_id_seq", sequenceName = "product_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_seq")
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private BigDecimal price;
	@Column(length = 2000)
	private String description;
	@OneToMany
	private List<Image> images;
	@OneToOne
	private ProductCategory productCategory;
	@Column(columnDefinition = "SMALLINT DEFAULT 1")
	private boolean alive;
}
