package dao;

import java.util.List;

import common.dao.BaseDao;
import domain.Admin;
import domain.Customer;


public interface AdminDao extends BaseDao<Admin>{

	List<Admin> findByNameAndPass(Admin admin);

	void resetPassword(Admin admin);

}
