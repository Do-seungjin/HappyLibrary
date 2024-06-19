package com.gn.controller;

import com.gn.model.vo.Employee;
import com.gn.service.EmployeeService;
import com.gn.view.LibraryMenu;

public class EmployeeController {
	public void login(String id,String pwd) {
		int result = 0;
		Employee e = new EmployeeService().login(id,pwd);
		
		String work="로그인";
		if(e==null) {
			new LibraryMenu().displayFail(work);			
		}else {
			String user_id = e.getEmployee_id();
			if(user_id.equals("관리자")) {
				
				new LibraryMenu().loginAdmin(e);
			}else {
				
				new LibraryMenu().loginUser(e);
			}
		}
	}
	
	
}
