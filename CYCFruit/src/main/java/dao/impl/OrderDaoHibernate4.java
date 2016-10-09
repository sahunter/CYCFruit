package dao.impl;

import java.util.List;


import dao.OrderDao;

import domain.Order;
import common.dao.impl.BaseDaoHibernate4;


public class OrderDaoHibernate4 extends BaseDaoHibernate4<Order>
	implements OrderDao
{
	@Override
	public List<Order> findAllOrdersByGroup(Class<Order> class1) {
		// TODO Auto-generated method stub
		return find("select sum(o.quantity) as quantity,o.fruitID as fruitID   from Order o group by o.fruitID");
	}
}
