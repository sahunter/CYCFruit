package domain;
import java.io.FileOutputStream;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="fruit_inf")
public class Fruit {
	@Id @Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="fruitName")
	private String fruitName;
	private double price;
	private String picture;
	/*@ManyToOne(targetEntity=FruitCategory.class)*/
	private String category;
	

	//private Order order;
	
	
//	private StockAndSale;
	
	
	
	public Fruit(String fruitname, double price, String picture, String category) {
		// TODO Auto-generated constructor stub
		this.fruitName=fruitname;
		this.price=price;
		this.picture=picture;
		this.category=category;
	}
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getFruitName()
	{
		return fruitName;
	}
	public void setFruitName(String fruitName)
	{
		this.fruitName = fruitName;
	}
	public String getPicture()
	{
		return picture;
	}
	public void setPicture(String picture)
	{
		this.picture = picture;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public String getCategory()
	{
		return category;
	}
	public void setCategory(String category)
	{
		this.category = category;
	}

}
