package com.Example.Library.Management.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Example.Library.Management.System.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
