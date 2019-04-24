package com.jlc.jsps.beans;

import java.io.IOException;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 * @Author : Hunterr
 * @company : JLC
 * @see		:https://github.com/Hunterr404
 */
public class TestServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession ses = request.getSession();
		ServletContext ctx = ses.getServletContext();

		// 1.Strings,Wrappers and Date
		request.setAttribute("EM", "sri@jlc.com");
		ses.setAttribute("PH", new Long(12345));
		ctx.setAttribute("DOB", new Date());

		// 2.Collection of Strings, Wrappers and Date
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(new Integer(11));
		al.add(new Integer(22));
		al.add(new Integer(33));
		al.add(new Integer(44));
		al.add(new Integer(55));
		request.setAttribute("AL", al);
		String str[] = { "dd", "ss", "jlc", "sri" };
		ses.setAttribute("STR", str);

		// 3.Collection of Collections(*JSTL)
		ArrayList<ArrayList> al1 = new ArrayList<ArrayList>();
		al1.add(al);
		al1.add(al);
		al1.add(al);

		// 4.Custom or User defined class Object
		Address add = new Address("HMT Main Road", "Blore");
		Account acc = new Account(101, "SA", 99999.9, add);
		Customer cust = new Customer(99, "sri", "sri@jlc", (long) 99999.9, acc);
		ses.setAttribute("CUST", cust);

		// 5.Collection of User defined class Object
		ArrayList<Customer> cs = new ArrayList<Customer>();
		cs.add(cust);
		cs.add(cust);
		cs.add(cust);
		cs.add(cust);
		cs.add(cust);
		ses.setAttribute("CS", cs);

		// 6. Map Object
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("sid", "11");
		hm.put("sname", "sri");
		hm.put("email", "sri@jlc.com");
		ses.setAttribute("HM", hm);

		// 7.Collection of Map Object(*JSTL)
		ArrayList<HashMap<String, String>> al2 = new ArrayList<HashMap<String, String>>();
		al2.add(hm);
		al2.add(hm);
		al2.add(hm);
		request.setAttribute("AL2", al2);
		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
	}
}
