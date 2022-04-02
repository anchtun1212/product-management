package com.cha.performanceappraisal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cha.performanceappraisal.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	<Optional> User findByUserName(String userName);

}
