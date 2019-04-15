package com.example.learningrd.MVP.presenter;

import android.text.TextUtils;

import com.example.learningrd.MVP.model.PersonModel;
import com.example.learningrd.MVP.util.Contract;

/**
 * @Venkatesh on 15/April/2019
 * implementation of the Presenter
 */
public class SayHelloPresenter implements Contract.Presenter {

    private PersonModel mPerson; //reference for model
    private Contract.View mView; //reference for view

    public SayHelloPresenter(Contract.View view) {
        mPerson = new PersonModel();
        mView = view;
    }
    @Override
    public void loadMessage() {
        if (!TextUtils.isEmpty(mPerson.getFirstName()) && !TextUtils.isEmpty(mPerson.getLastName())) {
            String message = "Hi " + mPerson.getName() + " !";
            mView.showMessage(message);
        } else {
            mView.showError("No person name found");
        }
    }

    @Override
    public void saveName(String firstName, String lastName) {
        mPerson.setFirstName(firstName);
        mPerson.setLastName(lastName);
    }
}
