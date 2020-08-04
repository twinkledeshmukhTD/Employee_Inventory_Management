package com.inn.service;

import com.inn.model.Employee;

public interface IEmployeeService {

    Employee create(Employee empDetails);

    Employee update(Employee empDetails);

    void delete(Integer id);
}
