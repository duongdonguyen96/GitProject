package com.nguyen.testspring.repository;

import com.nguyen.testspring.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface TypeRepository extends JpaRepository<Type,Integer> {
}
