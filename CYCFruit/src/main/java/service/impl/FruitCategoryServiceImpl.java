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
	   * ����һ��������json�ַ�����ʽ����
	   * @param list ԭʼ�����б�
	   * @return ��
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
	   * �ݹ鴴����֧�ڵ�Json����
	   * @param list ��������ԭʼ����
	   * @param currentNode ��ǰ�ڵ�
	   * @return ��ǰ�ڵ���ýڵ���ӽڵ�json����
	   */
	 /* private JSONObject createBranch(List<FruitCategory> list, FruitCategory currentNode) {
	    
	     * ��javabean���������ΪJSON����
	     
	    JSONObject currentObj = JSONObject.fromObject(currentNode);
	    JSONArray childArray = new JSONArray();
	      
	     * ѭ������ԭʼ�����б��ж��б���ĳ����ĸ�idֵ�Ƿ���ڵ�ǰ�ڵ��idֵ��
	     * �����ȣ�����ݹ鴴���½ڵ���ӽڵ㣬ֱ�����ӽڵ�ʱ�����ؽڵ㣬������
	     * �ڵ���뵱ǰ�ڵ���ӽڵ��б���
	     
	    for (int i=0; i<list.size(); i++) {
	    	FruitCategory newNode = list.get(i);
	      if (newNode.getSuperCategory()!=null && newNode.getSuperCategory().compareTo(String.valueOf(currentNode))==0  ) {
	        JSONObject childObj = createBranch(list, newNode);
	        childArray.put(childObj);
	      }
	    }
	    
	    
	     * �жϵ�ǰ�ӽڵ������Ƿ�Ϊ�գ���Ϊ�ս��ӽڵ��������children�ֶ���
	     
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
