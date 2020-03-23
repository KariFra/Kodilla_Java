package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {

    private String[][] workers = {
            {"43728553647","John","Smith"},
            {"43586874326","Tom","Jerry"},
            {"54349698643","Terry","Weevers"},
            {"89564356784","Joanna","Bubble"},
            {"45634986547","Berta","Pickwick"}
    };
    private double[] salaries = {
            4500.90,
            4543.45,
            4538.80,
            5547.00,
            5454.00
    };
    public String getWorker(int n){
        if(n>salaries.length){
            return "";
        } return workers[n][0] + ", " + workers[n][1] + ", "+workers[n][2]+", "+salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
