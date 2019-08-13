package com.example.designpattern.mvvm.view_model;

import android.arch.lifecycle.ViewModel;

import com.example.designpattern.mvvm.model.PersonModelMVVM;

public class PersonViewModel extends ViewModel {
    public String name;

    public void onBtnClicked(PersonModelMVVM model) {
        name = model.getFirstName() + model.getLastName();
    }
}
