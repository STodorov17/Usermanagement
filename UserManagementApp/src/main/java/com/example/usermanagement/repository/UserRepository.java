package com.example.usermanagement.repository;

import com.example.usermanagement.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCaseOrPhoneNumberContainingOrEmailContainingIgnoreCase(String firstName, String lastName, String phoneNumber, String email);
}