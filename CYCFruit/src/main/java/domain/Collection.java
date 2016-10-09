package domain;

import javax.persistence.*;


@Entity
@Table(name="collection_inf")
public class Collection {

	@Id @Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	/*@JoinColumn(referencedColumnName="user_id",nullable=false)*/
	private Integer customerID;
	/*@JoinColumn(referencedColumnName="book_id",nullable=false)*/
	private Integer fruitID;
	
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
}
