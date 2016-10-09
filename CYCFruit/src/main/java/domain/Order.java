package domain;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="order_inf")
public class Order {
	
	@Id @Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private Integer customerID;
	
	private Integer fruitID;
	private Integer quantity;
	@Temporal(TemporalType.DATE)
	private Date date;
	private String address;
	
	
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getCustomerID() {
		return customerID;
	}
	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}
	public Integer getFruitID() {
		return fruitID;
	}
	public void setFruitID(Integer fruitID) {
		this.fruitID = fruitID;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
