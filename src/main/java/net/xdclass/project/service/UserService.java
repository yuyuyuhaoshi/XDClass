package net.xdclass.project.service;

import net.xdclass.project.domain.User;

import java.util.List;

public interface UserService {
    String login(String username, String password);
    List<User> userList();
}
