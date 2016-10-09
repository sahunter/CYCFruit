package service;

import java.util.List;

import domain.Admin;



public interface AdminService {

	// ��¼ʧ��
			public static final int LOGIN_FAIL = 0;
			// ����ͨԱ����¼
			public static final int LOGIN_CUS = 1;
			// �Ծ����¼
			public static final int LOGIN_ADMIN = 2;
	List<Admin> getAllAdmins();

	void deleteAdmin(int id);

	int addAdmin(Admin admin);
	int validLogin(Admin admin);

	void updateAdmin(Admin admin);

	void resetPassword(Admin admin);
}
