package com.vfislk.taining;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResgistorsServlet
 */
@WebServlet("/resgistorsservlet")
public class ResgistorsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResgistorsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		// stud_Id= request.getParameetr("stud_id");
		int id=Integer.parseInt(request.getParameter("stud_Id"));
		String city=request.getParameter("city");
		String language=request.getParameter("language");
		String hobby[]=request.getParameterValues("hobby");

		
		

		out.print("<html><body> ");
		out.print("<strong>Hello Welcome "+name+"</strong><br> ");
		out.print("<strong>stud_id :-"+id+"</strong><br> ");
		out.print("<strong>city:- "+city+"</strong><br> ");
		out.print("<strong>Language :-"+language+"</strong><br> ");
		Stream.of(hobby).forEach(out::println);

		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
