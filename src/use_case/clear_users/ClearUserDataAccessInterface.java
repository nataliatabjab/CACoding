package use_case.clear_users;

import entity.User;
import java.util.Map;


// Complete me
public interface ClearUserDataAccessInterface {

    void deleteUser(User user);

    Map<String,User> getAccounts();
}