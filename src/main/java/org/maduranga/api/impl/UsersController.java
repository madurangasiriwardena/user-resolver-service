package org.maduranga.api.impl;

import org.maduranga.UserManager;
import org.maduranga.api.UsersApi;
import org.maduranga.model.FilterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UsersController implements UsersApi {

    UserManager userManager;

    @Autowired
    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    public ResponseEntity<FilterResponse> findRegionByLoginIdentifier(@Valid String identifier) {
        String region = userManager.searchUser(identifier);
        return ResponseEntity.ok(new FilterResponse().region(region));
    }
}
