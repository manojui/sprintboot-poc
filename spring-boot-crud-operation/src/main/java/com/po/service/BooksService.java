package com.po.service;
import java.util.List;
import com.po.model.Books;


public interface BooksService 
{
	
	// Save operation
	Books saveOrUpdate(Books books);
	
	// Read operation
	List<Books> getAllBooks();
	
	// Update operation
	Books update(Books books, int bookid);
	
	// Delete operation 
	void delete(int id);

}