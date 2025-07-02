package com.example.usermanagement.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name = "users")
@Schema(description = "User entity")
public class User {
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "User ID", example = "1")
    private Long id;

    @NotBlank
    @Schema(description = "First name", example = "John")
    private String firstName;

    @NotBlank
    @Schema(description = "Last name", example = "Doe")
    private String lastName;

    @Past
    @Schema(description = "Date of birth", example = "1990-01-01")
    private LocalDate dateOfBirth;
    
    @Pattern(regexp = "\\+?[0-9. ()-]{7,25}")
    @Schema(description = "Phone number", example = "+359888123456")
    private String phoneNumber;

    @Email
    @Schema(description = "Email address", example = "john.doe@example.com")
    private String email;

}