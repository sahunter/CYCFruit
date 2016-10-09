package action;

import com.opensymphony.xwork2.ActionContext;

import action.base.AdminBaseAction;

public class StockAddAction extends AdminBaseAction{
	 private String fruitID;
	    private String stock;
	    private String getFruitID() throws Exception
		{
			return this.fruitID;
		}
		public void setFruitID(String fruitID)
		{
			this.fruitID = fruitID;
		}
		
		private String getStock() throws Exception
		{
			return this.stock;
		}
		public void setStock(String stock)
		{
			this.stock = stock;
		}
	
		
		@Override
		public String execute() throws Exception
		{
			
			ActionContext ctx = ActionContext.getContext();
			String hql="update Order f set f.stock?0 where f.fruitID = ?1";
			stackandsaleservice.updateInbound(hql,stock,fruitID);
		
			return SUCCESS;
			
		}

}
