package com.po.repository;
import org.springframework.data.repository.CrudRepository;

import com.po.model.Books;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
