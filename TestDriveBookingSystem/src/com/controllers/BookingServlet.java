package com.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.beans.Booking;
import com.dao.BookingDataOracle;

/**
 * Servlet implementation class BookingServlet
 */
@WebServlet("/BookingServlet")
public class BookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");

		if ("addBooking".equals(page)) {
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			String driversLicense = request.getParameter("dlnumber");
			String vehicleMake = request.getParameter("vmake");
			String driveDate = request.getParameter("drivedate");
			

			Booking bookBean = new Booking(id, name, driversLicense, vehicleMake, driveDate);
			
			BookingDataOracle book = new BookingDataOracle();
			book.addBooking(bookBean);
		
			response.sendRedirect("pages/confirmation.jsp");

			// RequestDispatcher reqDispatch =
			// request.getRequestDispatcher("successPage.html");
			// reqDispatch.forward(request, response);

		} else if ("searchBook".equals(page)) {
			String drivedate = request.getParameter("drivedate");

			BookingDataOracle book = new BookingDataOracle();
			List<Booking> bookList = book.getBooksByDate(drivedate);

			request.setAttribute("bList", bookList);

			// response.sendRedirect("pages/searchBook.jsp")

			RequestDispatcher reqDispatch = request.getRequestDispatcher("pages/viewBookings.jsp");
			reqDispatch.forward(request, response);

			
			 /*HttpSession sessionObj = request.getSession();
			 sessionObj.setAttribute("bList", bookList);*/
			 
		}
	}

}
