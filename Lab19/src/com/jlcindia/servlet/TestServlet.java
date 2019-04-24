package com.jlcindia.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * @Author : Hunterr
 * @company : JLC
 * @see		:https://github.com/Hunterr404
 */
public class TestServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fnm = request.getParameter("fname");
		String eml = request.getParameter("email");
		boolean er = false;
		String page = "index.jsp";
		if (fnm == null || fnm.trim().length() == 0) {
			request.setAttribute("fname", "Name is Required");
			er = true;
		}
		if (eml == null || fnm.trim().length() == 0) {
			request.setAttribute("email", "Email is Required");
			er = true;
		}
		if (!er)
			page = "home.jsp";
		request.getRequestDispatcher(page).forward(request, response);
	}
}
