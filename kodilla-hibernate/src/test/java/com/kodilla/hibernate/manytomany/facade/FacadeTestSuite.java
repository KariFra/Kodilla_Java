package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class FacadeTestSuite {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Before
    public void createObjects(){
        Employee jackBlack = new Employee("Jack", "Black");
        Company apple = new Company("Apple");
        apple.getEmployees().add(jackBlack);
        jackBlack.getCompanies().add(apple);
        companyDao.save(apple);
        employeeDao.save(jackBlack);
    }

    //jak test nie rzuci bledu bedzie fail
    @Test(expected = SearchException.class)
    public void shouldThrowError(){
        //When
       List<Company> companies = companyDao.findCompaniesNameStartWithThreeLetters("bro");

       //Than
        assertEquals(0,companies.size());

    }
    @Test
    public void shouldFindCompany(){
        //When
        List<Company> companies = companyDao.findCompaniesNameStartWithThreeLetters("App");

        //Than
        assertEquals(1,companies.size());

    }

    @Test
    public void shouldFindEmployee(){
        //When
        List<Employee> employees = employeeDao.findEmployeeWithGivenSurname("Black");

        //Than
        assertEquals(1,employees.size());

    }

    @Test(expected = SearchException.class)
    public void shouldThrowErrorEmployee(){
        //When
        List<Employee> employees = employeeDao.findEmployeeWithGivenSurname("Cucambersnatch");

        //Than
        assertEquals(0,employees.size());

    }
}
