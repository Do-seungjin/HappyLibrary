package com.gn.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class JDBCTemplate {
	// 1. Connection 객체 생성 후 반환
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			String url = "jdbc:mariadb://127.0.0.1:3306/happy_book";
			String sqlId="scott";
			String sqlPwd="tiger";
			
			conn=DriverManager.getConnection(url,sqlId,sqlPwd);									
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
	// 2. Commit
	public static void commit(Connection conn) {
		try {
			if(conn != null && conn.isClosed()==false) {
				conn.commit();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 3.rollback
	public static void rollback(Connection conn) {
		try {
			if(conn != null && conn.isClosed() == false) {
				conn.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 4. 3가지 close
	
	public static void close(Connection conn) {
		try {
			if(conn!=null && conn.isClosed()==false) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void close(PreparedStatement pstmt) {
		try {
			if(pstmt != null && pstmt.isClosed() == false) {
				pstmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs) {
		try {
			if(rs!=null && rs.isClosed()==false) {
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
