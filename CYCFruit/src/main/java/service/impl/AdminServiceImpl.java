package service.impl;
import java.util.List;
import dao.AdminDao;
import domain.Admin;

import service.AdminService;
    public class AdminServiceImpl implements AdminService{
	private AdminDao adminDao;
	public void setAdminDao(AdminDao adminDao)
	{
		this.adminDao = adminDao;
	}
	@Override
	public int addAdmin(Admin admin)
	{
		return (Integer) adminDao.save(admin);
	}
	
	@Override
	public List<Admin> getAllAdmins()
	{
		return adminDao.findAll(Admin.class);
	}
	@Override
	public void updateAdmin(Admin admin)
	{
		adminDao.update(admin);
	}
	@Override
	public void deleteAdmin(int id)
	{
		adminDao.delete(Admin.class, id);
	}
	@Override
	public int validLogin(Admin admin)
	{
	
		// 如果找到一个经理，以经理登录
		/*if (customerDao.findByNameAndPass(customer).size() >= 1)
		{
			return LOGIN_CUS;
		}*/
		// 如果找到普通员工，以普通员工登录
		/*else*/ 
		if (adminDao.findByNameAndPass(admin).size() >= 1)
		{
			return LOGIN_ADMIN;
		}
		else
		{
			return LOGIN_FAIL;
		}
	}
	@Override
	public void resetPassword(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.resetPassword(admin);
	}
    }
