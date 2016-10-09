package service;

import java.util.List;

import domain.StockAndSale;

public interface StockAndSaleService {

	void deleteStockAndSale(int id);
	int addFruit(StockAndSale stockAndSale);
	List<StockAndSale> getAllStockAndSales();
	void updateStockAndSale(StockAndSale stockAndSale);
    void updateSale(String hql,Integer fruitID, Integer sale);
    void addFruit(String hql,String fruitID);
    void updateInbound(String hql,String FruitID ,String inbound);
	void updateSale(String hql, String fruitID, String sale);
  
}
