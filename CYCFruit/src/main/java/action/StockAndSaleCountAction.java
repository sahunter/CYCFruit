package action;

import java.util.List;

import action.base.AdminBaseAction;
import domain.Fruit;
import domain.Order;
import domain.StockAndSale;

public class StockAndSaleCountAction extends AdminBaseAction{
	//private List<sale> sale;
private List<StockAndSale> stockandsale;
	
	public List<StockAndSale> getStockAndSales()
	{
		return stockandsale;
	}
	public void setStockAndSales(List<StockAndSale> stockandsale)
	{
		this.stockandsale = stockandsale;
	}
	public String list()
	{
		List<Order> orders =orderservice.getAllOrdersByGroup();
		
		String hql="update Order f set f.sale?0 where f.fruitID = ?1";
		for(Order order:orders){
		stackandsaleservice.updateSale(hql, order.getQuantity(),order.getFruitID());
		}
		
		setStockAndSales(stackandsaleservice.getAllStockAndSales());
		return SUCCESS;
	}
	
	
	
	
	
}
