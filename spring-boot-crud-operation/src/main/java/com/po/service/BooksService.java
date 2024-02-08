package com.po.service;
import java.util.List;

import org.springframework.util.MultiValueMap;

import com.po.model.Books;
import com.po.exception.BookAlreadyExistsException;
import com.po.exception.BookNotFoundException;


public interface BooksService {

	Books saveOrUpdate(Books books) throws BookAlreadyExistsException;
	
	List<Books> getAllBooks() throws BookNotFoundException;
	
	Books update(Books books, int bookid) throws BookAlreadyExistsException;;
	
	void delete(int id) throws BookNotFoundException;

	@SuppressWarnings("rawtypes")
	MultiValueMap getBooksById(int bookid);

}