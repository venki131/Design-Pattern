package com.example.learningrd.MVP.util;

/**
 * @Venkatesh on 15/April/2019
 * Helps us track the relationship between the view and the presenter in a central place
 */
public interface Contract {

    /**
     * represents the View in MVP
     */
    interface View {
        void showMessage(String message);
        void showError(String error);
    }

    /**
     * represents the Presenter in MVP
     */
    interface Presenter {
        void loadMessage();
        void saveName(String firstName, String lastName);
    }
}
