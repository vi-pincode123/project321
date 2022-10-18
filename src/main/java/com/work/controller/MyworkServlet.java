package com.work.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.work.bean.Mywork;
import com.work.dao.MyworkDao;
@WebServlet("/reg")
public class MyworkServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		String wname = request.getParameter("wname");
		String wplace = request.getParameter("wplace");
		String dob = request.getParameter("dob");
		String mailid = request.getParameter("mailid");
		String password = request.getParameter("password");
		String ph = request.getParameter("ph");
		Mywork mw = new Mywork();
		mw.setWname(wname);
		mw.setWplace(wplace);
		mw.setDob(dob);
		mw.setMailid(mailid);
		mw.setPassword(password);
		mw.setPassword(password);
		int i = MyworkDao.addwork(mw);
		if(i>0) {
			out.print("success");
		}else {
			out.print("failed");
		}
	}

}
