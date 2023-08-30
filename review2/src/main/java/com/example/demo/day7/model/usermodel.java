package com.example.demo.day7.model;

//import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="GiftShop")
public class usermodel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String userFirstName;
	private String userLastName;
	private int userMobileNumber;
	private String userEmailId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_id",referencedColumnName = "Id")
	private productsmodel products;
	public int getId() {
		return Id;
	}
	public void setUserId(int Id) {
		this.Id = Id;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public int getUserMobileNumber() {
		return userMobileNumber;
	}
	public void setUserMobileNumber(int userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}
	public String getUserEmailId() {
		return userEmailId;
	}
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}
	public productsmodel getProducts() {
		return products;
	}
	public void setProducts(productsmodel products) {
		this.products = products;
	}
	
	
}