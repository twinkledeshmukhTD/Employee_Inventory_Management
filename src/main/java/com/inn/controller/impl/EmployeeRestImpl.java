package com.inn.controller.impl;

import com.inn.controller.IEmployeeRest;
import com.inn.model.Employee;
import com.inn.service.IEmployeeService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
@Slf4j
public class EmployeeRestImpl implements IEmployeeRest {

    @Autowired
    private IEmployeeService employeeService;

    @SneakyThrows
    @Override
    public Employee create(Employee empDetails) {
        return employeeService.create(empDetails);
    }

    @SneakyThrows
    @Override
    public Employee update(Employee empDetails) {
        return employeeService.update(empDetails);
    }

    @SneakyThrows
    @Override
    public void delete(Integer id) {
         employeeService.delete(id);
    }
}
