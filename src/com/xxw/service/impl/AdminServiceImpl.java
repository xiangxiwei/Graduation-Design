package com.xxw.service.impl;

import com.xxw.dao.AdminDao;
import com.xxw.dao.impl.AdminDaoImpl;
import com.xxw.entity.Admin;
import com.xxw.service.AdminService;

public class AdminServiceImpl implements AdminService{
private AdminDao dao = new AdminDaoImpl();
//	@Override
//	public boolean selectByName(String AdminName, String password) throws Exception {
//		Admin admin;
//		AdminDao dao=new AdminDaoImpl();
//		try {
//			admin = dao.selectById(AdminName);
//			String pwd=admin.getPassword();
//			if(!pwd.equals(password)){
//				throw new Exception("密码错误");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw new Exception("用户不存在");
//		}
//		
//		return admin;
		//return dao.index(AdminName, password);
//		 Admin admin =dao.selectByName(AdminName);
//	        if(admin!=null&&password.equals(admin.getPassword())){
//	            return true;
//	        }
//	        return false;
//	}
	@Override
	public void add(Admin admin) throws Exception {
			dao.add(admin);
		}
	@Override
	public boolean isLogain(String AdminName, String password) throws Exception {
		Admin admin = dao.selectByName(AdminName);
		if(admin!=null&&password.equals(admin.getPassword())){
            return true;
       }
        return false;
	}
	@Override
	public void edit(Admin admin) throws Exception {
		dao.edit(admin);
		
	}
}
