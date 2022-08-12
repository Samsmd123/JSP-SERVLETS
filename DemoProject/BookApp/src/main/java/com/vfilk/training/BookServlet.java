package com.vfilk.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/bookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String title=request.getParameter("title");
		int id=Integer.parseInt(request.getParameter("bookId"));
		String author=request.getParameter("author");
		String category=request.getParameter("category");
	    double price=Double.parseDouble(request.getParameter("price"));
		
	    
	    request.setAttribute("Title", title);
	    request.setAttribute("BookId", id);
	    request.setAttribute("Author", author);
	    request.setAttribute("Category", category);
	    request.setAttribute("Price", price);
	    
	    RequestDispatcher dispacher=request.getRequestDispatcher("success.jsp");
	    dispacher.forward(request, response);

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
