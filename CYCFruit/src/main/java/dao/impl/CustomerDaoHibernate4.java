package dao.impl;

import java.util.List;


import common.dao.impl.BaseDaoHibernate4;
import dao.CustomerDao;
import domain.Customer;

public class CustomerDaoHibernate4 extends BaseDaoHibernate4<Customer>
implements CustomerDao
{

	@Override
	public List<Customer> findByNameAndPass(Customer customer) {
		// TODO Auto-generated method stub
		return find("select cus from Customer cus where m.name = ?0 and m.pass=?1"
				, customer.getUserName() , customer.getPassword());
	}

	@Override
	public void resetPassword(Customer customer) {

		// TODO Auto-generated method stub
		getSessionFactory().getCurrentSession()
		.createQuery("update Customer c set password = :newpassword")
		.setString("newpassword" , customer.getNewPassword())
		.executeUpdate();
	
	}

	@Override
	public Customer getCustomer(Customer customer) {
		// TODO Auto-generated method stub
		/*return (Customer)getSessionFactory().getCurrentSession()
				.get(Customer.class , customer.getUserName());*/
		List<Customer> ml = find("select m from Customer m where m.username=?0"
				, customer.getUserName());
			if (ml != null && ml.size() > 0)
			{
				return ml.get(0);
			}
			return null;
	}
	}



