package com.example.designpattern.mvvm.model;


public class PersonModelMVVM {
    private String firstName;
    private String lastName;
    private String fullName;

    public PersonModelMVVM(String firstName, String lastName) {
        this.firstName = firstName;
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

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
