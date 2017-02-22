package com.company.classes;

import java.security.PrivateKey;

/**
 * Created by JPMC-B2-PC18 on 17/02/2017.
 *
 *
 */


public class Customer extends Person {
    String Address;
    String Telephonenumber;
    String Customerid;

    //
//    public Customer() {
//    }
    public Customer() {
    }
    public Customer(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }



    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getTelephonenumber() {
        return Telephonenumber;
    }

    public void setTelephonenumber(String telephonenumber) {
        Telephonenumber = telephonenumber;
    }

    public String getCustomerid() {
        return Customerid;
    }

    public void setCustomerid(String customerid) {
        Customerid = customerid;
    }

    public String customer(String customer) {
        return "Hi" + " am " + customer;

    }

    public String introduceYourself(String fName, String lName, int food) {
        return "Hi! I am customer. My name is " + fName + lName + " " + " give me " + food + " " + "c2";

    }
}
