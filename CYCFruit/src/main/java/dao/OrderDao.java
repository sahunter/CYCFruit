package dao;

import java.util.List;


import domain.Order;
import common.dao.BaseDao;


public interface OrderDao extends BaseDao<Order>
{

	List<Order> findAllOrdersByGroup(Class<Order> class1);
}
