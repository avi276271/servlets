package com.avinash;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sub")
public class SubServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Sub.sub(req, res);
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Sub.sub(req, res);
	}

	static class Sub {
		static void sub(HttpServletRequest req, HttpServletResponse res) throws IOException {
			int i = Integer.parseInt(req.getParameter("num1"));
			int j = Integer.parseInt(req.getParameter("num2"));
			int k = i - j;
			PrintWriter out = res.getWriter();
			out.println("result is " + k);
		}
	}
}
