package service;

import java.util.List;

import domain.Online;

public interface OnlineService {

	int addOnline(Online online);

	List<Online> getAllOnlines();

	void updateOnline(Online online);

	void deleteOnline(int id);

	void deleteOutOnline(StringBuffer beRemove);

//	List<Online> getAllOnlines(String sessionID);

	
//	void addOnline(String sessionID, String customer, String ip, String page, long currentTimeMillis);

	List<Online> getOnlines(String hql, String sessionID);

	void updateOnline(String hql1, String page, long currentTimeMillis, String sessionID);

}
