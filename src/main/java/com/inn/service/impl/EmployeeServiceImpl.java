package com.inn.service.impl;

import com.inn.dao.IEmployeeDao;
import com.inn.model.Employee;
import com.inn.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("EmployeeServiceImpl")
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeDao employeeDao;

    @Override
    public Employee create(Employee empDetails) {
        return employeeDao.save(empDetails);
    }

    @Override
    public Employee update(Employee empDetails) {
        return employeeDao.save(empDetails);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
         employeeDao.deleteById(id);
    }
}
