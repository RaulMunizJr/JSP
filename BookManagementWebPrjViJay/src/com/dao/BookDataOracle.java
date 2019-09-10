package com.dao;

import java.util.List;
import java.util.Map;

import com.beans.Book;
import com.exception.BookExistException;
import com.exception.BookIdDoesNotExistException;

public class BookDataOracle implements BookData {

	@Override
	public int addBook(Book book) throws BookExistException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Book getBookDetails(int bookId) throws BookIdDoesNotExistException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBooksByCategory(String Category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteBook(int bookId) throws BookIdDoesNotExistException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBookDetails(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, Integer> getBookCountBasedOnBookCategory() {
		// TODO Auto-generated method stub
		return null;
	}

}
