package action;

import java.util.List;
import action.base.AdminBaseAction;
import domain.Fruit;
public class FruitSearchAction extends AdminBaseAction{
	private List<Fruit> fruits;
	
	public List<Fruit> getFruits()
	{
		return fruits;
	}
	public void setFruits(List<Fruit> fruits)
	{
		this.fruits = fruits;
	}
	public String list()
	{
		setFruits(fruitservice.getAllFruits());
		return SUCCESS;
	}
	
	
	
	
	

}
