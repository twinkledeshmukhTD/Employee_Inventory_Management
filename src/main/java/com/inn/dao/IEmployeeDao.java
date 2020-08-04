package com.inn.dao;

import com.inn.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface IEmployeeDao extends JpaRepository<Employee , Long> {
    void deleteById(Integer id);
}
