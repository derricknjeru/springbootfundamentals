package com.derrick.springbootfundamentals.repository;


import com.derrick.springbootfundamentals.entity.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
