package service;

import java.util.List;

import domain.Admin;



public interface AdminService {

	// 登录失败
			public static final int LOGIN_FAIL = 0;
			// 以普通员工登录
			public static final int LOGIN_CUS = 1;
			// 以经理登录
			public static final int LOGIN_ADMIN = 2;
	List<Admin> getAllAdmins();

	void deleteAdmin(int id);

	int addAdmin(Admin admin);
	int validLogin(Admin admin);

	void updateAdmin(Admin admin);

	void resetPassword(Admin admin);
}
