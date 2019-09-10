package com.dao;

import java.util.List;
import java.util.Map;

import com.beans.Tour;
import com.exceptions.TourExistException;
import com.exceptions.TourIdDoesNotExistException;

public interface TourData {
	public int addTour(Tour tour) throws TourExistException;
	/*public Book getBookDetails(int bookId) throws BookIdDoesNotExistException;
	public List<Book> getBooksByCategory(String Category);
	public int deleteBook(int bookId) throws BookIdDoesNotExistException;
	public int updateBookDetails(Book book);
	public Map<String, Integer> getBookCountBasedOnBookCategory();*/
}
