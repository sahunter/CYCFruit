package service.impl;

import java.util.List;

import dao.OrderDao;
import domain.Order;
import service.OrderService;

public class OrderServiceImpl implements OrderService{
	private OrderDao orderDao;

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	
	@Override
	public int addOrder(Order order) {
		// TODO Auto-generated method stub
		return (Integer)orderDao.save(order);
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return orderDao.findAll(Order.class);
	}

	@Override
	public void deleteOrder(int id) {
		// TODO Auto-generated method stub
		orderDao.delete(Order.class, id);
	}

	@Override
	public List<Order> getCustomerOrders(int id) {
		// TODO Auto-generated method stub
		return orderDao.findOne("from order_inf where userID=?0", id);
	}

	@Override
	public Order getOrder(int id) {
		// TODO Auto-generated method stub
		return orderDao.get(Order.class, id);
	}

	
	@Override
	public List<Order> getAllOrdersByGroup() {
		// TODO Auto-generated method stub	
		return orderDao.findAllOrdersByGroup(Order.class);
	}

}
