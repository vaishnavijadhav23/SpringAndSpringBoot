package org.tnsif.project.placementmanagement.services;

import org.tnsif.project.placementmanagement.entities.User;

public interface UserService {
    User createUser(User user);
    User login(String username, String password);
    void logout();
}