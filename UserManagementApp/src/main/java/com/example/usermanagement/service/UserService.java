package com.example.usermanagement.service;
import java.util.List;
import com.example.usermanagement.entity.User;

public interface UserService {
    User createUser(User user);
    User getUser(Long id);
    List<User> getAllUsers(String searchTerm);;
    User updateUser(Long id, User user);
    void deleteUser(Long id);
}