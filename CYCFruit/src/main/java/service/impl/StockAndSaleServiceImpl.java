package service.impl;
import java.util.List;
import dao.StockAndSaleDao;
import domain.FruitCategory;
import domain.StockAndSale;
import service.StockAndSaleService;
public class StockAndSaleServiceImpl implements StockAndSaleService{
	private StockAndSaleDao stockAndSaleDao;
	public void setStockAndSaleDao(StockAndSaleDao stockAndSaleDao)
	{
		this.stockAndSaleDao = stockAndSaleDao;
	}
	@Override
	public int addFruit(StockAndSale stockAndSale)
	{
		return (Integer) stockAndSaleDao.save(stockAndSale);
	}
	@Override
	public List<StockAndSale> getAllStockAndSales()
	{
		return stockAndSaleDao.findAll(StockAndSale.class);
	}
	@Override
	public void updateStockAndSale(StockAndSale stockAndSale)
	{
		stockAndSaleDao.update(stockAndSale);
	}
	@Override
	public void deleteStockAndSale(int id)
	{
		stockAndSaleDao.delete(StockAndSale.class, id);
	}
	@Override
	public void updateSale(String hql, String fruitID, String sale) {
		// TODO Auto-generated method stub
		stockAndSaleDao.updateSale(hql,fruitID,sale);
	}
	@Override
	public void addFruit(String hql, String fruitID) {
		// TODO Auto-generated method stub
		stockAndSaleDao.addSale(hql,fruitID);
	}
	@Override
	public void updateInbound(String hql, String fruitID, String inbound) {
		// TODO Auto-generated method stub
		stockAndSaleDao.updateSale(hql,fruitID,inbound);
	}
	@Override
	public void updateSale(String hql, Integer fruitID, Integer sale) {
		// TODO Auto-generated method stub
		stockAndSaleDao.updateSale(hql,fruitID,sale);
	}

}
