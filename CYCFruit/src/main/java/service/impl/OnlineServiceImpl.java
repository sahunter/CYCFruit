package service.impl;


import java.util.List;

import dao.OnlineDao;

import domain.Online;
import service.OnlineService;

public class OnlineServiceImpl implements OnlineService{
	private OnlineDao onlineDao;
	public void setOnlineDao(OnlineDao onlineDao)
	{
		this.onlineDao = onlineDao;
	}
	@Override
	public int addOnline(Online online)
	{
		return (Integer) onlineDao.save(online);
	}
	
	@Override
	public List<Online> getAllOnlines()
	{
		return onlineDao.findAll(Online.class);
	}
	@Override
	public void updateOnline(Online online)
	{
		onlineDao.update(online);
	}
	@Override
	public void deleteOnline(int id)
	{
		onlineDao.delete(Online.class, id);
	}
	@Override
	public void deleteOutOnline(StringBuffer beRemove) {
		// TODO Auto-generated method stub
		onlineDao.deleteOutdateOnline(Online.class, beRemove);
	}
	/*@Override
	public List<Online> getAllOnlines(String sessionID) {
		// TODO Auto-generated method stub
		return null;
	}*/
	/*@Override
	public void updateOldOnline(String sessionID, String customer, String ip, String page, long currentTimeMillis) {
		// TODO Auto-generated method stub
		onlineDao.updateOldOnline(sessionID,customer,ip,page,currentTimeMillis)
	}*/
	
	
	@Override
	public List<Online> getOnlines(String hql, String sessionID) {
		// TODO Auto-generated method stub
		return onlineDao.findAll(hql,sessionID);
	}
	@Override
	public void updateOnline(String hql1, String page, long currentTimeMillis, String sessionID) {
		// TODO Auto-generated method stub
		onlineDao.updateOnlineById(hql1,page,currentTimeMillis,sessionID);
	}
}
