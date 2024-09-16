package com.practice.service;

import com.practice.model.User;
import com.practice.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public boolean saveUser(User user) {
        userRepo.save(user);
        return true;
    }

    public List<User> getAllUsers() throws Exception {
        return userRepo.findAll();
    }
}
