package com.policywebdb.contollers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.policywebdb.model.Policy;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int  policyNumber=Integer.parseInt(request.getParameter("policyNumber"));
		String planName=request.getParameter("planName");
		double premium=Double.parseDouble(request.getParameter("premium"));
		String type=request.getParameter("type");
		int  duration=Integer.parseInt(request.getParameter("duration"));
		String category=request.getParameter("category");
		String coverage=request.getParameter("coverage");
		double sumAssured=Double.parseDouble(request.getParameter("sumAssured"));
		String brand=request.getParameter("brand");
		
		Policy policy=new Policy();
		policy.setPolicyNumber(policyNumber);
		policy.setPolicyName(planName);
		policy.setPremium(premium);
		policy.setDuration(duration);
		policy.setCateogry(category);
		policy.setCoverage(coverage);
		policy.setSumAssured(sumAssured);
		policy.setBrand(brand);
		
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
