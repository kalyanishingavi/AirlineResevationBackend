package com.user.api.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.api.model.User;
import com.user.api.repository.UserRepository;

//Cross allows a server to indicate any origins other than its own
@CrossOrigin(origins = { "http://localhost:4200/" })
@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	// Get Api
	@GetMapping()
	public String helloApi() {
		return "Hello!";
	}

	// Get api to check which user login
	@GetMapping("/user/login")
	public Principal user(Principal principal) {
		System.out.println("username : " + principal.getName());
		return principal;
	}

	// Post api to register user
	@PostMapping("/user/register")
	public User postUser(@RequestBody User user) {
		return userRepository.save(user);
	}

	// Get Api to fetch all user
	@GetMapping("/user")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	// Get Api to fetch api using userID
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable("id") Long id) {
		return userRepository.getById(id);
	}

	// Update Api to update user details
	@PutMapping("/user/{id}")
	public User updateUser(@PathVariable("id") Long id, @RequestBody User user) {

		@SuppressWarnings("deprecation")
		User u = userRepository.getById(id);

		if (user.getUsername() != null) // if name is not null
			u.setUsername(user.getUsername()); // then get old name and set new name
		if (user.getGender() != null)
			u.setGender(user.getGender());
		if (user.getPhone() != null)
			u.setPhone(user.getPhone());
		if (user.getEmail() != null)
			u.setEmail(user.getEmail());
		if (user.getPassword() != null)
			u.setPassword(user.getPassword());

		return userRepository.save(u);
	}

	// Delete Api to delete user
	@DeleteMapping("/user/{id}")
	public User deleteUser(@PathVariable("id") Long id) {
		userRepository.deleteById(id);
		return null;
	}

}
