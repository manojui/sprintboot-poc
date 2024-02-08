package com.po.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.po.model.Books;
import com.po.service.BooksService;
import org.springframework.web.bind.annotation.RequestMapping;
import com.po.exception.BookNotFoundException;

@RestController
@RequestMapping("rest/auth")

public class BooksController 
{

@Autowired
BooksService booksService;

@GetMapping("/welcome")
public String welcome() {
	return "Welcome to CRUD";
}

@GetMapping("/book")
private List<Books> getAllBooks() 
{
return booksService.getAllBooks();
}

@SuppressWarnings("unchecked")
@GetMapping("/book/{bookid}")
private ResponseEntity<String> getBooks(@PathVariable("bookid") int bookid) {
	try {
		return new ResponseEntity<String>(booksService.getBooksById(bookid), HttpStatus.OK);
	}
	catch(BookNotFoundException bookNotFoundException){
		return  new ResponseEntity<String>(bookNotFoundException.getMessage(), HttpStatus.CONFLICT);
	}
}

@DeleteMapping("/book/{bookid}")
private void deleteBook(@PathVariable("bookid") int bookid) 
{
booksService.delete(bookid);
}

@PostMapping("/books")
private int saveBook(@RequestBody Books books) 
{
booksService.saveOrUpdate(books);
return books.getBookid();
}

@PutMapping("/books")
private Books update(@RequestBody Books books) 
{
booksService.saveOrUpdate(books);
return books;
}
}
