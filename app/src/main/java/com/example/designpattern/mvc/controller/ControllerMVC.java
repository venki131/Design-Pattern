package com.example.designpattern.mvc.controller;

import com.example.designpattern.mvc.model.PersonModelMVC;

public class ControllerMVC {

    private PersonModelMVC modelMVC;

    public ControllerMVC() {
        modelMVC = new PersonModelMVC();
    }

    public void setName(String firstName, String lastName) {
        modelMVC.setFirstName(firstName);
        modelMVC.setLastName(lastName);
    }

    public String getName() {
        return modelMVC.getFirstName() + " " + modelMVC.getLastName();
    }
}
