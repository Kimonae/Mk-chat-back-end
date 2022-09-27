package com.m2i.projetSlack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m2i.projetSlack.entity.Photo;

public interface PhotoRepository extends JpaRepository <Photo, Integer> {

}
