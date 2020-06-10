package com.alel.yourstory.dao;

import com.alel.yourstory.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserDao {

    int insertUser(UUID id, User user);

    default int insertUser(User user) {
        UUID id = UUID.randomUUID();
        return insertUser(id, user);
    }

    List<User> listUsers();

    Optional<User> getUser(UUID id);

    int updateUser(UUID id, User username);

    int deleteUser(UUID id);
}
