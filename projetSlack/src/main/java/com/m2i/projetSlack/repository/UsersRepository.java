package com.m2i.projetSlack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m2i.projetSlack.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
