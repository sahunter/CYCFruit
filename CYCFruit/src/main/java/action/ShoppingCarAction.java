package action;

import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import domain.Fruit;
import domain.ShoppingCar;
import service.FruitService;
import service.ShoppingCarService;

public class ShoppingCarAction extends ActionSupport {
	private ShoppingCarService shoppingCarService;
	private FruitService fruitService;

	public void setFruitService(FruitService fruitService) {
		this.fruitService = fruitService;
	}
	public void setShoppingCarService(ShoppingCarService shoppingCarService) {
		this.shoppingCarService = shoppingCarService;
	}
	
	private ShoppingCar shoppingCar;
	private List<ShoppingCar> shoppingCars;
	private int id;
	private List<Fruit> fruits; 
	
	public ShoppingCar getShoppingCar() {
		return shoppingCar;
	}
	public void setShoppingCar(ShoppingCar shoppingCar) {
		this.shoppingCar = shoppingCar;
	}

	public List<ShoppingCar> getShoppingCars() {
		return shoppingCars;
	}

	public void setShoppingCars(List<ShoppingCar> shoppingCars) {
		this.shoppingCars = shoppingCars;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public List<Fruit> getFruits() {
		return fruits;
	}
	public void setFruits(List<Fruit> fruits) {
		this.fruits = fruits;
	}

	public String add()
	{
		shoppingCar.setDate(new Date());
		// ����ҵ���߼������addBook()�����������û�����		
		int result = shoppingCarService.addShoppingCar(shoppingCar);
		if(result > 0)
		{
			addActionMessage("��ϲ������ӳɹ���");
			return SUCCESS;
		}
		addActionError("ʧ�ܣ����������룡");
		return ERROR;
	}
	public String list()
	{
		setShoppingCars(shoppingCarService.getCustomerShoppingCars(1));//����
		
		for (int i = 0; i < shoppingCars.size(); i++) {
			ShoppingCar sc=shoppingCars.get(i);
			
			fruits.add(fruitService.getFruit(sc.getFruitID()));
		}
		
		
		return SUCCESS;
	}
	public String delete()
	{
		shoppingCarService.deleteShoppingCar(id);
		
		return SUCCESS;
	}
	
	public String update()
	{
		shoppingCarService.updateShoppingCar(shoppingCar);
		
		return SUCCESS;
	}
	
	public String one()
	{
		setShoppingCar(shoppingCarService.getShoppingCar(1));//����
		
		fruits.add(fruitService.getFruit(shoppingCar.getFruitID()));
		
		return SUCCESS;
	}

}
