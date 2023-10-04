package com.abhinavan.spring5webapp.repositories;

import com.abhinavan.spring5webapp.models.Address;
import org.springframework.data.repository.CrudRepository;

public interface IAddressRepository extends CrudRepository<Address, Long> {
}
