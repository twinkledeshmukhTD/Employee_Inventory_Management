package com.inn.controller;

import com.inn.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface IEmployeeRest {

    @PostMapping("create")
    Employee create(@RequestBody  Employee empDetails);

    @PostMapping("update")
    Employee update(@RequestBody Employee empDetails);

    @PostMapping("delete/{id}")
    void delete(@PathVariable(name = "id") Integer id);
}
