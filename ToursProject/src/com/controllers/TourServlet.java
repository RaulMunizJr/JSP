package com.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.beans.Tour;
import com.dao.TourDaoFactory;
import com.dao.TourData;
import com.exceptions.TourExistException;
import com.exceptions.TourIdDoesNotExistException;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/tourServlet")
public class TourServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TourServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = request.getParameter("page");

		if ("createTour".equals(page)) {
			String tourName = request.getParameter("tourname");
			String startingLocation = request.getParameter("startlocation");
			String[] placesOfInterest = request.getParameter("placeinterest").trim().split(",");
			double tourCost = Double.parseDouble(request.getParameter("tourcost"));
			//int discountPer = Integer.parseInt(request.getParameter("discount"));
			int noOfDays = Integer.parseInt(request.getParameter("tourdays"));
			
			Tour tourBean = new Tour();
			tourBean.setTourName(tourName);
			tourBean.setStartingLocation(startingLocation);
			tourBean.setPlacesOfInterest(placesOfInterest);
			tourBean.setTourCost(tourCost);
			tourBean.setDiscountPer(0);
			tourBean.setNoOfDays(noOfDays);

			TourData bookDao = TourDaoFactory.getTourFactoryInstance().getTourStorage("Oracle");

			try {
				bookDao.addTour(tourBean);
			} catch (TourExistException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			response.sendRedirect("pages/successPage.html");

			// RequestDispatcher reqDispatch =
			// request.getRequestDispatcher("successPage.html");
			// reqDispatch.forward(request, response);

		} else if ("searchBook".equals(page)) {
			String category = request.getParameter("category");

			/*TourData bookDao = TourDaoFactory.getBookFactoryInstance().getBookStorage("Oracle");
			List<Tour> bookList = bookDao.getTourByCategory(category);*/

			//request.setAttribute("bList", bookList);

			// response.sendRedirect("pages/searchBook.jsp")

			RequestDispatcher reqDispatch = request.getRequestDispatcher("pages/searchBook.jsp");
			reqDispatch.forward(request, response);

			/*
			 * HttpSession sessionObj = request.getSession();
			 * sessionObj.setAttribute("bList", bookList);
			 */
		} else if ("deleteBookPage".equals(page)) {
			int bookId = Integer.parseInt(request.getParameter("bookid"));

			/*Book bookBean = new Book();
			bookBean.setBookId(bookId);
			BookData bookDao = BookDaoFactory.getBookFactoryInstance().getBookStorage("Oracle");

			try {
				bookDao.deleteBook(bookId);
			} catch (BookIdDoesNotExistException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/

			response.sendRedirect("pages/successPage1.html");

			// RequestDispatcher reqDispatch =
			// request.getRequestDispatcher("successPage.html");
			// reqDispatch.forward(request, response);
		} else if ("updateBookPage".equals(page)) {
			int bookId = Integer.parseInt(request.getParameter("bookid"));
			String bookName = request.getParameter("name");
			String category =request.getParameter("category");
			
			/*Book bookBean = new Book();
			bookBean.setBookId(bookId);
			bookBean.setBookName(bookName);
			bookBean.setCategory(category);
			BookData bookDao = BookDaoFactory.getBookFactoryInstance().getBookStorage("Oracle");
*/
			try {
				//bookDao.updateBookDetails(bookBean);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			response.sendRedirect("pages/successPage2.html");
			
		} else if ("categoryCount".equals(page)) {
			//BookData bookDao = BookDaoFactory.getBookFactoryInstance().getBookStorage("Oracle");
			
			//Map<String, Integer> bookList = bookDao.getBookCountBasedOnBookCategory();

			//request.setAttribute("cList", bookList);

			RequestDispatcher reqDispatch = request.getRequestDispatcher("pages/catCount.jsp");
			reqDispatch.forward(request, response);

		}

	}

}
