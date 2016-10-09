package domain;
import java.util.HashSet;

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
@Table(name="fruitcategory_inf")
public class FruitCategory {
	@Id @Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="name")
  
	private String name;
	private String superCategory;
	 /*@OneToMany(targetEntity=Fruit.class,mappedBy="FruitCategory",cascade=CascadeType.ALL)*/
	// private Set<Fruit> Fruits=new HashSet<>();
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getSuperCategory()
	{
		return superCategory;
	}
	public void setSuperCategory(String superCategory)
	{
		this.superCategory = superCategory;
	}
	
}
