package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="stockandsale_inf")
public class StockAndSale {
	@Id @Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	/*@OneToOne(targetEntity=Fruit.class)*/
	private int fruitID;
//	private String inbound;
	private String stock;
	private String sale;
	
	public StockAndSale(int fruitID ,  String stock,String sale)
	{
		this.fruitID = fruitID;
		this.stock = stock;
		this.sale = sale;	
	}
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	/*public String getInbound()
	{
		return inbound;
	}
	public void setInbound(String inbound)
	{
		this.inbound = inbound;
	}*/
	public int getFruitID()
	{
		return fruitID;
	}
	public void setFruitID(int fruitID)
	{
		this.fruitID = fruitID;
	}
	public String getStock()
	{
		return stock;
	}
	public void setStock(String stock)
	{
		this.stock = stock;
	}
	public String getSale()
	{
		return sale;
	}
	public void setSale(String sale)
	{
		this.sale = sale;
	}
}


