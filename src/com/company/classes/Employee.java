package com.company.classes;

/**
 * Created by JPMC-B2-PC18 on 17/02/2017.
 */
public class Employee extends Person {
    private String Department;
    private String Paygrade;
    private String Employeeid;

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getPaygrade() {
        return Paygrade;
    }

    public void setPaygrade(String paygrade) {
        Paygrade = paygrade;
    }

    public String getEmployeeid() {
        return Employeeid;
    }

    public void setEmployeeid(String employeeid) {
        Employeeid = employeeid;
    }


    public String introduceYourself(String fName,String lName,int age,String address,String habbit) {
        return "Hi! I am employee.My name is " + fName +" " + lName +" " + "Im" + " " +  age + " " +  address + " " +  habbit;



            }
}
