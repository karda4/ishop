package ua.kardach.ishop.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.Data;

/**
 * 
 * @author Yura Kardach
 */
@Entity
@Data
public class ProductCategory implements Serializable {

	@Id
	@SequenceGenerator(name = "product_category_id_seq", sequenceName = "product_category_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_category_id_seq")
	private Long id;
	private String name;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="parentCategoryId")
	private ProductCategory parentCategory;

	@OneToMany(mappedBy="parentCategory")
	private Set<ProductCategory> childrenCategories = new HashSet<ProductCategory>();
	
}
