package service;

import java.util.List;



import domain.Customer;


public interface CustomerService {
	// ��¼ʧ��
		public static final int LOGIN_FAIL = 0;
		// ����ͨԱ����¼
		public static final int LOGIN_CUS = 1;
		// �Ծ����¼
		public static final int LOGIN_ADMIN = 2;
	int validLogin(Customer cus);
	void deleteCustomer(int id);
	int addCustomer(Customer customer);
	List<Customer> getAllCustomers();
	void updateCustomer(Customer customer);
	void resetPassword(Customer customer);
 boolean findPasswordISOK(Customer customer);
	 Customer getCustomer(Customer customer);;

	
}
