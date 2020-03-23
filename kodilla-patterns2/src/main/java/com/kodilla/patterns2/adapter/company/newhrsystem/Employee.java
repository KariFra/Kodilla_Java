package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;

public class Employee {
    final private String peselId;
    final private String name;
    final private String surname;
    final private BigDecimal baseSalary;

    public Employee(String peselId, String name, String surname, BigDecimal baseSalary) {
        this.peselId = peselId;
        this.name = name;
        this.surname = surname;
        this.baseSalary = baseSalary;
    }

    public String getPeselId() {
        return peselId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (peselId != null ? !peselId.equals(employee.peselId) : employee.peselId != null) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        if (surname != null ? !surname.equals(employee.surname) : employee.surname != null) return false;
        return baseSalary != null ? baseSalary.equals(employee.baseSalary) : employee.baseSalary == null;
    }

    @Override
    public int hashCode() {
        int result = peselId != null ? peselId.hashCode() : 0;
        result = 31 * result + ( name != null ? name.hashCode() : 0 );
        result = 31 * result + ( surname != null ? surname.hashCode() : 0 );
        result = 31 * result + ( baseSalary != null ? baseSalary.hashCode() : 0 );
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "peselId='" + peselId + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
