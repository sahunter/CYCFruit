package service.impl;
import java.util.List;

import dao.FruitCategoryDao;

import domain.FruitCategory;
import service.FruitCategoryService;
public class FruitCategoryServiceImpl implements FruitCategoryService{
private FruitCategoryDao fruitCategoryDao;
	public void setFruitCategoryDao(FruitCategoryDao fruitCategoryDao)
	{
		this.fruitCategoryDao = fruitCategoryDao;
	}

	@Override
	public int addFruitCategory(FruitCategory fruitCategory)
	{
		return (Integer) fruitCategoryDao.save(fruitCategory);
	}

	@Override
	public List<FruitCategory> getAllFruitCategorys()
	{
		return fruitCategoryDao.findAll(FruitCategory.class);
	}
	@Override
	public void updateFruitCategory(FruitCategory fruitCategory)
	{
		fruitCategoryDao.update(fruitCategory);
	}
	@Override
	public void deleteFruitCategory(int id)
	{
		fruitCategoryDao.delete(FruitCategory.class, id);
	}
	
	/*@Override
	  public String getCategoryTreeToJson() {
	    return this.createTreeJson(getAllFruitCategorys());
	  }
	*//**
	   * 创建一颗树，以json字符串形式返回
	   * @param list 原始数据列表
	   * @return 树
	   *//*
	  private String createTreeJson(List<FruitCategory> list) {
	    JSONArray rootArray = new JSONArray();
	    for (int i=0; i<list.size(); i++) {
	      FruitCategory fruitCategory = list.get(i);
	      if (fruitCategory.getSuperCategory() == null) {
	        JSONObject rootObj = createBranch(list, fruitCategory);
	        rootArray.put(rootObj);
	      }
	    }
	    
	    return rootArray.toString();
	  }
	  */
	  /**
	   * 递归创建分支节点Json对象
	   * @param list 创建树的原始数据
	   * @param currentNode 当前节点
	   * @return 当前节点与该节点的子节点json对象
	   */
	 /* private JSONObject createBranch(List<FruitCategory> list, FruitCategory currentNode) {
	    
	     * 将javabean对象解析成为JSON对象
	     
	    JSONObject currentObj = JSONObject.fromObject(currentNode);
	    JSONArray childArray = new JSONArray();
	      
	     * 循环遍历原始数据列表，判断列表中某对象的父id值是否等于当前节点的id值，
	     * 如果相等，进入递归创建新节点的子节点，直至无子节点时，返回节点，并将该
	     * 节点放入当前节点的子节点列表中
	     
	    for (int i=0; i<list.size(); i++) {
	    	FruitCategory newNode = list.get(i);
	      if (newNode.getSuperCategory()!=null && newNode.getSuperCategory().compareTo(String.valueOf(currentNode))==0  ) {
	        JSONObject childObj = createBranch(list, newNode);
	        childArray.put(childObj);
	      }
	    }
	    
	    
	     * 判断当前子节点数组是否为空，不为空将子节点数组加入children字段中
	     
	    if (!childArray.isEmpty()) {
	      currentObj.put("children", childArray);
	    }
	    
	    return currentObj;
	  }
	  
	  //getter or setter
	  public FruitCategoryDao getFruitCategoryDao() {
	    return fruitCategoryDao;
	  }
*/
	
	
	/*public String getResourceTreeToJson() {
		// TODO Auto-generated method stub
		return null;
	}*/

	
	
	
	
	
	
	
	
	
	
	
}
