package com.po.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.po.model.Books;
import com.po.repository.BooksRepository;
//defining the business logic 
// create a service interface (using the impl , interface has all the methods of this service) 
//implement the exception handling in service (using finally block) 

@Service
public class BooksService 
{
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

public void saveOrUpdate(Books books) 
{
booksRepository.save(books);
}

public void delete(int id) 
{
booksRepository.deleteById(id);
}

public void update(Books books, int bookid) 
{
booksRepository.save(books);
}
}