package dao;

import java.util.List;

import common.dao.BaseDao;
import domain.Online;

public interface OnlineDao extends BaseDao<Online>{

	void deleteOutdateOnline(Class<Online> class1, StringBuffer beRemove);

	List<Online> findAll(String hql, Object...params);

	//void updateOldOnline(String sessionID, String customer, String ip, String page, long currentTimeMillis);

	

	void updateOnlineById(String hql, Object...params);

}
