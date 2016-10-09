package service.impl;

import java.util.List;

import dao.ShoppingCarDao;
import domain.ShoppingCar;
import service.ShoppingCarService;

public class ShoppingCarServiceImpl implements ShoppingCarService{
	private ShoppingCarDao shoppingCarDao;

	public void setShoppingCarDao(ShoppingCarDao shoppingCarDao) {
		this.shoppingCarDao = shoppingCarDao;
	}

	@Override
	public int addShoppingCar(ShoppingCar shoppingCar) {
		// TODO Auto-generated method stub
		return (Integer)shoppingCarDao.save(shoppingCar);
	}

	@Override
	public List<ShoppingCar> getAllShoppingCars() {
		// TODO Auto-generated method stub
		return shoppingCarDao.findAll(ShoppingCar.class);
	}

	@Override
	public void deleteShoppingCar(int id) {
		// TODO Auto-generated method stub
		shoppingCarDao.delete(ShoppingCar.class, id);
	}

	@Override
	public void updateShoppingCar(ShoppingCar shoppingCar) {
		// TODO Auto-generated method stub
		shoppingCarDao.update("update shoppingCar_inf set quantity=?0,evaluation=? where id=?1",shoppingCar.getQuantity(),shoppingCar.getId());
	}

	@Override
	public List<ShoppingCar> getCustomerShoppingCars(int id) {
		// TODO Auto-generated method stub
		return shoppingCarDao.findOne("from shoppingCar_inf where userID=?0", id);
	}

	@Override
	public ShoppingCar getShoppingCar(int id) {
		// TODO Auto-generated method stub
		return shoppingCarDao.get(ShoppingCar.class, id);
	}

}
