package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public final class TaskFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(TaskFacade.class);

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee>processSearchEmployee(final String employeeNameFrag) throws SearchException{

        List<Employee> employee = employeeDao.findEmployeeWithGivenSurname(employeeNameFrag);
        LOGGER.info(employee+" is the employee you are looking for.");
        if(employee.size() == 0){
            LOGGER.error(SearchException.ERR_EMPLOYEE_NOT_FOUND);

            throw new SearchException(SearchException.ERR_EMPLOYEE_NOT_FOUND);
        }
       return employee;
    }
    public List<Company>  processSearchCompany(final String companyNameFrag) throws SearchException{

        List<Company> name = companyDao.findCompaniesNameStartWithThreeLetters(companyNameFrag);
        LOGGER.info("The company you are looking for is called: " + name);
        if(name.size() == 0){
            LOGGER.error(SearchException.ERR_COMPANY_NOT_FOUND);

            throw new SearchException(SearchException.ERR_COMPANY_NOT_FOUND);
        }
        return name;
    }


}
