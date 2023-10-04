package com.abhinavan.spring5webapp.repositories;

import com.abhinavan.spring5webapp.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface IAuthorRepository extends CrudRepository<Author,Long>
{

}
