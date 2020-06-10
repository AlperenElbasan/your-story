package com.alel.yourstory.service;

import com.alel.yourstory.dao.UserDao;
import com.alel.yourstory.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("fake") UserDao userDao) { this.userDao = userDao; }

    public int insertUser(User user) { return userDao.insertUser(user); }

    public List<User> getAllUsers() { return userDao.listUsers(); }

    public Optional<User> getUser(UUID id) { return userDao.getUser(id); }

    public int updateUser(UUID id, User newUser) { return userDao.updateUser(id, newUser); }

    public int deleteUser(UUID id) { return userDao.deleteUser(id); }
}
