package com.po.service;
import java.util.ArrayList;
import com.po.model.Books;
import com.po.repository.BooksRepository;
import java.util.List;
//import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksServiceImpl 
	implements BooksService {

	@Autowired
	BooksRepository booksRepository;

	public List<Books> getAllBooks() 
	{
	List<Books> books = new ArrayList<Books>();
	booksRepository.findAll().forEach(books1 -> books.add(books1));
	return books;
	}

	public Books getBooksById(int id) 
	{
	return booksRepository.findById(id).get();
	}
    @Override
	public Books saveOrUpdate(Books books)
	{
	return booksRepository.save(books);
	}

	public void delete(int id) 
	{
	booksRepository.deleteById(id);
	}

	public Books update(Books books, int bookid) 
	{
	return booksRepository.save(books);
	}
}
