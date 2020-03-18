package com.kodilla.hibernate.manytomany.facade;

public class SearchException extends Exception {

    public static String ERR_COMPANY_NOT_FOUND = "The company was not found";
    public static String ERR_EMPLOYEE_NOT_FOUND = "Employee was not found";

    public SearchException(String message){
        super(message);
    }
}
