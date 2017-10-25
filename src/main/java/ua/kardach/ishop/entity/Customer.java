package ua.kardach.ishop.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.Getter;

/**
 * 
 * @author Yura Kardach
 */
@Entity
@Data
public class Customer implements Serializable {

	@Id
	@SequenceGenerator(name = "customer_id_seq", sequenceName = "customer_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_id_seq")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable=false, unique=true)
	private String login;
	@Column(nullable=false)
	private String password;
	private String firstName;
	private String lastName;
	private String middleName;
	private String phone;
	private String email;
	@Column(columnDefinition="SMALLINT DEFAULT 0")
	private boolean registered = false;

}
