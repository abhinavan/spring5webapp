package com.abhinavan.spring5webapp.repositories;

import com.abhinavan.spring5webapp.models.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface IPublisherRepository extends CrudRepository<Publisher,Long> {
}
