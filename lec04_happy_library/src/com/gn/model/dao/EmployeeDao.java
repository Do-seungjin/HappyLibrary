package com.gn.model.dao;

import static com.gn.common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.gn.model.vo.Employee;

public class EmployeeDao {
	// 로그인 ====================================================
	public Employee login(String id,String pwd,Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Employee e = null;
		int result=0;
		try {
		String sql = "SELECT * FROM tbl_employee WHERE employee_id=? AND employee_pwd=? AND employee_possible = 'Y'";
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, pwd);
		
		rs = pstmt.executeQuery();
		if(rs.next()) {
			e = new Employee(rs.getInt("employee_no")
					,rs.getString("employee_id")
					,rs.getString("employee_pwd")
					,rs.getString("employee_name")
					,rs.getString("employee_possible"));
		}	
		} catch (Exception e1) {
			e1.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return e;
	}
	
	// ==============================================================
	
	
	
	
	
	
	
	
	
	
}
