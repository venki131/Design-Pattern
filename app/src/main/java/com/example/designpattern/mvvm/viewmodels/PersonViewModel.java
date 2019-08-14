package com.example.designpattern.mvvm.viewmodels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;
import com.example.designpattern.mvvm.model.PersonModelMVVM;

public class PersonViewModel extends BaseObservable {
    public String name;
    private PersonModelMVVM modelMVVM;

    public PersonViewModel() {
        modelMVVM = new PersonModelMVVM("","");
    }
    public void onBtnClicked() {
        name = "Hi " + modelMVVM.getFirstName() + " " +modelMVVM.getLastName();
        setFullName();
    }

    @Bindable
    public String getFirstName() {
        return modelMVVM.getFirstName();
    }

    @Bindable
    public String getLastName() {
        return modelMVVM.getLastName();
    }

    public void setFirstName(String firstName) {
        modelMVVM.setFirstName(firstName);
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        modelMVVM.setLastName(lastName);
        notifyPropertyChanged(BR.lastName);
    }

    @Bindable
    public String getFullName() {
        return modelMVVM.getFullName();
    }

    public void setFullName() {
        modelMVVM.setFullName(name);
        notifyPropertyChanged(BR.fullName);
    }
}
