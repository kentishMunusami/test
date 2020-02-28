package com.canal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.canal.bean.User;

public interface UserDao extends JpaRepository<User, Long> {
	 User findByUsername(String username);
	 User findByEmail(String email);
}
