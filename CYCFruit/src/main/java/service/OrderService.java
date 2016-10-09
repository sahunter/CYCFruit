package service;

import java.util.List;

import domain.Order;


public interface OrderService
{
	// ���ͼ��
	int addOrder(Order order);

	List<Order> getAllOrders();
	
	void deleteOrder(int id);
	
	List<Order> getCustomerOrders(int id);
	
	Order getOrder(int id);

	List<Order> getAllOrdersByGroup();
}
