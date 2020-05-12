package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class FacadeTestSuite {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    TaskFacade facade;

    @Before
    public void createObjects(){
        Employee jackBlack = new Employee("Jack", "Black");
        Company apple = new Company("Apple");
        apple.getEmployees().add(jackBlack);
        jackBlack.getCompanies().add(apple);
        companyDao.save(apple);
        employeeDao.save(jackBlack);
    }


    @Test(expected = SearchException.class)
    public void shouldThrowError() throws SearchException {
        //When
       List<Company> companies = facade.processSearchCompany("bro");

       //Than
        assertEquals(0,companies.size());

    }
    @Test
    public void shouldFindCompany() throws SearchException {
        //When
        List<Company> companies = facade.processSearchCompany("App");

        //Than
        assertTrue(companies.get(0).getName().equals("Apple"));

    }

    @Test
    public void shouldFindEmployee() throws SearchException {
        //When
        List<Employee> employees = facade.processSearchEmployee("Black");

        //Than
        assertTrue(employees.get(0).getLastname().equals("Black"));

    }

    @Test(expected = SearchException.class)
    public void shouldThrowErrorEmployee() throws SearchException {
        //When
        List<Employee> employees = facade.processSearchEmployee("Cucambersnatch");

        //Than
        assertEquals(0,employees.size());

    }
}
