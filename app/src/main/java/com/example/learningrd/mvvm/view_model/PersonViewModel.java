package com.example.learningrd.mvvm.view_model;

import android.arch.lifecycle.ViewModel;

import com.example.learningrd.mvvm.model.PersonModelMVVM;

public class PersonViewModel extends ViewModel {
    public String name;

    public void onBtnClicked(PersonModelMVVM model) {
        name = model.getFirstName() + model.getLastName();
    }
}
