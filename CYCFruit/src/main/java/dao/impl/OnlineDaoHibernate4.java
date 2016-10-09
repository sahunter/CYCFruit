package dao.impl;

import java.util.List;

import org.hibernate.Query;

import common.dao.impl.BaseDaoHibernate4;
import dao.OnlineDao;
import domain.Online;

public class OnlineDaoHibernate4 extends BaseDaoHibernate4<Online>
implements OnlineDao{

	@Override
	public void deleteOutdateOnline(Class<Online> class1, StringBuffer beRemove) {
		// TODO Auto-generated method stub
		getSessionFactory().getCurrentSession()
		.createQuery("delete " + class1.getSimpleName()
			+ " en where en.sessionID in"+ beRemove.toString())
		.executeUpdate();
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Online> findAll(String hql, Object...params) {
		// ¥¥Ω®≤È—Ø
				Query query = getSessionFactory().getCurrentSession()
					.createQuery(hql);
				for(int i = 0,len = params.length ; i < len ; i++)
				{
					query.setParameter(i + "" , params[i]);
				}
				
				return (List<Online>)query.list();
	}

	
	@Override
	public void updateOnlineById(String hql, Object...params) {
		// TODO Auto-generated method stub
		Query query = 	getSessionFactory().getCurrentSession()
				.createQuery(hql);
				for(int i = 0,len = params.length ; i < len ; i++)
				{
					query.setParameter(i + "" , params[i]);
				}
			
				query.executeUpdate();				
	}
	/*@Override
	public void updateOldOnline(String sessionID, String customer, String ip, String page, long currentTimeMillis) {
		// TODO Auto-generated method stub
		getSessionFactory().getCurrentSession()
		.createQuery("update Online en set  en.sessionID=?0 and en.username=?1 and en.userIP=?2 and en.resource=?3 and en.time=?4 ").
		.executeUpdate();
	}*/

}
