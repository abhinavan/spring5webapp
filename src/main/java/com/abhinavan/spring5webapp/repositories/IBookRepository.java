package com.abhinavan.spring5webapp.repositories;

import com.abhinavan.spring5webapp.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface IBookRepository extends CrudRepository<Book, Long>
{
}
