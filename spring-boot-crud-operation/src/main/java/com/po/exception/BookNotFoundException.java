package com.po.exception;

public class BookNotFoundException extends RuntimeException {
	
	public BookNotFoundException(int id) {
		super("Could not find the book with id" + id);
	}
	

}
