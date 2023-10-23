package interface_adapter.clear_users;

// TODO Complete me

import entity.User;
import interface_adapter.ViewManagerModel;
import interface_adapter.login.LoginViewModel;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import java.util.List;

public class ClearPresenter implements ClearOutputBoundary {

    private final ClearViewModel clearViewModel;
    private ViewManagerModel viewManagerModel;
    private final LoginViewModel loginViewModel;

    public ClearPresenter(ViewManagerModel viewManagerModel,
                          ClearViewModel clearViewModel,
                          LoginViewModel loginViewModel){
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
        this.loginViewModel = loginViewModel;
    }

    @Override
    public void prepareFailView(ClearOutputData clearOutputData) {
    }

    @Override
    public void prepareSuccessView(ClearOutputData clearOutputData) {
//        clearViewModel.firePropertyChanged();
    }
}

