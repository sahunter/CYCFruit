package dao.impl;

import java.util.List;

import org.hibernate.Query;

import common.dao.impl.BaseDaoHibernate4;

import dao.StockAndSaleDao;
import domain.StockAndSale;

public class StockAndSaleDaoHibernate4 extends BaseDaoHibernate4<StockAndSale> implements StockAndSaleDao{

	@Override
	public void addSale(String hql, Object... params) {
		// TODO Auto-generated method stub
		Query query = 	getSessionFactory().getCurrentSession()
				.createQuery(hql);
				for(int i = 0,len = params.length ; i < len ; i++)
				{
					query.setParameter(i + "" , params[i]);
				}
			
				query.executeUpdate();	
	}

	@Override
	public void updateSale(String hql, Object... params) {
		// TODO Auto-generated method stub
		Query query = 	getSessionFactory().getCurrentSession()
				.createQuery(hql);
				for(int i = 0,len = params.length ; i < len ; i++)
				{
					query.setParameter(i + "" , params[i]);
				}
			
				query.executeUpdate();	
	}

	

	
	
}
