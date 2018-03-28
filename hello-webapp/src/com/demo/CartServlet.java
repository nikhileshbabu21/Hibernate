package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session = request.getSession(true);
		
		String items[] = request.getParameterValues("names");
		
		ArrayList<String> sessionItems = (ArrayList<String>) session.getAttribute("basket");
		if(sessionItems == null) {
			sessionItems = new ArrayList<String>();
		}
		for(int i=0;i<items.length;i++)
			sessionItems.add(items[i]);
		
		out.println("Currently you selected the following items:");
		out.println("<ul>");
		for(int i=0;i<items.length;i++)
			out.println("<li>" + items[i]);
		out.println("</ul>");
		
		session.setAttribute("basket", sessionItems);
		
		out.println("------------------Your cart has:");
		out.println("<ul>");
		for(String str : sessionItems)
			out.println("<li>" + str);
		out.println("</ul>");
	}
}
