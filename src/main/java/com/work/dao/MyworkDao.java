package com.work.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.work.bean.Mywork;

public class MyworkDao {
	public static Connection getCon() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/workdb","root","rootpassword");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}

	public static int addwork(Mywork mw) {
		int status = 0;
		try {
		String sql = "insert into wrk(wname,wplace,dob,mailid,password,ph) values(?,?,?,?,?,?)";	
		PreparedStatement ps = getCon().prepareStatement(sql);
		ps.setString(1, mw.getWname());
		ps.setString(2, mw.getWplace());
		ps.setString(3, mw.getDob());
		ps.setString(4, mw.getMailid());
		ps.setString(5, mw.getPassword());
		ps.setInt(6, mw.getPh());
		status = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
