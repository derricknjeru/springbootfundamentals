package com.derrick.springbootfundamentals.repository;

import com.derrick.springbootfundamentals.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}