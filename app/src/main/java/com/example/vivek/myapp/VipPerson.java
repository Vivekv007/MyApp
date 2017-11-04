package com.example.vivek.myapp;

/**
 * Created by vivek on 04/11/17.
 */

public class VipPerson {

    private String name;
    private double creditLimit;
    private String emailId;

    public VipPerson() {
        this("Default Name", 50000.0, "Default@email.com");
    }

    public VipPerson(String name, double creditLimit) {
        this (name, creditLimit, "unknown@email.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailId() {
        return emailId;
    }

    public VipPerson(String name, double creditLimit, String emailId) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailId = emailId;


    }
}
