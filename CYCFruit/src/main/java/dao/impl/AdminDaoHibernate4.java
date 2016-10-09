package dao.impl;
import java.util.List;

import common.dao.impl.BaseDaoHibernate4;
import dao.AdminDao;
import domain.Admin;
public class AdminDaoHibernate4 extends BaseDaoHibernate4<Admin>
implements AdminDao
{

	@Override
	public List<Admin> findByNameAndPass(Admin admin) {
		// TODO Auto-generated method stub
		return find("select adm from Admin adm where adm.username = ?0 and adm.password=?1"
				, admin.getUserName() , admin.getPassword());
	}

	@Override
	public void resetPassword(Admin admin) {
		// TODO Auto-generated method stub
		getSessionFactory().getCurrentSession()
		.createQuery("update Admin c set password = :newpassword")
		.setString("newpassword" , admin.getNewPassword())
		.executeUpdate();
	}
}


