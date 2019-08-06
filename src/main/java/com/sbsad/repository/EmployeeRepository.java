package com.sbsad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbsad.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
