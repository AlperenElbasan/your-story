package com.alel.yourstory.dao;

import com.alel.yourstory.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fake")
public class FakeUserDataAccessService implements UserDao{

    private static final List<User> users = new ArrayList<>();

    @Override
    public int insertUser(UUID id, User user) {
        users.add(new User(id, user.getUsername()));
        return 1;
    }

    @Override
    public List<User> listUsers() {
        return users;
    }

    @Override
    public Optional<User> getUser(UUID id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    @Override
    public Optional<User> updateUser(UUID id, String username) {
        return Optional.empty();
    }

    @Override
    public int deleteUser(UUID id) {
        return 0;
    }


}
