package com.healthapp.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.healthapp.model.Plan;

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
		
		String planName=request.getParameter("planName");
		String category=request.getParameter("category");
		String brand=request.getParameter("brand");
		String coverage=request.getParameter("coverage");
		double sumInsured=Double.parseDouble(request.getParameter("sumInsured"));
		
		
		
		Plan plan =new Plan();
		plan.setPlanName(planName);
		plan.setBrand(brand);
		plan.setCategory(category);
		plan.setCoverage(coverage);
		plan.setSumInsured(sumInsured);
		request.setAttribute("plan", plan);
		
		
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
