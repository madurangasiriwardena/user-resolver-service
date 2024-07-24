package org.maduranga;

import org.maduranga.dao.UserManagerDAO;
import org.maduranga.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserManager {

    private UserManagerDAO userManagerDAO;

    @Autowired
    public void setUserManagerDAO(UserManagerDAO userManagerDAO) {
        this.userManagerDAO = userManagerDAO;
    }

    public String searchUser(String identifier) {

        return userManagerDAO.searchUserRegion(identifier);
    }
}
