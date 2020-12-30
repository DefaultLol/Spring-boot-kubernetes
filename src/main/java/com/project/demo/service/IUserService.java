package com.project.demo.service;

import com.project.demo.entity.User;

import java.util.List;

public interface IUserService {

    public List<User> getUsers();
    public void saveUser(User user);

}
