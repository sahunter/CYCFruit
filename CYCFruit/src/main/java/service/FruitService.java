package service;

import java.util.List;

import domain.Fruit;

public interface FruitService {

	int addFruit(Fruit fruit);

	List<Fruit> getAllFruits();

	void deleteFruit(int id);

	void updateFruit(Fruit fruit);
	
	Fruit getFruit(Integer id);

	void updateFruitById(String hql, String fruitname, double price, String category, int id);

	void updateFruitPictureById(String hql, String savePath, int id);
	
	

}
