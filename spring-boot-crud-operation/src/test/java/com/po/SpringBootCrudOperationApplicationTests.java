package com.po;

import java.util.stream.Stream;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.po.service.BooksService;
import com.po.model.Books;
import com.po.repository.BooksRepository;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class SpringBootCrudOperationApplicationTests {

	@Autowired
	private BooksService service;
	
	@MockBean
	private BooksRepository repository;
	
	@Test
	public void getBooksTest() {
		when(repository.findAll()).thenReturn(Stream
				.of(new Books(123,"CD","Rick",4000), new Books(456, "GM", "RAM", 5000)).collect(Collectors.toList()));
				assertEquals(2, service.getAllBooks().size());
	}
	
//	@Test 
//	public void getBooksbyIdTest() {
//		int id = 2;
//		when(repository.findById(id)).thenReturn(Optional.empty());
//		assertEquals(1, service.getBooksById(id));
//	}

//	@Test
//	public void saveBooksTest() {
//		Books books = new Books(4567,"Data Al", "Mick", 6000);
//		when(repository.save(books)).thenReturn(books);
//		assertEquals(books,service.saveOrUpdate(books));
//	}
	
//	@Test
//	public void deleteBooksTest() {
//		Books books = new Books(4567,"Data Al", "Mick", 6000);
//		service.delete(0);
//		verify(repository, times(1)).delete(books);
//		
//	}
}
