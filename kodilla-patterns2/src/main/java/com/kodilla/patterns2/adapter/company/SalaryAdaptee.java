package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.newhrsystem.CompanySalaryProcessor;
import com.kodilla.patterns2.adapter.company.newhrsystem.Employee;
import com.kodilla.patterns2.adapter.company.newhrsystem.SalaryProcesor;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee implements SalaryProcesor {
    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        CompanySalaryProcessor companySalaryProcessor = new CompanySalaryProcessor();
        return companySalaryProcessor.calculateSalaries(employees);
    }
}
