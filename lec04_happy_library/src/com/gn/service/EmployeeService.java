package com.gn.service;

import static com.gn.common.JDBCTemplate.close;
import static com.gn.common.JDBCTemplate.getConnection;

import java.sql.Connection;

import com.gn.model.dao.EmployeeDao;
import com.gn.model.vo.Employee;
import com.gn.view.LibraryMenu;

public class EmployeeService {
	public Employee login(String id, String pwd) {
		Connection conn = getConnection();
		int result = 0;
		
		Employee e = new EmployeeDao().login(id,pwd,conn);
		
		close(conn);
		return e;
	}
}
