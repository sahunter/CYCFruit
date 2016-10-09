package service;

import java.util.List;

import domain.StockAndSale;

public interface SaveAndSaleService {

	void deleteStockAndSale(int id);

	int addFruit(StockAndSale stockAndSale);

	List<StockAndSale> getAllStockAndSales();

	void updateStockAndSale(StockAndSale stockAndSale);

}
