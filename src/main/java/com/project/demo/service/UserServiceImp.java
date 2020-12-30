package com.project.demo.service;

import com.project.demo.dao.UserRepo;
import com.project.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements IUserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @Override
    public void saveUser(User user) {
        userRepo.save(user);
    }
}
