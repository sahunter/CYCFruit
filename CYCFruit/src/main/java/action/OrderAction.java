package action;

import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import domain.Collection;
import domain.Fruit;
import domain.Order;
import service.FruitService;
import service.OrderService;

public class OrderAction extends ActionSupport {
	private OrderService orderService;
	private FruitService fruitService;

	public void setFruitService(FruitService fruitService) {
		this.fruitService = fruitService;
	}
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	
	private Order order;
	private List<Order> orders;
	private int id;
	private List<Fruit> fruits;
	private Fruit fruit;
	private Order orderEvaluate;
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
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
	public Order getOrderEvaluate() {
		return orderEvaluate;
	}
	public void setOrderEvaluate(Order orderEvaluate) {
		this.orderEvaluate = orderEvaluate;
	}
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	
	public String add()
	{
		order.setDate(new Date());
		// 调用业务逻辑组件的addBook()方法来处理用户请求		
		int result = orderService.addOrder(order);
		if(result > 0)
		{
			addActionMessage("恭喜您，添加成功！");
			return SUCCESS;
		}
		addActionError("添加失败，请重新输入！");
		return ERROR;
	}
	public String list()
	{
		setOrders(orderService.getCustomerOrders(1));
		for (int i = 0; i < orders.size(); i++) {
			Order sc=orders.get(i);
			
			fruits.add(fruitService.getFruit(sc.getFruitID()));
		}
		return SUCCESS;
	}
	public String delete()
	{
		orderService.deleteOrder(id);
		return SUCCESS;
	}
	
	public String evaluate()
	{
		setOrderEvaluate(orderService.getOrder(1));
		
			
			setFruit(fruitService.getFruit(orderEvaluate.getFruitID()));
		
		return SUCCESS;
	}
	
	/*public String one()
	{
		setOrder(orderService.getOrder(1));
		
			fruits.add(fruitService.getFruit(order.getFruitID()));
		
		return SUCCESS;
	}*/
}
