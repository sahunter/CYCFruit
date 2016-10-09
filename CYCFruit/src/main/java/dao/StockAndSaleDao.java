package dao;

import java.util.List;

import common.dao.BaseDao;
import domain.StockAndSale;
public interface StockAndSaleDao extends BaseDao<StockAndSale>{

	void updateSale(String hql, Object...params);

	//void updateInbound(String hql, String fruitID, String inbound);

	void addSale(String hql, Object...params);

	

}
