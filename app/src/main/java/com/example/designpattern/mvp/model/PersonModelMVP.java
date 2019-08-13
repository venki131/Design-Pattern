package com.example.designpattern.mvp.model;

/**
 * @Venkatesh on 15/April/2019
 * Represents model in MVP
 */
public class PersonModelMVP {
    private String firstName;
    private String lastName;

    public PersonModelMVP() {

    }

    public PersonModelMVP(String firsName, String lastName) {
        this.firstName = firsName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }
}
