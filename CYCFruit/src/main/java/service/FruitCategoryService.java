package service;

import java.util.List;

import domain.FruitCategory;

public interface FruitCategoryService {

	int addFruitCategory(FruitCategory fruitCategory);

	List<FruitCategory> getAllFruitCategorys();

	void deleteFruitCategory(int id);

	void updateFruitCategory(FruitCategory fruitCategory);

/*	String getCategoryTreeToJson();*/

	//String getResourceTreeToJson();

}
