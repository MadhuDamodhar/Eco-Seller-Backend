package com.ecommercebackend.www.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "Seller_Info")
public class Seller {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seller_Id;
	
	@Column
	private String seller_FirstName;
	
	@Column
	private String seller_LastName;
	
	@Column
	private int seller_Age;
	
	@Column
	private String seller_Dob;
	
	
	@Column
	private String seller_Email;
	
	@Column
	private String seller_Password;
	
	@Column
	private double seller_Phone;
	
	@Column
	private String seller_Address;
	
	
	
	
	
	
	
}
