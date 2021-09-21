package com.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.PhoneNumber;

@Repository
public interface PhoneNumberRepository extends CrudRepository<PhoneNumber, Integer> {

}
