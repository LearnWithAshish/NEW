package com.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Model.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Long> {

}
