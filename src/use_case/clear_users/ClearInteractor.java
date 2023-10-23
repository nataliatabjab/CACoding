package use_case.clear_users;

// Complete me

import entity.User;
import java.util.Map;

import java.util.List;

public class ClearInteractor {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessObject,
                           ClearOutputBoundary clearPresenter) {
        this.userDataAccessObject = clearDataAccessObject;
        this.clearPresenter = clearPresenter;
    }
    public void execute() {
        // Get all users and clear them
        Map<String, User> accounts = userDataAccessObject.getAccounts();
        // Clear the map to remove all users.
        accounts.clear();

        // Prepare an output or response for the clear operation.
        ClearOutputData clearOutputData = new ClearOutputData(false);
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}


