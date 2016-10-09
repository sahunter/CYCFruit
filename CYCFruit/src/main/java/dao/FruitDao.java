package dao;

import common.dao.BaseDao;
import domain.Fruit;
public interface FruitDao extends BaseDao<Fruit>{
	void updateFruitById(Fruit fruit, int id);

	void updateFruitById(String hql, Object...params);
}
