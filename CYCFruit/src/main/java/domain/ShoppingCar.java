package domain;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="shoppingCar_inf")
public class ShoppingCar {
	
	@Id @Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private Integer customerID;
	
	private Integer fruitID;
	@Temporal(TemporalType.DATE)
	private Date date;
	private Integer quantity;
	
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
