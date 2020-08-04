package com.inn.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.inn.util.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "employee")
@Entity
@Setter
@Getter
@ToString
public class Employee extends BaseEntity implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "employeeid_pk" ,columnDefinition = "INT")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name =  "salary")
    private Long salary;

    @Column(name = "email" ,unique = true)
    private String email;

    @Column(name = "employee_id" , unique = true)
    private String employeeId;

    //will add dept and create Dept table which will have mapping with employee table

}
