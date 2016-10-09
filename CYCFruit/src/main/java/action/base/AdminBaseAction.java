package action.base;

import com.opensymphony.xwork2.ActionSupport;

import service.AdminService;
import service.FruitService;
import service.OnlineService;
import service.OrderService;
import service.StockAndSaleService;

/**
 * Description:
 * <br/>ÍøÕ¾: <a href="http://www.crazyit.org">·è¿ñJavaÁªÃË</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */

public class AdminBaseAction extends ActionSupport
{
	protected AdminService adminservice;
	protected OnlineService onlineservice;
	protected FruitService fruitservice;
	protected StockAndSaleService stackandsaleservice;
	protected OrderService orderservice;
	public void setAdminService(AdminService adminservice)
	{
		this.adminservice = adminservice;
	}
	public void setOnlineService(OnlineService onlineservice)
	{
		this.onlineservice = onlineservice;
	}
	public void setFruitService(FruitService fruitservice)
	{
		this.fruitservice = fruitservice;
	}
	public void setStockAndSaleService(StockAndSaleService stackandsaleservice)
	{
		this.stackandsaleservice = stackandsaleservice;
	}
	public void setOrderService(OrderService orderservice)
	{
		this.orderservice = orderservice;
	}
}