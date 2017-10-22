package ua.kardach.ishop.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * 
 * @author Yura Kardach
 */
@Entity
public class Image implements Serializable {

	@Id
	@SequenceGenerator(name = "image_id_seq", sequenceName = "image_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "image_id_seq")
	private Long id;
	private String fileName;
}
