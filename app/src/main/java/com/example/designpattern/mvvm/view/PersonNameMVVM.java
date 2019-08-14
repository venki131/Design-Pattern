package com.example.designpattern.mvvm.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.designpattern.R;
import com.example.designpattern.databinding.ActivityPersonNameMvvmBinding;
import com.example.designpattern.mvvm.viewmodels.PersonViewModel;

public class PersonNameMVVM extends AppCompatActivity {

    private ActivityPersonNameMvvmBinding personNameMvvmBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        personNameMvvmBinding = DataBindingUtil.setContentView(this, R.layout.activity_person_name_mvvm);
        personNameMvvmBinding.setViewModel(new PersonViewModel());
        personNameMvvmBinding.executePendingBindings();

    }
}
