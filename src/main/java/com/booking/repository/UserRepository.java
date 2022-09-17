package com.booking.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.booking.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public Optional<User> findById(String id);

	@Query("select u from User u where u.username=?1")
	public User findByUsername(String username);

}
