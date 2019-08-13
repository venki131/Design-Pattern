package com.example.designpattern.mvvm.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.designpattern.R;
import com.example.designpattern.databinding.ActivityPersonNameMvvmBinding;
import com.example.designpattern.mvvm.view_model.PersonViewModel;

public class PersonNameMVVM extends AppCompatActivity {

    private ActivityPersonNameMvvmBinding personNameMvvmBinding;
    private PersonViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        personNameMvvmBinding = DataBindingUtil.setContentView(this, R.layout.activity_person_name_mvvm);
        viewModel = new PersonViewModel();
        personNameMvvmBinding.setHandlers(viewModel);
    }
}
