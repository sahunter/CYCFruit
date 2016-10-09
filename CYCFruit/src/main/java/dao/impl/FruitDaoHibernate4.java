package dao.impl;

import common.dao.impl.BaseDaoHibernate4;
import org.hibernate.Query;
import dao.FruitDao;
import domain.Fruit;

public class FruitDaoHibernate4 extends BaseDaoHibernate4<Fruit> implements FruitDao{
	@Override
	public void updateFruitById(Fruit fruit, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateFruitById(String hql, Object...params) {
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
